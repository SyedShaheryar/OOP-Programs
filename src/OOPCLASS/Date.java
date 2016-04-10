package OOPCLASS;

public class Date {


		public int year;
		public int month;
		private int day;
		
	public Date(int y, int m, int d){
		// this should be in the same sequence 
		year = y;
		month = checkMonth(m); // if month is correct return m else return special error code
		day = checkDay(d); // if day is correct return m else return special error code
		
	}

	public int checkMonth(int m){
		if(m>0 && m<=12)
			return m; // here return will break the execution so no need of else
			
		//we can use else also but return statement will break.
			
		
			System.out.printf("error in Month %d \n", m);
			return -1;
		
	}

	public int checkDay(int d){
		int maxDays [] = {-1, 31 ,28, 31, 30, 31, 30, 31 , 31, 30, 31, 30, 31}; 

		if(d>0 && d<= maxDays[month] )
			
			return d;

	//checking leap year for feb
		if(month == 2 && day == 29 && (year%400 == 0) || (year%4 == 0 && year%100!=0))
			
			return d;
		
		
		System.out.printf("Error in Month %d \n", d);
		return -1;
		
	}


	public String toString (){
		return String.format("%2d/%2d/%2d", day, month, year);
	}



	}

