package FlightControl.domain;

public class Place {

    private String ID;

    public Place(String ID) {
        this.ID = ID;
    }

    public Place() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public String toString() {
        return this.ID;
    }
}