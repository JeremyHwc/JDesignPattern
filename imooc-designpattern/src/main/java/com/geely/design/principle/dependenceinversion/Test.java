package com.geely.design.principle.dependenceinversion;

/**
 * Created by geely
 */
public class Test {

    //v1 面向实现编程，违背了依赖倒置的原则
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//    }

    //v2  接口方法形式注入
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new PythonCourse());
//    }

    //v3 构造器方式注入，弊端，一个对象只能学习一个课程，如果需要学习其他课程，又需要构造新的对象
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();
//    }

    //v4 set方法的形式注入，这样避免了v3的弊端
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();

    }


}
