
class phone {
    public String modelname;
    public long number;
    private double price;
    private int volume = 5;
    private int channel = 10;

    public double getprice() {
        return price;
    }

    public void onphone() {
        System.out.println("Phone is ON");
    }

    public void upvolume(int n) {
        volume += n;
        System.out.println("Volume: " + volume);
    }

    public void lowvolume(int n) {
        volume -= n;
        System.out.println("Volume: " + volume);
    }

    public void upchannel(int n) {
        channel += n;
        System.out.println("Channel: " + channel);
    }
}

class smartphone extends phone {
    private int volume = 100;

    @Override
    public void onphone() {
        System.out.println("Smartphone is ON");
    }

    @Override
    public void upvolume(int n) {
        this.volume = this.volume + n;
        System.out.println("Volume: " + this.volume);
    }
}

public class overide3 {
	public static void main(String[] args) {
		 phone p= new phone();
	        p.onphone();
	        p.upvolume(1);
	        p.upchannel(1);
	        p.lowvolume(1);

	        smartphone s= new smartphone();
	        s.onphone();
	        s.upchannel(6);
	        s.upvolume(9);
	    }

	}

