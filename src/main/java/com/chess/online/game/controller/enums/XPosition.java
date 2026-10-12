package com.chess.online.game.controller.enums;

public enum XPosition {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8);

    private final int intValue;

    XPosition(int intValue) {
        this.intValue = intValue;
    }

    public XPosition fromIntValue(int value){
        //todo implement this
        return A;
    }

    public XPosition add(int delta){
        return fromIntValue(this.intValue + delta);
    }
}
