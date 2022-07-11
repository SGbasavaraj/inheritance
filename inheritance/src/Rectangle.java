
public class Rectangle {
	
	private int width;
	private int hight;
	
	public Rectangle(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}
	public Rectangle() {
		this(0,0);
	}
	
	public int getWidth() {
		return width;
	}
	public int getHight() {
		return hight;
	}
	
	public int getArea() {
		return width*hight;
	}
	public void printDetails() {
		System.out.println("Width = "+width);
		System.out.println("Hight = "+hight);
		System.out.println("Area of the rectangle is "+getArea());
	}
}
