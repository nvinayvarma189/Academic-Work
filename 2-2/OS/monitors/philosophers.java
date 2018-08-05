import java.util.concurrent.locks.*;
class Philosopher implements Runnable{
	State hlp;
	chopstick l,r;
	int id;
	public Philosopher(int id,chopstick l, chopstick r, State i){
		this.hlp=i;
		this.l=l;
		this.r=r;
		this.id=id;
	}
	private void eat(){
			Thread.sleep(2000);
			System.out.println(id+"eat");
	}
	private void think(){
			Thread.sleep(2000);
			System.out.println(id+"think");
	}
	public void run(){
		while(true){	
			hlp.grabchopstick(id,l,r);
			eat();
			hlp.releasechopstick(id,l,r);
			think();
		}
	}
}

class State{
		Lock mutex= new ReentrantLock();
		Condition[] cond=new Condition[5];
		int [] id= new int[5];
		String [] State=new String[5]; 
		void outputstate(int id){
			StringBuffer line=new StringBuffer();
			for(int i=0;i<5;i++){
			line.append(State[i]+" " );
			}
			System.out.println(line+"("+(id+1)+")");
		}
		public State(){
				for(int i=0;i<5;i++){
					id[i]=i;
					State[i]="0";
					cond[i]=mutex.newCondition();
				}
			}
		public void setstate(int id, String s) 
		{
			State[id]=s;
		}
		public void grabchopstick(int id, chopstick l,chopstick r){
				mutex.lock();
				try{
					setstate(id,"0");
					while(!l.getavailability()||!r.getavailability()){
						cond[id].await();
					}
					l.setavailability(false);
					r.setavailability(false);
					setstate(id,"x");
					outputstate(id);
				}catch(Exception e){
				}
				finally{
					mutex.unlock();
				}
		}
		public void releasechopstick(int id,chopstick l,chopstick r){
				mutex.lock();
				setstate(id,"0");
				l.setavailability(true);
				r.setavailability(true);
			cond[(id+1)%5].signalAll();
			cond[(id+4)%5].signalAll();
			outputstate(id);
			mutex.unlock();
		}
}


class chopstick{
		private boolean availability;
		public chopstick(){
			availability=true;
		}
		public boolean getavailability(){
			return availability;
		}
		public void setavailability(boolean flag){
				availability=flag;
		}
}
		


