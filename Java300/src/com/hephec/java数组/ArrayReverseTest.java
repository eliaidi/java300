package com.hephec.javaÊı×é;

import java.util.Arrays;

import org.junit.Test;

public class ArrayReverseTest {

	static int[] array=new int[]{1,2,3,4,5,6};
	static int len=array.length-1;
	public static void main(String[] args) {
		
		for (int i = 0,j=len; i <Math.ceil(len/2)+1 ; i++,j--) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
	
	@Test
	public void testMathRound(){
		System.out.println(Math.round(11/2));
	}
	
}
