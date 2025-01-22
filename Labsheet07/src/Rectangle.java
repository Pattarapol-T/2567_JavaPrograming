
public class Rectangle {
/*	private float legth;
	private float width;
	
	
	Rectangle(){
		legth = 1.0f;
		width = 1.0f;
	}*/
	private float length = 1.0f;
	private float width = 1.0f;
	
	Rectangle(){}
	
	Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	public float getlength() {
		return length;
	}
	public void setlength(float length) {
		this.length = length;
	}
	public float getwidth() {
		return width;
	}
	public void setwidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return this.length * this.width;
	}
	public double getPerimeter() {
		return 2*(this.length + this.width);
	}
	public String showData() {
		return "Retangle[length = " + this.length + ",width = "+"this width"+"]";
	}
	public String toString() {
		return "Retangle[length = " + this.length + ",width = "+"this width"+"]";
	}
	

}
