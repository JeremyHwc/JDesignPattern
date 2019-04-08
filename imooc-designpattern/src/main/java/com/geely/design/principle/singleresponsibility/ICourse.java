package com.geely.design.principle.singleresponsibility;

/**
 * Created by geely
 * 这个接口有两块职责，不满足单一职责原则，应该分为两个接口 {@link ICourseContent}{@link ICourseContent}
 */
public interface ICourse {
    //获取课程信息
    String getCourseName();
    byte[] getCourseVideo();

    //管理课程
    void studyCourse();
    void refundCourse();

}
