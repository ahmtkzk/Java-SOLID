package openclosed.wrong;

public class Guitar {


    /*
     * we decide the Guitar is a little boring and could
     * use a cool flame pattern to make it look more rock and roll.
     * At this point, it might be tempting to just open up the Guitar
     * class and add a flame pattern — but who knows what errors that
     * might throw up in our application.
     * */

    private String make;
    private String model;
    private Integer volume;

    /*
    * We have been added the flameColor to this class. This is violating Open-Closed principle.
    *
    * */

    private String flameColor;

}
