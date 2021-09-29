package abstractionDemo;

abstract class Animal {
	
	//Abstract method that does not have body
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Zzzzz");
	}

}
