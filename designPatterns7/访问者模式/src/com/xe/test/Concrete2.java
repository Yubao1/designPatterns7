package com.xe.test;

public class Concrete2 implements IVisitor{
	private static final String TAG = "Concrete2 类的 visit 方法-->";
    @Override
    public void visit(Element1 element) {
    	String msg = TAG + element.operation();
        System.out.println(msg);
    }
    
    @Override
    public void visit(Element2 element) {
    	String msg = TAG + element.operation();
        System.out.println(msg);
    }
}
