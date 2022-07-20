package com.globallogic.training.collections;

class Student<T1,T2,T3,T4,T5>{
	T1 a;
	T2 b;
	T3 c;
	T4 d;
	T5 e;
	public Student() {
	}
	public Student(T1 a, T2 b, T3 c, T4 d, T5 e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + "]";
	}
}

public class Generics {
	public static void main(String[] args) {
		Student<String, String, Integer, Character, Integer> s1 = new Student<>("Saurabh","Singh",24,'J',4);
		Student<String, Integer, Integer, String, Integer> s2 = new Student<>("Saurabh",111,24,"Java",4);
		Student<String, String, Integer, Float, Integer> s3 = new Student<>("Saurabh","Singh",24,4.04f,4);
		Student s4=new Student("A",'a',1,1.4,false);
		Student s5=new Student();
		s5.a=34;
		s5.b="skdgj";
		s5.c='$';
		s5.d=true;
		s5.e=2.75f;
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
	}
}