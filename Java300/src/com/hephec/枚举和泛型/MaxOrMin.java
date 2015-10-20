package com.hephec.枚举和泛型;

public interface MaxOrMin<T extends Comparable<T>> {
		//创建一个泛型接口
		//定义两个泛型方法,min(),max()
	T min();
	T max();

}
