package study.java.helper;

import java.util.regex.Pattern;

public class RegexHelper {
	// 싱글톤 객체
	// 회원가입 validation check 기능
	
	private static RegexHelper current;
    public static RegexHelper getInstance() {
    	if(current == null){
        	current = new RegexHelper();
        }
        return current;
    }
    public static void freeInstance() {
    	current = null;
    }
    
    private RegexHelper() {}
    
    // 생성 끝
    /*
     * 주어진 문자열이 공백이거나 null인지를 검사
     * @param	str		- 검사할 문자열
     * @return	boolean	- 공백, null이 아닐 경우 true 리턴
     */
    public boolean isValue( String str) {
    	boolean result = false;
    	if ( str != null) {
			result = !str.trim().equals("");
		}
    	return result;
    }
    
    
    
    
    
    /*
     * 숫자 모양에 대한 형식 검사
     * @param	str		- 검사할 문자열
     * @return	boolean	- 형식에 맞을 경우 true, 맞지 않을 경우 false
     */
    public boolean isNum( String str) {
    	boolean result = false;
    	if ( isValue(str) ) {
    		result = Pattern.matches("^[0-9]*$", str);
		}
    	return result;
    }
    
    /*
     * 영문 모양에 대한 형식 검사
     * @param	str		- 검사할 문자열
     * @return	boolean	- 형식에 맞을 경우 true, 맞지 않을 경우 false
     */
    public boolean isEng( String str) {
    	boolean result = false;
    	if ( isValue(str) ) {
    		result = Pattern.matches("^[a-zA-Z]*$", str);
		}
    	return result;
    }
    
    /*
     * 한글으로만 구성되어있는지에 대한 형식 검사
     * @param	str		- 검사할 문자열
     * @return	boolean	- 형식에 맞을 경우 true, 맞지 않을 경우 false
     */
    public boolean isKor( String str) {
    	boolean result = false;
    	if ( isValue(str) ) {
    		result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
    	return result;
    }
    
    
}
