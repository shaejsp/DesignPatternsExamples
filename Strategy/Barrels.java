public class Barrels implements CompetitionType{
    @Override
    public int compete() {
    	int place = (int)(Math.random()*4 + 1);
        System.out.println("The horse placed " + place + " in a barrel racing competition!");
        return place;
    }
}
