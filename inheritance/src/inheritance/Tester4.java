package inheritance;

class Animal {
	int b=10;
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	int b=20;
	@Override
	void eatSomething() {
		
		System.out.println("eating foods");
	}// should be eatSomething
}

class Tester4 {
	public static void main(String args[]) {
		//Dog d=new Dog();
		Animal a = new Dog();
		System.out.println("b" + a.b);
		//a.eatSomething();
	}
}
