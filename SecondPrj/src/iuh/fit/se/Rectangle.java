/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 28 thg 8, 2025
 */

package iuh.fit.se;

/**
 * Rectangle class
 */
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {}
	public Rectangle(double length, double width) throws Exception
	{
		this.length = length;
		this.width = width;
		if(this.length < 0 || this.width < 0)
		{
			throw new Exception("Length and width must be greater than 0");
		}
	}
	
	
	public void setLength(double newVal) throws Exception{
		this.length = newVal;
		if(this.length < 0) throw new Exception("Length must be greater than 0");
	}
	
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double newVal) throws Exception {
		this.width = newVal;
		if(this.width < 0) throw new Exception("Width must be greater than 0");
	}
	
	public double getWidth() {
		return width;
	}
	
	
	public double getArea()
	{
		return this.length * this.width;
	}
	
	public double getPerimeter()
	{
		return (this.length + this.width) / 2;
	}
	
	public String toString()
	{
		return "Rectangle [length = " + this.length + ", width = " + this.width + 
				", Area = " + getArea() + ", Perimeter = " + getPerimeter() + "]";
	}
}

