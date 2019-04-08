package com.geely.design.principle.singleresponsibility;

/**
 * Created by geely
 * 该类的封装就不满足单一职责原则
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else{
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
