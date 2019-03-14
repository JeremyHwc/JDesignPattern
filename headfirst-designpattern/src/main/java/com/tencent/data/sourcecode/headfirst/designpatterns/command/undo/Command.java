package com.tencent.data.sourcecode.headfirst.designpatterns.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
