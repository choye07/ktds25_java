package task.basiccontact;

public class ParameterUtil {
	/**
	 * 
	 * @param param
	 * @return
	 */
	public static boolean isEmpty(String param) {
		return param ==null || param.isEmpty();
	}
	
	/**
	 * isEmpty2(1,2,3,); -> 메소드 실행 방법
	 * @param param
	 * @return
	 */
	public static boolean isEmpty2(String ...param) {
		if(param == null) {
			return true;
		}
		for(int i =0; i<param.length; i++) {
			if ( param[i]==null ||param[i].isEmpty()) {
				return true;
			}
		}
		return false;
	}
}
