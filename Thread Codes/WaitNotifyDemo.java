package thread.demos;

class TableTennis{
	synchronized void play(){
		System.out.println("Played by : "+Thread.currentThread().getName());
		try{
			notify();
			wait();
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Players implements Runnable{
	TableTennis tt = null;
	Players(TableTennis t){
		tt = t;
	}
	public void run(){
		while(true) tt.play();
	}
}

class WaitNotifyDemo{
	public static void main(String[] args) {
		TableTennis tt = new TableTennis();
		Players p1 = new Players(tt);

		Thread t1 = new Thread(p1, "Ramu");
		Thread t2 = new Thread(p1, "Shamu");

		t1.start();
		t2.start();
	}
}