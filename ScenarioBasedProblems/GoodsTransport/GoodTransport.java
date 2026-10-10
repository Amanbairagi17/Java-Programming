package ScenarioBasedProblems.GoodsTransport;

public class GoodTransport {
    protected String transportId;
    private String transportDate;
    private int transportRating;

    public GoodTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId() {
        return transportId;
    }


    public String getTransportDate() {
        return transportDate;
    }

    public int getTransportRating() {
        return transportRating;
    }
}
