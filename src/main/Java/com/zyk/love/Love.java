package com.zyk.love;

public class Love {

    static int cold = 1;
    static int weather = 1;
    static int winter = 1;
    public static void main(String[] args) {
        Lover you = new Lover();
        Lover me = new Lover();

        // 如果冬天里你的手是冰冷的
        if (you.myHand.temperature == cold && weather == winter) {
            // 将我手上的温度全部给予你
            giveyoulove(me.myHand.temperature, you.myHand.temperature);
            // 换取你幸福的脸庞
            getYourHappyFace(you);
        }
    }


    static void giveyoulove(int mytemperature, int yourtemperature) {

    }

    static void getYourHappyFace(Lover you) {

    }
}
