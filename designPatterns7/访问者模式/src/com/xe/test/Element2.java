package com.xe.test;

public class Element2 implements IElement{
	@Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
	
    public String operation() {
        return "调用 Element2 类的 operation 方法";
    }
}
