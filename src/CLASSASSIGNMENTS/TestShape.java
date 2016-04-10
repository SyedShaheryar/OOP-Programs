package CLASSASSIGNMENTS;

public class TestShape {

	public static int getRandomBetween(int low, int high) {
		int rand = 0;
		rand = ((int)(Math.random()*(high-low))+ low) ;
		return rand;
	}
	public static void main(String[] args){
		Shape S[] = new Shape[100];
		
		for (int i = 0; i<100; i++){
			if (i%2 == 0){
				S[i] = new Circle((double)getRandomBetween(1, 19)); //"generating numbers between"
				System.out.println("Circle object is created");
				System.out.println(S[i].getArea());
			}
			else{
				S[i] = new Square((double)getRandomBetween(1, 20));
				System.out.println("Square object is created");
				System.out.println(S[i].getArea());
			}
		}
	}
}