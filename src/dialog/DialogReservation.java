package dialog;

public class DialogReservation {
	private int numClient;
	
	public void handleUserConnected(int numClient) {
		this.numClient=numClient;
		frameReservaton.setVisible(true);
	}
}
