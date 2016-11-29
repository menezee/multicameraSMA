// Agent region_camera in project gold_miners

/* Initial beliefs and rules */
+found.

/* Initial goals */


/* Plans */


/*+!Found
	: true
	<- .print("Received by regional camera").*/
	
+found(Initial, Final)
	: true
	<- .print("Suspiscious event found at ", Initial, " and ended at ", Final).


{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have a agent that always complies with its organization  
//{ include("$jacamoJar/templates/org-obedient.asl") }
