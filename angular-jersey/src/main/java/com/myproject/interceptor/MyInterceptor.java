package com.myproject.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("method " + invocation.getMethod() + " is called on " + invocation.getThis() + " with args "
				+ invocation.getArguments());

		Object ret = invocation.proceed();
		System.out.println("method " + invocation.getMethod() + " returns " + ret);

		return ret;
	}

}
