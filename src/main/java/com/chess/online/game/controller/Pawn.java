package com.chess.online.game.controller;

import com.chess.online.game.controller.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Figure{
    private Square currentPosition;
    private boolean hasMoved;
    private Color color;

    public Pawn(Square initialPosition, Color color){
        this.currentPosition = initialPosition;
        this.hasMoved = false;
        this.color = color;
    }

    @Override
    public Square getPosition() {
        return currentPosition;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public List<Square> getAvailabeMoves(BoardView boardView) {
        List<Square> availableMoves = new ArrayList<>();

        Square square = createMoveIfPossible(1, boardView);
        if(square != null){
            availableMoves.add(square);
            if(!hasMoved){
                Square twoStepMove = createMoveIfPossible(2, boardView);
                if(twoStepMove != null){
                    availableMoves.add(twoStepMove);
                }
            }
        }

        return availableMoves;
    }

    private void addCaptureMoves(BoardView boardView, List<Square> availableMoves){
        Square square = this.currentPosition.createFromCurrent(1, 1);
        if(!boardView.isEmpty(square)){
            Figure figureOnSquare = boardView.getFigureAt(square);
            if(!this.color.equals(figureOnSquare.getColor())){
                availableMoves.add(square);
            }
        }
    }

    private Square createMoveIfPossible(int forward, BoardView boardView){
        Square square = currentPosition.createForwardFromCurrent(forward);
        if(boardView.isEmpty(square)){
            return square;
        }
        return null;
    }
}
