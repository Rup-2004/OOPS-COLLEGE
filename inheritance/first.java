import java.util.*;


class first{
	public static void main(String[] args){
		figure ob1=new circle(7);
		figure ob2=new triangle(3,4,5);
		figure ob3=new rectangle(7,8);
		
		ob1.area();
		ob2.area();
		ob3.area();
	}
}

//method overriding

class figure{
	double a,b;
	figure(double a){
		this.a=a;
	}

	figure(double a,double b){
		this.a=a;
		this.b=b;
	}

	public void area(){
		System.out.println("No figure is mentioned...");
	}	
}

class circle extends figure{
	circle(double a){
		super(a);
	}
	public void area(){
		double pi=(double)22/7; 
		System.out.print("Area of the circle:"+pi*a*a);
		System.out.println();
	}	
}

class triangle extends figure{
	double c;
	triangle(double a,double b,double c){
		super(a,b);
		this.c=c;
	}
	public void area(){
		double s=(a+b+c)/2;
		double areaTri=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("Area of the triangle:"+areaTri);
		System.out.println();
	}
}

class rectangle extends figure{
	rectangle(double a,double b){
		super(a,b);
	}
	public void area(){
		System.out.print("Area of the rectangle:"+(a*b));
		System.out.println();
	}
}






