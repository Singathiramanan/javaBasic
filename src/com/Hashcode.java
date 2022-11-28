package com;

public class Hashcode {
	    public int hashCode(){
		return(123);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashcode h=new Hashcode();
		//System.out.println(h);
		System.out.println(h.hashCode());
		System.out.println(System.identityHashCode(h));
	}

}
