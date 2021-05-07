package com.xe.test;

public class Test {

	public static void main(String[] args) {
        Structure s = new Structure();
        s.add(new Element1());
        s.add(new Element2());
        System.out.println("调用具体访问者 Concrete1------------------------");
        IVisitor visitor = new Concrete1();
        s.accept(visitor);
        System.out.println("调用具体访问者 Concrete2------------------------");
        visitor = new Concrete2();
        s.accept(visitor);
	}

}
