package override;

class Hello2{
		public void say(){
			System.out.println("Hello");
		}
}

class Korean2 extends Hello2{
	public void say(){
		super.say();
		System.out.println("안녕하세요");
	}
}

public class Main02 {

	public static void main(String[] args) {
		Korean2 k = new Korean2();
		k.say();
	}

}
