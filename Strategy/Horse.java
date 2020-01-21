import java.lang.Math;

public abstract class Horse {
    protected String name;
    protected CompetitionType competitionType;
    protected BadBehaviour badBehaviour;

    /**
     * Horse constructor when not given a competition type or bad behaviour
     * @param n the name of the horse as a String
     */
    public Horse(String n){
        name = n;
        competitionType = new Jumping();
        badBehaviour = new Refuse();
    }

    /**
     * Horse constructor
     * @param n the name of the horse as a String
     * @param c the competition type for the horse
     * @param b the bad behaviour for the horse
     */
    public Horse(String n, CompetitionType c, BadBehaviour b){
        name = n;
        competitionType = c;
        badBehaviour = b;
    }

    /**
     * Simulates a horse going to a competition with a 25% chance of misbehaving.
     * @return -1 if the horse was disqualified for bad behaviour, else the place (1st-5th) of the horse
     */
    public int compete(){
        if(Math.random() > 0.75){
            badBehaviour.misbehave();
            return -1;
        }else {
            return competitionType.compete();
        }
    }

    /**
     * Allows the competition type to be changed at runtime.
     *
     * @param comp the new type of competition
     */
    public void setCompetitionType(CompetitionType comp){
        competitionType = comp;
    }

    /**
     * Allows the bad behaviour type to be changed at runtime.
     *
     * @param bb the new bad behaviour of the horse
     */
    public void setBadBehaviour(BadBehaviour bb){
        badBehaviour = bb;
    }
}
