public class Main{
	public static void main(String [] args){
		chopstick[] s=new chopstick[5];
		Philosopher[] f=new Philosopher[5];
		State hlp=new State();
		for(int i=0;i<5;i++){
			s[i]=new chopstick();
		}
		for(int i=0;i<5;i++){
			f[i]=new Philosopher(i,s[i],s[(i+4)%5],hlp);
			new Thread(f[i]).start();
		}
	}
}

