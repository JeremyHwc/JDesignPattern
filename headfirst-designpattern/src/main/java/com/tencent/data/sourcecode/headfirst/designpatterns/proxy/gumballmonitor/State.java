package com.tencent.data.sourcecode.headfirst.designpatterns.proxy.gumballmonitor;

import java.io.*;

public interface State extends Serializable {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}