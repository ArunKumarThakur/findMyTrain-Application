package findMyTrain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TrainApplication {
    public static void main(String[] args) {
        TrainSystem trainSystem = new TrainSystem();

        //adding new Station
        Station station1 = new Station("ST01", "Agra");
        Station station2 = new Station("ST01", "Lucknow");

        //adding new trains;
        Train train1 = new Train("12408","Duranto Express","Exp");
        Train train2 = new Train("12608", "Intercity", "Local");

        //adding new Platform
        Platform platform1 = new Platform(1);
        Platform platform2 = new Platform(2);

        platform1.setTrain(train1);
        platform2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);
        station1.setPlatformList(platformList);

        Schedule schedule1 = new Schedule(train1, station1, "9:00AM", "9:05AM", platform1);
        Schedule schedule2 = new Schedule(train2, station2,"11:30AM", "11:35AM", platform2);
        trainSystem.addStations(station1);
        trainSystem.addStations(station2);
        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);
        trainSystem.addSchedule(schedule1);
        trainSystem.addSchedule(schedule2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Source Id");
        String source = sc.next();

        System.out.println("Enter destination Id");
        String destination = sc.next();

        List<Schedule> myTrains =  trainSystem.findMyTrains(source,destination);
        Train train = myTrains.get(0).getTrain();
        Schedule sch = myTrains.get(0);
        System.out.println(train.getTrainId() + " "+train.getTrainName() + " "+sch.getArrivalTime());
    }
}
