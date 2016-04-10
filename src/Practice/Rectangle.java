package Practice;

public class Rectangle {

private float length;
private float width;

public Rectangle(){ //default constructor
	this.length = 13.33f; //why its showing error when its a float type?
	this.width = 33.31f;
}

public Rectangle (float l, float r){
	this.length = l;
	this.width = r;
}

public Rectangle (Rectangle r){ //copy constructor
	this.length = r.length;
	this.width = r.width;
}

public double getArea(){
	return length * width;
}

}
 