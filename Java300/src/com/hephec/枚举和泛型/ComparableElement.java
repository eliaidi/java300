package com.hephec.ö�ٺͷ���;

/**
 * ����һ��ComparableElement������Comparable�ಢʵ��MaxOrMin�ӿ�
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
