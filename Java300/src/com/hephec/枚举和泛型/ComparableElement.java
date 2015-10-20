package com.hephec.枚举和泛型;

/**
 * 声明一个ComparableElement基础与Comparable类并实现MaxOrMin接口
 * */
public class ComparableElement<T extends Comparable<T>> implements MaxOrMin<T> {
	T[] mm;
	ComparableElement(T[] ob){
		this.mm=ob;
	}
	
	
	@Override
	public T min() {
		T t=mm[0];
		for (int i = 0; i < mm.length; i++) {
			if(mm[i].compareTo(t)<0){
				t=mm[i];
			}
		}
		return t;
	}
	

	@Override
	public T max() {
		T t=mm[0];
		for (int i = 0; i < mm.length; i++) {
			if(t.compareTo(mm[i])<0){
				t=mm[i];
			}
		}
		return t;
	}

}
