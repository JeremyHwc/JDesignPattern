package com.tencent.data.sourcecode.headfirst.designpatterns.decorator.starbuzz;

/**
 * 被装饰者和装饰者共同的父类，这里用到继承的重点在于装饰者和被装饰者必须是一样的类型，也就是共同的超类，这是相当关键的地方，也就是有共同的超类，
 * 这里利用继承达到“类型匹配”，而不是利用继承获得“行为”。
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
