package Model;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Driver> teamDrivers;
    private Car teamCar;

    public Team(String name) {
        this.teamName = name;
        this.teamDrivers = new ArrayList<>();
        this.teamCar = null;
    }

    public void addDriver(Driver newDriver) {
        teamDrivers.add(newDriver);
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamCar(Car teamCar) {
        this.teamCar = teamCar;
    }
}
