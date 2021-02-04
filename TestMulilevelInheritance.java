package myProject;
class Demo
{ 
	void eat() { System.out.println("dog is eating");}
}
class Demo1 extends Demo
{
	void bark() { System.out.println("dog barks");}
}
class Demo2 extends Demo1
{
	void sleep() { System.out.println("dog is sleeping");}
}
 class TestMulilevelInheritance {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.eat();
		d.bark();
		d.sleep();

	}

}

