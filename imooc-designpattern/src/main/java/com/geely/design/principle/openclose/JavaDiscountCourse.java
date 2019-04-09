package com.geely.design.principle.openclose;

/**
 * Created by geely
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /*@Override
    public Double getPrice() {//如果这样写的话，就不满足里式替换原则
        return super.getPrice() * 0.8;
    }*/

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }

}
