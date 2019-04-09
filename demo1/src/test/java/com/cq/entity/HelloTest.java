package com.cq.entity;

import org.junit.Test;

public class HelloTest {
	Hello hello = new Hello();
	@Test
    public void say(){
    	hello.say("mary");
    }
	@Test
	public void out(){
		System.out.println(hello.out());
	}
}
