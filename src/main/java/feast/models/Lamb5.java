package feast.models;

public class Lamb5 {

    // @Bean injection
    private final Goat6 goat6;
    public Lamb5(Goat6 goat6) {
        this.goat6 = goat6;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a goat, " + goat6.toString();
    }
}
