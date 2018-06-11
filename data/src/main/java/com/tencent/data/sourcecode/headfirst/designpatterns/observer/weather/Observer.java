package com.tencent.data.sourcecode.headfirst.designpatterns.observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
