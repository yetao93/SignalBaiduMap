package com.fwq.domain;

public class Bounds {
	private double leftLng;
	private double rightLng;
	private double upLat;
	private double downLat;
	public double getLeftLng() {
		System.out.println("getLeftLng");
		return leftLng;
	}
	public void setLeftLng(double leftLng) {
		System.out.println("setLeftLng");
		this.leftLng = leftLng;
	}
	public double getRightLng() {
		System.out.println("getRightLng");
		return rightLng;
	}
	public void setRightLng(double rightLng) {
		System.out.println("setRightLng");
		this.rightLng = rightLng;
	}
	public double getUpLat() {
		System.out.println("getUpLat");
		return upLat;
	}
	public void setUpLat(double upLat) {
		System.out.println("setUpLat");
		this.upLat = upLat;
	}
	public double getDownLat() {
		System.out.println("getDownLat");
		return downLat;
	}
	public void setDownLat(double downLat) {
		System.out.println("setDownLat");
		this.downLat = downLat;
	}
	
}
