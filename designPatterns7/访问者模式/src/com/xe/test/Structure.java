package com.xe.test;

import java.util.ArrayList;
import java.util.List;

public class Structure {
    private List<IElement> list = new ArrayList<IElement>();
    
    public void accept(IVisitor visitor) {
        IElement element = null;
        for (int i = 0; i < list.size();i++) {
        	element = list.get(i);
        	element.accept(visitor);
        }
    }
    
    public void add(IElement element) {
        list.add(element);
    }
    
    public void remove(IElement element) {
        list.remove(element);
    }
}
