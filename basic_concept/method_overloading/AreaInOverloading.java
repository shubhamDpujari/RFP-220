package basic_concept.method_overloading;

class overload
{
	void areaRectangle( int a, int b)
	{
		System.out.println("the area of rectangle is "+(a*b));
	}

	void areaSquare (int l)
	{
		System.out.println("the area of squre is" +(l*l));
	}
	void areaCircle (double x)
	{
		double res = 3.14 * x * x;
		System.out.println("the area of circle is "+res);
	}
}



public class AreaInOverloading {

	public static void main(String[] args) {

		overload ov = new overload();
		ov.areaRectangle(10, 40);
		ov.areaSquare(20);
		ov.areaCircle(5);
	}

}
