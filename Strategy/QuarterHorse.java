public class QuarterHorse extends Horse{
    /**
     * Quarter Horse constructor
     * @param n the name of the horse as a String
     * @param c the competition type for the horse
     * @param b the bad behaviour for the horse
     */
    public QuarterHorse(String n, CompetitionType c, BadBehaviour b) {
        super(n, c, b);
    }

    /**
     * Quarter Horse constructor - sets default CompetitionType to Polebending
     * and BadBehaviour as Buck
     * @param n the name of the horse as a String
     */
    public QuarterHorse(String n) {
        super(n, new Polebending(), new Buck());
    }
}
