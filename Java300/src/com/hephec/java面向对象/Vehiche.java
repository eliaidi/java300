package com.hephec.java面向对象;

/**
 * 定义一个交通工具(Vehicle)的类，其中有：
 * 	属性：速度(speed),体积（size）等
 * 	方法:移动（move()）,设置速度(setSpedd(int speed)),加速speedUp(),减速speedDown()等方法
 * 
 * 
 * */

public class Vehiche {
	
	//构造方法
	public Vehiche() {
		// TODO Auto-generated constructor stub
	}
	Vehiche(double speed,double size){
		this.speed=speed;
		this.size=size;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	private double speed;
	private double size;
	
	public void move(int x,int y){
		
	}
	//加速的方法
	public double speedUp(){
		setSpeed(speed+10);
		return getSpeed();
	}
	//减速的方法
	public double speedDown(){
		setSpeed(speed-10);
		return getSpeed();
	}
	
	public static void main(String[] args) {
		//测试方法...省略
	}
	
}
