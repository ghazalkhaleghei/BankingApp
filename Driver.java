
public class Driver {

	public static void main(String[] args) {

		Network objNetwork = new Network();
		objNetwork.start();

		Server Thread1 = new Server("Thread1");
		Thread1.start();

		Server Thread2 = new Server("Thread2");

		Thread2.start();
		
		Server Thread3 = new Server("Thread2");

		Thread3.start();

		Client send = new Client("sending");
		Client receive = new Client("receiving");

		send.start();
		receive.start();

	}

}
