abstract class TwoDShape{
	double dim1,dim2;
	abstract double area();
}


class Rectangle extends TwoDShape{
	Rectangle(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	double area(){ return dim1*dim2;}
}

class TwoDShape_main{
	public static void main(String[] args){
		Rectangle rec1=new Rectangle(10,20);
		Rectangle rec2=new Rectangle(11,30);
		System.out.println("Area of rectangle1="+rec1.area());
		System.out.println("Area of rectangle2="+rec2.area());
	}
}