public class Jumping implements CompetitionType{
    @Override
    public void compete() {
        System.out.println("The horse placed " + (int)(Math.random()*4 + 1) + " in a show jumping competition!");
    }
}
