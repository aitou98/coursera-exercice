package poo_ex2;

public class Spectateur {
	private int age;
	private double argent;
	
	public Spectateur(int age , double argent) {
		if(age > 0 && argent >0 && argent<=100) {

			this.age = age;
			this.argent = argent;
		
		
		
	}
		else {
			System.out.println("il faut mettre des valeurs positive !!");
		}
	

}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getArgent() {
		return argent;
	}

	public void setArgent(double argent) {
		this.argent = argent;
	}
	
	
	
	
	
	
	
}
