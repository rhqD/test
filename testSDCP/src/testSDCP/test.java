package testSDCP;

public class test {
    public static void main(String args[]) throws InterruptedException{
    	while(true){
    		new helper();
    		Thread.sleep((int)(Math.random() * 300));
    	}
    }
}
