package com.myproject.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.myproject.guice.MyGuiceImpl;
import com.myproject.rest.RestHandler;

public class Test {

	public static void main(String[] args) {

		  Injector i= Guice.createInjector(new MyGuiceImpl());
		  RestHandler rh = i.getInstance(RestHandler.class);
		  rh.getDetails();

	}

}
