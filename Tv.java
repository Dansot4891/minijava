class Tv1{
	int channel;
	int volume;
	boolean onoff;
	
}
public class Tv {

	public static void main(String[] args) {
		Tv1 tv1 = new Tv1();
		Tv1 tv2 = tv1;
		
		tv2.channel = 7;
		tv1.volume = 4;
		
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		
		System.out.println(tv1.volume);
		System.out.println(tv2.volume);
	}

}
