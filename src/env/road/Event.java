package road;

import java.util.UUID;

public class Event {
	private int initialX1, finalX2;
	private boolean isSuspiscious;
	private String id;

	public Event(int x1, int x2, boolean isSuspiscious) {
		super();
		this.initialX1 = x1;
		this.finalX2 = x2;
		this.isSuspiscious = isSuspiscious;
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getInitialX1() {
		return initialX1;
	}

	public void setInitialX1(int x1) {
		this.initialX1 = x1;
	}

	public int getFinalX2() {
		return finalX2;
	}

	public void setFinalX2(int x2) {
		this.finalX2 = x2;
	}

	public boolean isSuspiscious() {
		return isSuspiscious;
	}

	public void setSuspiscious(boolean isSuspiscious) {
		this.isSuspiscious = isSuspiscious;
	}

	@Override
	public String toString() {
		return "Event [x1=" + initialX1 + ", x2=" + finalX2
				+ ", isSuspiscious=" + isSuspiscious + ", id=" + id + "]";
	}

	public static Event generateRandomEvent(int minParam, int maxParam) {
		int min = (int) (Math.random() * (maxParam - minParam)) + minParam;
		int max = (int) (Math.random() * (maxParam - min)) + min;
		boolean isSuspiscious = Math.random() < .5;
		return new Event(min, max, isSuspiscious);
	}

	//TODO
	//find the correct location for this method
	public static void publishEvent() {
		Event generatedEvent = Event.generateRandomEvent(1,30);
		int initialXFromGeneratedEvent = generatedEvent.getInitialX1();
		int finalXFromGeneratedEvent = generatedEvent.getFinalX2();

		if (initialXFromGeneratedEvent >= PartOfRoad_1.initialRoadPerimeter
				&& finalXFromGeneratedEvent <= PartOfRoad_1.finalRoadPerimeter) {
//			PartOfRoad_2.
			
		}

		if (initialXFromGeneratedEvent >= PartOfRoad_2.initialRoadPerimeter
				&& finalXFromGeneratedEvent <= PartOfRoad_2.finalRoadPerimeter) {

		}

		if (initialXFromGeneratedEvent >= PartOfRoad_3.initialRoadPerimeter
				&& finalXFromGeneratedEvent <= PartOfRoad_3.finalRoadPerimeter) {

		}
	}

	public static void main(String args[]) {
		System.out.println(Event.generateRandomEvent(1, 30));
	}
}