package road;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import cartago.Artifact;
import cartago.INTERNAL_OPERATION;
import cartago.OPERATION;

public class PartOfRoad_1 extends Artifact {
	
	private Logger logger = Logger.getLogger("road."+PartOfRoad_1.class.getName());

	static int initialRoadPerimeter = 1, finalRoadPerimeter = 10;
	static Map<String, Event> events = new HashMap<String, Event>();

	public void init(int initialInt, int finalInt) {
		logger.info("PartOfRoad_1 initiated with [initialRoadPerimeter] as " + initialRoadPerimeter + "and [finalRoadPerimeter] as " + finalRoadPerimeter);
		
		initialRoadPerimeter = initialInt;
		finalRoadPerimeter = finalInt;
	}

	@OPERATION void generateEvent(){
		execInternalOp("loopCreateEvents");
	}
	
	@INTERNAL_OPERATION void loopCreateEvents() throws InterruptedException {
		while (true){
			Event e = Event.generateRandomEvent(initialRoadPerimeter, finalRoadPerimeter);
	    	signal("eventDetected", e.getId(), e.getInitialX1(), e.getFinalX2(), e.isSuspiscious());
	    	await_time(5000);
	    }
	}

	@Override
	public String toString() {
		return "PartOfRoad_1 [initialInt=" + initialRoadPerimeter
				+ ", finalInt=" + finalRoadPerimeter + ", events=" + events
				+ "]";
	}
}
