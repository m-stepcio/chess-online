package com.chess.online.game.controller;

import com.chess.online.game.controller.enums.Color;

import java.util.List;

public interface Figure {
    Square getPosition();
    List<Square> getAvailabeMoves(BoardView boardView);
    Color getColor();
}
