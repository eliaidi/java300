package com.hephec.java�������;

/**
 * ʹ�þ�̬�ڲ����ȡ�����е�������Сֵ
 * ����봴��һ���ڲ���������ϣ�������ⲿ��Ķ��󣬿��԰�һ���ڲ��ඨ��Ϊstatic����
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
	//��ȡ��̬�ڲ��˶���
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
