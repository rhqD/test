package testSDCP;

import java.io.IOException;
import java.net.Socket;

public class helper implements Runnable{
    private Socket s;
	public helper(){
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			s = new Socket("127.0.0.1",5428);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
