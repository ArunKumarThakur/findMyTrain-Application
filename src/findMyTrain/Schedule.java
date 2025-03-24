package findMyTrain;

import java.time.LocalDateTime;

public class Schedule {
     private Train train;
     private Station station;
     private String arrivalTime;
     private String departure;
     private Platform platform;

    public Schedule(Train train, Station station, String arrivalTime, String departure, Platform platform) {
        this.train = train;
        this.station = station;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.platform = platform;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", arrivalTime=" + arrivalTime +
                ", departure=" + departure +
                ", platform=" + platform +
                '}';
    }
}
