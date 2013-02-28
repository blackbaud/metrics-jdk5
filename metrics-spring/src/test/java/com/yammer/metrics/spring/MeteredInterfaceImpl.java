package com.yammer.metrics.spring;

public class MeteredInterfaceImpl implements MeteredInterface {

	
	public boolean timedMethod() {
		return true;
	}

	
	public boolean meteredMethod() {
		return true;
	}

	
	public void exceptionMeteredMethod() throws Throwable {
		throw new BogusException();
	}

}