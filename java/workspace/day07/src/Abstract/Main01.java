package Abstract;

/*
 *  Navy, AirForce class 생성
 *  -> unit 상속
 *  -> move, attack 재 작성
 */
public class Main01 {

	public static void main(String[] args) {
		Army army = new Army("육군");
		
		army.move();
		army.attack();
	
		Navy navy = new Navy("해군");
		
		navy.move();
		navy.attack();

		AirForce airforce = new AirForce("공군");
		
		airforce.move();
		airforce.attack();
	}
}
