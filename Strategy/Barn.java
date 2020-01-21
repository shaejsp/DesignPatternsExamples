public class Barn {
    public static void main (String[] args){
    	Horse cal = new Thoroughbred("Calzone");  // set to Race and Bolt

    	// the horse will now compete in 5 competitions
    	int points = 0;
    	for(int i = 0; i < 5; i++) {
    		int p = cal.compete();

    		if(p > 0) {
    			points += (6-p);  // keep track of how the horse places
    		}
    	}

    	// if the horse is not good at racing, we change the competition type
    	if(points < 15) {
    		System.out.println("\nCal was bad at that, changing CompetitionType to jumping");
    		cal.setCompetitionType(new Jumping());
    	}

    	// changes the horse's bad behaviour randomly between the remaining 2
    	if(Math.random() < 0.5) {
    		System.out.println("\nCal has picked up a new bad behaviour - refusing\n");
    		cal.setBadBehaviour(new Refuse());
    	} else {
    		System.out.println("\nCal has picked up a new bad behaviour - bucking\n");
    		cal.setBadBehaviour(new Buck());
    	}

    	/* horse does 5 competitions in the new competition type
    	 * this is why Strategy is important - we can easily change the behaviour
    	 * of an object during runtime instead of having to hard code everything
    	 */
    	points = 0;
    	for(int i = 0; i < 5; i++) {
    		int p = cal.compete();

    		if(p > 0) {
    			points += p;
    		}
    	}

    	// if horse is bad, change to poles
    	if(points < 15) {
    		System.out.println("\nCal was bad at that, changing CompetitionType to barrel racing");
    		cal.setCompetitionType(new Barrels());
    	}
    	System.out.println();

    	for(int i = 0; i < 5; i++) {
    		cal.compete();
    	}
    }
}
