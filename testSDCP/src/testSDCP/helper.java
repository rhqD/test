package testSDCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.AsynchronousSocketChannel;

public class helper implements Runnable{
    private Socket s;
	public helper(){
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			s = new Socket("127.0.0.1",5427);
			s.getOutputStream().write("abcdefghijklmnopqrstuvwxyz".getBytes());
			Thread.sleep(100);
			s.getOutputStream().write("abcdefghijklmnopqrstuvwxyz".getBytes());
//    		AsynchronousSocketChannel.open().connect(new InetSocketAddress("127.0.0.1", 56438));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
