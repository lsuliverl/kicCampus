package com.it.study.helper;

/*
 * 기본적인 공통 기능들을 묶여 놓은 클래스
 */
public class Util {
	// 싱글톤 객체 생성 시작
	private static Util current; 
    
    public static Util getInstance() {
    	if(current == null) {
        	current = new Util();
        }
        return current;
    }

    public static void freeInstance() {
    	current = null;
    }
    // 싱글톤 객체 생성 종료
	public int random(int min, int max) {
		int num
		= (int)((Math.random() * (max-min + 1)) + min);
		return num;
	}
}
