package override;

public class Army extends Unit {

	public Army(String name) {
		super(name);	
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName()
				+ ">> 지상 공격 실핼함");
	}
	
	public void tank() {
		System.out.println(super.getName()
				+ ">> 탱크 공격");
	}
}
