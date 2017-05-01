package model;


import java.util.Date;

public class TripInfo {

    private Double price;
    private Date timeOfTrip;
    private Integer passangersCount;

    public Integer getPassangersCount() {
        return passangersCount;
    }

    public void setPassangersCount(Integer passangersCount) {
        this.passangersCount = passangersCount;
    }

    public Date getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(Date timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
