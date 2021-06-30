package vorlesung5;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
        this.height = height;
	}

	@Override
	public double perimeter() {
		return (2.0 * (this.width + this.height));
	}

	@Override
	public double area() {
		return (this.width * this.height);
	}
	
	
	
}
