package com.watermelon.state2;

/**
 * @author: zhujiashuai
 * @date: 2021/11/30
 */
public enum State {

    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}