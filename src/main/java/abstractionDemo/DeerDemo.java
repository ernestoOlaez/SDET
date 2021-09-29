package abstractionDemo;

public class DeerDemo extends AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeerDemo obj=new DeerDemo();
		obj.eat();

	}
    @Override
	void eat()
	{
    	
	   System.out.println("Deer eats Non veg food");
	   a=100;
	   System.out.println(a);
	   drink();
	}
}
