package com.hephec.java面向对象;

/**
 * 使用静态内部类获取数组中的最大和最小值
 * 如果想创建一个内部类对象而不希望引用外部类的对象，可以把一个内部类定义为static类型
 * 
 * */
public class MaxMin {
	
	public static class Result{
		private int max;
		public int getMax() {
			return max;
		}
		public void setMax(int max) {
			this.max = max;
		}
		public int getMin() {
			return min;
		}
		public void setMin(int min) {
			this.min = min;
		}
		private int min;
		public Result() {
			// TODO Auto-generated constructor stub
		}
		Result(int max,int min){
			this.max=max;
			this.min=min;
		}
	} 
	//获取静态内部了对象
	public static Result getResult(int[] array){
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(i>max){
				max=i;
			}
			if(i<min){
				min=i;
			}
		}
		return new Result(max, min);
	}
}
