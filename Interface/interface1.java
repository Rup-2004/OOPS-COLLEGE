interface function{
	public double add(double a,double b);
	public double mul(double a,double b);
	public double div(double a,double b);

}

class calculator implements function{
	public double add(double a,double b){
		return a+b;
	}

	public double mul(double a,double b){
		return a*b;
	}
	
	public double div(double a,double b){
		return a/b;
	}
}


class interface1{
	public static void main(String[] arg){
		calculator c1=new calculator();
		System.out.println("addition result="+c1.add(1,2));
		System.out.println("multipication result="+c1.mul(1,2));
		System.out.println("division result="+c1.div(1,2));
	}
}



