package com.zhulu.test;
/**
 * 测试状态模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
        HomeContext home = new HomeContext();
        home.setState(new CheckedInState());
        home.setState(new BookedState());
        home.setState(new FreeState());
        State state = home.getState();
        state.handle();
	}

}
