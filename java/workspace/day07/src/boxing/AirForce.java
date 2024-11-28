package boxing;

/*
 * - Unit 부모 클래스 상속
 * - attack() -> override, 부모 메서드 호출
 * - 독자적인 메서드 -> bombing()
 */

public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName()
				+ ">> 이륙");
		System.out.println(this.getName()
				+ ">> 공중공격");
	}
	public void bombing() {
		System.out.println(this.getName()
				+ ">> 폭격");
	}
}
