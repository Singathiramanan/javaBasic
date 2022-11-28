package poly;

class Stimulater
{
	static void ansim(Animal a1){
		a1.noise();
	}
}
class Animal{
	void noise(){
		System.out.println("some noise....");
	}
}
class Dog extends Animal{
	void noise(){
		System.out.println("Bow Bowww....");
	}
}
class Cat extends Animal{
	void noise(){
		System.out.println("Meow meow....");
	}
}
class Snake extends Animal{
	void noise(){
		System.out.println("Buss buss....");
	}
}
public class ploy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		Cat c1=new Cat();
		Snake s1=new Snake();
		Stimulater.ansim(c1);
		Stimulater.ansim(d1);
		Stimulater.ansim(s1);
		
	}

}
