package com.sample.training;

public class TestClass {

	public String test() throws Exception{
		int a;
		try{
		a= 8/0;
		}catch (Exception e){
			return "catch";
		}finally {
			return "finally";
		}
		//return "last";
	}
	public String test2() throws Exception{
		int a;
		try{
			a= 8;
			return "try";
		}catch (Exception e){
			return "catch";
		}finally {
			return "finally";
		}
	}
	
		public long add(long a,long b){
			return a+b;
		}
		public long add(int a,long b)
		{
			return a+b;
		}
		//long l= t1.add(7,8l);
		//long l=t1.add(7,8)
		
//		public double add(float a,float b)
//		{
//		return a+b;
//		}
//		public long add(long a,long b){
//		return a+b;
//		}
		// double l= t1.add(7,8l);
		// double l= t1.add(d,d1);
		//t1.add(4,5);
	
	public static void main(String[] args) throws Exception {
		TestClass tc = new TestClass();
		String str = tc.test2();
		System.out.println(str);
		long l=tc.add(7, 8l);
		long l2=tc.add(7,8);
		//System.out.println(l);
//		double l3= tc.add(7,8l);
//		double l5= tc.add(4l,5l);
		//double l4= tc.add(1.0f,2.5f);
		System.out.println("L5: "+l2);

	}

}
