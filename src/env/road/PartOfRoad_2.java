package road;

import java.util.HashMap;
import java.util.Map;

import cartago.Artifact;
import cartago.OPERATION;

public class PartOfRoad_2 extends Artifact {

	static int initialRoadPerimeter = 11, finalRoadPerimeter = 20;
	private Map<String, Event> events = new HashMap<String, Event>();

	@OPERATION
	public void init(int initialInt, int finalInt) throws InterruptedException {
		initialRoadPerimeter = initialInt;
		finalRoadPerimeter = finalInt;

		loopCreateEvents();

	}

	public PartOfRoad_2(int initialInt, int finalInt) throws InterruptedException {
		super();
		initialRoadPerimeter = initialInt;
		finalRoadPerimeter = finalInt;

		loopCreateEvents();
	}

	public Map<String, Event> getEvents() {
		return events;
	}

	public void setEvents(Map<String, Event> events) {
		this.events = events;
	}

	public void addEvent(Event event) {
		this.events.put(event.getId(), event);
		updateObsProperty("event", event.getId(), event.getInitialX1(),
				event.getFinalX2(), event.isSuspiscious());
	}

	public void loopCreateEvents() throws InterruptedException {
		while (true) {

			Event eve = Event.generateRandomEvent(initialRoadPerimeter, finalRoadPerimeter);
			System.out.println(eve);
			addEvent(eve);

			Thread.sleep(10000);
		}
	}

	@Override
	public String toString() {
		return "PartOfRoad_1 [initialInt=" + initialRoadPerimeter
				+ ", finalInt=" + finalRoadPerimeter + ", events=" + events
				+ "]";
	}
}
