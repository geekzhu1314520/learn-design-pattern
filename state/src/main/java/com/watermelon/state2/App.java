package com.watermelon.state2;

/**
 * @author: zhujiashuai
 * @date: 2021/12/3
 */
public class App {

    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState().getName();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
