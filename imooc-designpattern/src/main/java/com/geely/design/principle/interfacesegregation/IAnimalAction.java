package com.geely.design.principle.interfacesegregation;

/**
 * Created by geely
 * IAnimalAction 定义了太多的方法，可细分为{@link IEatAnimalAction,IFlyAnimalAction,ISwimAnimalAction}
 */
public interface IAnimalAction {
    void eat();

    void fly();

    void swim();

}
