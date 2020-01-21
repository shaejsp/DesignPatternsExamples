public class Jumping implements CompetitionType{
    @Override
    public int compete() {
    	int place = (int)(Math.random()*4 + 1);
        System.out.println("The horse placed " + place + " in a show jumping competition!");
        return place;
    }
}
