package com.chess.online.game.controller;

public interface BoardView {
    boolean isEmpty(Square square);
    Figure getFigureAt(Square square);
}

