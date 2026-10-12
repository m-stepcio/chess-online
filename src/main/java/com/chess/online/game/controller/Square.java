package com.chess.online.game.controller;

import com.chess.online.game.controller.enums.XPosition;

public class Square {
    private int y;
    private XPosition x;

    public Square(int y, XPosition x){
        this.y = y;
        this.x = x;
    }

    public Square createForwardFromCurrent(int forward){
        return new Square(this.y+forward, this.x);
    }

    public Square createFromCurrent(int yDelta, int xDelta){
        return new Square( y+yDelta, x.add(xDelta));
    }
}
