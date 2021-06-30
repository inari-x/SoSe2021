package vorlesung5;

public class TestShape {

		public static void printPerimeter(Shape s) {
	        System.out.printf("perimeter : %.2f cm%n", s.perimeter());
	    }

	    public static void printArea(Shape s) {
	        System.out.printf("area      : %.2f cm%n", s.area());
	    }

	    public static double sumPerimeters(Shape[] shapes) {
	        double sum = 0.0;
	        for(Shape s : shapes)
	        {
	            sum += s.perimeter();
	        }
	        return sum;
	    }

	    public static double sumAreas(Shape[] shapes) {
	        double sum = 0.0;
	        for(Shape s : shapes)
	        {
	            sum += s.area();
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        Shape s1 = new Rectangle(10, 20);
	        Shape s2 = new Circle(6.0);
	        printPerimeter(s1);
	        printPerimeter(s2);
	        printArea(s1);
	        printArea(s2);

	        Shape[] shapes = new Shape[4];
	        shapes[0] = s1;
	        shapes[1] = s2;
	        shapes[2] = new Rectangle(5,15);
	        shapes[3] = new Circle(10.0);
	        System.out.printf("sum of perimeters : %.2f cm%n", sumPerimeters(shapes));
	        System.out.printf("sum of areas      : %.2f cm%n", sumAreas(shapes));

	}

}
