// Agent local_camera in project gold_miners

/* Initial beliefs and rules */

/* Initial goals */

!start.

/* Plans */

+!start 
	: true 
	<- generateEvent
	.
	
+eventDetected(Id, Initial, Final, IsSuspiscious)
	: true
	<-	
	if(IsSuspiscious==true){
		.print("Suspiscious event found: ", Id);
		.send(region_camera1, tell, found(Initial, Final))
	}
	else{
		.print("Non suspiscious event found: ", Id);
	}
	.


{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have a agent that always complies with its organization  
//{ include("$jacamoJar/templates/org-obedient.asl") }
