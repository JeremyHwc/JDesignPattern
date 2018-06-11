package com.tencent.data.sourcecode.headfirst.designpatterns.iterator.transition;

import java.util.Iterator;

public interface Menu {
	public Iterator<?> createIterator();
}
