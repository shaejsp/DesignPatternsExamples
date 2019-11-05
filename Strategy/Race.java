import java.lang.Math;

public class Race implements CompetitionType{
    @Override
    public void compete() {
        //randomizes how well the horse placed (1st-5th)
        System.out.println("The horse placed " + (int)(Math.random()*4 + 1) + " in a race!");
    }
}
