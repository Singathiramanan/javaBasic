package com.ramanan;
class Sample
{
	void area(int b,int h){
		double a=1.0/2*b*h;
		System.out.println(a);
	}void area(int a,short b){
		final double pi= 3.142;
		double res=pi*a*b;
		System.out.println(res);
	}void area(int a){
		int res=a*a;
		System.out.println(res);
	}void area(int w,double h){
		double res=w*h;
		System.out.println(res);
	}
}
public class Areaoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample a1=new Sample();
		a1.area(5,6);
		a1.area(5,10);
		a1.area(4);
		a1.area(5,4.0);
		
	}

}
