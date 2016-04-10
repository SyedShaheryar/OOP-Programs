package Practice;

public class myTime {
	private int hours;
	private int minutes;
	private int seconds;

public myTime(int h, int m, int s){ //constructor
	this.hours = h;
	this.minutes = m;
	this.seconds = s;
}

public myTime(myTime t){ //copy constructor
	this.hours = t.hours;
	this.minutes = t.minutes;
	this.seconds = t.seconds;

}

public String getformattedString (){
	return String.format("%02d:%02d:%02d", hours, minutes, seconds);
}


}
