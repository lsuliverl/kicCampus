package com.it.packagestudy;

import com.it.study.Article;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * 패키지에 속해 있는 클래스에 대한 객체 생성
		 * 	- 다른 패키지의 클래스를 사용하고자 할 경우
		 * 패키지 이름을 포함한 FullName으로 사용해야 한다.
		 */
//		com.it.study.Article article
//			= new com.it.study.Article(1, "test", "test");
		
		/*
		 * - 이러한 번거로움을 피하고자 클래스 정의 전에
		 * import 구문을 사용하여 특정 클래스의 이름이 어떤
		 * 패키지에 소속되어 있는지를 명시할 수 있다.
		 */
	
		Article article = new Article(1, "test", "test");
	
	
	
	}

}
