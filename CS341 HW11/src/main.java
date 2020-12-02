
public class main {

	public static void main(String[] args) {
		
		TromboneGroup tromboneGp = new TromboneGroup();
		TrumpetGroup trumpetGp = new TrumpetGroup();
		TubaGroup tubaGp = new TubaGroup();	
		
		MusicConductor conductor = new MusicConductor();
		
		conductor.attach(tromboneGp);
		conductor.attach(trumpetGp);
		
		conductor.notifyUpdate(
				new StateChange("Appassionato")
			);
		
		conductor.detach(tromboneGp);
		conductor.attach(tubaGp);
		
		conductor.notifyUpdate(
				new StateChange("Crescendo")
			);
	}

}
