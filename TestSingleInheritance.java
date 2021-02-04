package myProject;

class Prasad
{
	void eat() { System.out.println("Dog is eating");}
}
class Rayudu extends Prasad
{
	void bark() { System.out.println("Dog is barking");}
}
public class TestSingleInheritance {

	public static void main(String[] args) {
		Rayudu d = new Rayudu();
		 d.eat();
		 d.bark();

	}

}
