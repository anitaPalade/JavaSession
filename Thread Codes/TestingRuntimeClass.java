package threadTesting;

public class TestingRuntimeClass  {
	public static void main(String[] args) throws Exception{
	Runtime run = Runtime.getRuntime();
	run.exec("notepad");
	//run.exec("c:\\\\Windows\\\\System32\\\\shutdown -r -t 0");
	
	System.out.println(run.availableProcessors());
	 System.out.println("Total Memory: "+run.totalMemory());
	 System.out.println("Free Memory: "+run.freeMemory());
	 System.gc();
	 System.exit(1);
	}
}
