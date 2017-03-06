package com.codetest.algo;

import java.util.*;

public class MyStack {
	private LinkedList<Object> list = new LinkedList<Object>();

	public void push(Object o) {
		list.addFirst(o);
	}

	public Object top() {
		return list.getFirst();
	}

	public Object pop() {
		return list.removeFirst();
	}

	public static void main(String args[]) {
		Integer myCar;
		MyStack s = new MyStack();
		s.push(4);	s.push(6);	s.push(7);	s.push(8);
		myCar = (Integer) s.pop();
		System.out.println(myCar);
		System.out.println((Integer) s.top());
	}
}