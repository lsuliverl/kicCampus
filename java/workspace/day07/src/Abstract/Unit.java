package Abstract;

public abstract class Unit {
	private String name;

	public Unit(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 자식들이 재정의할 메서드를 추상으로 명시
	public abstract void attack();
	public abstract void move();
	
}
