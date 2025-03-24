package findMyTrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    private Map<String, Station> stationMap = new HashMap<>();
    private Map<String, Train> trainMap = new HashMap<>();
    private List<Schedule> scheduleList = new ArrayList<>();

    public void addStations(Station station) {
         stationMap.put(station.getStationId(), station);
    }

    public void addTrain(Train train) {
        trainMap.put(train.getTrainId(), train);
    }

    public void addSchedule(Schedule schedule) {
         scheduleList.add(schedule);
    }

    public List<Schedule> findMyTrains(String startStationId, String endStationId) {
        List<Schedule> res = new ArrayList<>();
        for(Schedule schedule : scheduleList) {
            if(schedule.getStation().getStationId().equalsIgnoreCase(startStationId)
                || schedule.getStation().getStationId().equalsIgnoreCase((endStationId))
            ) {
            res.add(schedule);
            }
        }
        return res;
    }
}
