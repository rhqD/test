package testSDCP;

public class test {
    public static void main(String args[]) throws InterruptedException{
    	for(int i=0;i< 50;i++){
    		Thread.sleep(100);
    		new helper();
    	}
    	Thread.sleep(10000);
    	for(int i=0;i< 2;i++){
    		Thread.sleep(100);
    		new helper();
    	}
    }
}
