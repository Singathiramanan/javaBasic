package Methodoverriding;

class Music_v1
{
	void songs(){
		System.out.println("Only for offline songs");
	}
}
class Music_v2 extends Music_v1
{
	void songs(){
		System.out.println("play online,downlod");
		super.songs();
	}
}
public class Audio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music_v2 a1=new Music_v2();
		a1.songs();
	}

}
