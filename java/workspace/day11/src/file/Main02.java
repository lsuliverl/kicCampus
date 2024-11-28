package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main02 {

	public static void main(String[] args) {
		// 저장할 파일의 경로
		final String PATH = "./test.txt";
		
		// 파일에 저장할 내용
		String write_string = "자바수업/마지막/오늘은/마지막";
		
		/*
		 * - 문자열을 파일로 저장하기 위해서 byte배열로 변환해야
		 * 한다.
		 * - 문자열을 byte배열로 변환하기 위해서 getBytes()
		 * 메서드를 사용를 하는데, 이때 변환 과정에서 사용될
		 * 인코딩 형식을 지정해 주어야 한다.
		 */
		
		byte[] buffer = null;
		try {
			// 특정 인코딩 방식 적용
			// getBytes()메서드는 존재하지 않는 인코딩 형식에
			// 대한 지정을 방지하기 위하여 예외처리를 강제적으로 요구한다.
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// 파일 저장 절차 시작
		// finally 블록에서 인식하기 위해서 선언부를 뒤로 이동
		OutputStream out = null;
		try {
			out = new FileOutputStream(PATH);
			// 파일 쓰기
			// 변수의 유효범위가 달라 buffer를 인식하지 못한다.
			out.write(buffer);
			System.out.println("[INFO] 파일 저장 성공 >> "+ PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음 >> "
					+ PATH);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 파일 저장 실패 >> "+ PATH);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] 알 수 없는 에러 >> "+ PATH);
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
