package aufgaben.aufgabe7;

import java.util.*;

public class Slack implements Publisher {
	
	private Set<Listener> listeners;
	private int nrOfMessages;
	
	public Slack() {
		listeners = new HashSet<>();
		nrOfMessages = 0;
		
	}
	
	@Override
	public boolean register(Listener listener) {
		int eingefuegt = 0;
		for(Listener l : listeners) {
			if(l == listener) {
				eingefuegt++;
			}
		}
		if(eingefuegt == 0) {
			listeners.add(listener);
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public boolean unregister(Listener listener) {
		int eingefuegt = 0;
		for(Listener l : listeners) {
			if(l == listener) {
				eingefuegt++;
			}
		}
		if(eingefuegt == 0) {
			listeners.remove(listener);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void notifyListeners() {
			for(Listener l: listeners) {
				l.update();
		}
	}
	
	public String getUpdate(Listener listener) {
		return "Breaking News " + this.nrOfMessages;
	}
	
	public void publishNews() {
		this.nrOfMessages++;
		this.notifyListeners();
	}
	

}
