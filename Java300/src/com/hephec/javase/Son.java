package com.hephec.javase;

public class Son extends Father{
	SonProp r=new SonProp();
	Son(){
		System.out.println("Son");
	}
}
class Father{
	FatherProp fp=new FatherProp();
	public Father() {
		System.out.println("Father");
	}
}
class FatherProp{
	FatherProp(){
		System.out.println("FatherPorp");
	}
}
class SonProp{
	SonProp(){
		System.out.println("SonProp");
	}
}