class Music{
	public	void description();
}

class Player{
	public	void description();

}

class Harmonica extends Music,Player{
	public void description(){
		System.out.println("Hello, I am Harmonica...");
	}
}


class interface2{
	public static void main(String[] args){
		Harmonica h1=new Harmonica();
		h1.description();
	}
}