interface Music{
	public void music_type();
	public void description();
}

interface Player{
	 public void player_name();
	 public void description();

}


class Harmonica implements Music,Player{
	public void music_type(){
		System.out.println("Music Type: classicial Music");
	}

	public void player_name(){
		System.out.println("Player Name: Lata ji");
	}

	public void description(){
		System.out.println("Hello, I am Harmonica...");
	}
}

class Guiter implements Music,Player{
	public void music_type(){
		System.out.println("Music Type: Rock Music");
	}

	public void player_name(){
		System.out.println("Player Name: Hanumankind");
	}
	
	public void description(){
		System.out.println("Hello, I am Guiter...");
	}

}


class interface2{
	public static void main(String[] args){
		Harmonica h1=new Harmonica();
		h1.description();
		h1.music_type();
		h1.player_name();
	
		Guiter h2=new Guiter();
		h2.description();
		h2.music_type();
		h2.player_name();

		
	}
}
