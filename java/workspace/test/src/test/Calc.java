package test;

public class Calc {
	private String name;
	public Calc (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
    	return a - b;
    }
    public int multiple(int a, int b) {
    	return a * b;
    }
    public int divide(int a, int b) {
    	return a / b;
    }
}
