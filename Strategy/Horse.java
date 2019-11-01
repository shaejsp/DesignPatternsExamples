import java.lang.Math;

public abstract class Horse {
    protected String name;
    protected CompetitionType competitionType;
    protected BadBehaviour badBehaviour;

    public void compete(){
        if(Math.random() > 0.75){
            badBehaviour.misbehave();
        }else {
            competitionType.compete();
        }
    }

    public void setCompetitionType(CompetitionType comp){
        competitionType = comp;
    }

    public void setBadBehaviour(BadBehaviour bb){
        badBehaviour = bb;
    }
}
