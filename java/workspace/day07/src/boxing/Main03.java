package boxing;


public class Main03 {

	public static void main(String[] args) {
		/*
		 * 객체 형변환 + 객체 배열 사용
		 * AirForce 공군 부대 2
		 * Navy		해군 부대 1
		 * Army		육군 부대 2
		 * for문 사용, attack() -> 부대 일괄 공격
		 */
		Unit[] unit = new Unit[5];
		unit[0] = new AirForce("공군 1부대");
		unit[1] = new AirForce("공군 2부대");
		unit[2] = new Navy("해군");
		unit[3] = new Army("육군 1부대");
		unit[4] = new Army("육군 2부대");
		
		// 부대 일괄 공격
		for (int i = 0; i < unit.length; i++) {
			unit[i].attack();
			
			// 각각의 객체의 독립적인 기능 메서드 호출
			if ( unit[i] instanceof AirForce) {
				AirForce af = (AirForce)unit[i];
				af.bombing();
			} else if (unit[i] instanceof Navy) {
				Navy nv = (Navy)unit[i];
				nv.nucleus();
			} else {
				Army am = (Army)unit[i];
				am.tank();
			}

		}
	
	
	
	
	
	
	
	
	}

}
