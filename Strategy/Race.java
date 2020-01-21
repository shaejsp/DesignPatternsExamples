import java.lang.Math;

public class Race implements CompetitionType{
    @Override
    public int compete() {
        //randomizes how well the horse placed (1st-5th)
        int place = (int)(Math.random()*4 + 1);
        System.out.println("The horse placed " + place + " in a race!");
        return place;
    }
}
