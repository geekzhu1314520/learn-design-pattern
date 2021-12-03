package com.watermelon.state2;

/**
 * @author: zhujiashuai
 * @date: 2021/11/30
 */
public interface IMario {

    State getName();

    void obtainMushRoom(MarioStateMachine stateMachine);

    void obtainCape(MarioStateMachine stateMachine);

    void obtainFireFlower(MarioStateMachine stateMachine);

    void meetMonster(MarioStateMachine stateMachine);

}
