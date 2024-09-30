import java.util.*;


class third{
	public static void main(String[] args){
		bedroom ob1=new bedroom(7,3,1,2,3);
		ob1.calc_area();
		ob1.display();
		
	}
}

//method overriding

class room{
	double length,breath;

	room(double length,double breath){
		this.length=length;
		this.breath=breath;
	}

	public void calc_area(){
		System.out.println("No figure is mentioned...");
	}	
}

class bedroom extends figure{
	int bathroom,study_table,night_lamp;
	bedroom(double a,double b,int bathroom,int study_table,int night_lamp){
		super(a,b);
		this.bathroom=bathroom;
		this.study_table=study_table;
		this.night_lamp=night_lamp;
	}
	void calc_area(){
		System.out.print("Area of the bedroom:"+length*breath);
		System.out.println();
	}
	void display(){
		System.out.print("The number of bathroom ="+bathroom);
		System.out.print("The number of study_table="+study_table);
		System.out.print("The number of night_lamp="+night_lamp);
	}	
}

class drawingroom extends figure{
	drawingroom(double a,double b){
		super(a,b);
	}
	void calc_area(){
		System.out.print("Area of the drawingroom:"+length*breath);
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
