
//class phone
//inteface camera & music player
//class smartphone of its own method & that extends phone & implement camera & mp
//object of smartphone
//refrence for all things and call methods of all class/interfaces
class phone{
	public void call() {System.out.println("phone calling");}
	public void sms() {System.out.println("sms sent");}
}
interface camera{
	void click();
	void record();
}
interface musicPlayer{
	void play();
	void pause();
	void stop();
}
class smartphone extends phone implements camera, musicPlayer{
	public void videocall() {System.out.println("smartphone video calling ");}
	public void click() {System.out.println("Smartphone clicking a pic");}
	public void record() {System.out.println("Smartphone recording a video");}
	public void play() {System.out.println("Smartphone playing a song");}
	public void pause() {System.out.println("Smartphone pause a song");}
	public void stop() {System.out.println("Smartphone stop a song");}
}
public class interface2 {

	public static void main(String[] args) {
		smartphone s= new smartphone();
		System.out.println("REFRENCE OF PHONE:-");
		phone p=s;
		p.call();
		p.sms();
		System.out.println("***************************************************************");
		System.out.println("REFRENCE OF Camera:-");
		camera c= s;
		c.click();
		c.record();
		System.out.println("***************************************************************");
		System.out.println("REFRENCE OF Music player:-");
		musicPlayer m=s;
		m.play();
		m.pause();
		m.stop();
		System.out.println("***************************************************************");
		System.out.println("REFRENCE OF Smartphone:-");
		s.call();
		s.sms();
		s.videocall();
		s.click();
		s.record();
		s.play();
		s.pause();
		s.stop();

		
	}

}
