package Practice;

public class Circle {

		public int radius;
		
		Circle(){
			
			this.radius = 12;
			
		}
		
		Circle(int r){
			this.radius = r;
		}


		public double getCircumference(){
			return 3.14 * 2 * radius;
		}

	
}

