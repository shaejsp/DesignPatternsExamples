public class Thoroughbred extends Horse {

    /**
     * Thoroughbred constructor
     * @param n the name of the horse as a String
     * @param c the competition type for the horse
     * @param b the bad behaviour for the horse
     */
    public Thoroughbred(String n, CompetitionType c, BadBehaviour b) {
        super(n, c, b);
    }

    /**
     * Thoroughbred constructor - sets default CompetitionType to Race
     * and default BadBehaviour to Bolt
     * @param n the name of the horse as a String
     */
    public Thoroughbred(String n) {
        super(n, new Race(), new Bolt());
    }
}
