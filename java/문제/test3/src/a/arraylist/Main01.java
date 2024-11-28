package a.arraylist;

import java.util.ArrayList;


public class Main01 {

	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		
		for(int i=0; i<10; i++) {
			Student p = new Student("학생"+i, "010-1234-567" + i, "서울시" + i);
			st.add(p);
		}
		
		System.out.println("----------");
		System.out.println(st.size());
		System.out.println("----------");
		System.out.println(st.get(4));
		System.out.println("----------");
		st.remove(4);
		System.out.println("----------");
		
		for(int i = 0; i<9; i++) {
			Student tempst = st.get(i);
			System.out.println(tempst.toString());
		}
	}

}
