import java.util.ArrayList;
import java.util.List;

public class MusicConductor implements Subject {	//The conductor who is being observed
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer o) {
		observers.add(o);		//if the attach method is called, the observer is added to the list of observers
	}
	
	public void detach(Observer o) {
		observers.remove(o);	//if the detach method is called, the observer is removed to the list of observers
	}
	
	public void notifyUpdate(StateChange sc) {
		for(Observer o: observers) {
			o.update(sc);
		}
	}
}
