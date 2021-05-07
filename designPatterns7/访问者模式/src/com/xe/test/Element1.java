package com.xe.test;

public class Element1 implements IElement{
	@Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
    public String operation() {
        return "调用 Element1 类的 operation 方法";
    }
}
