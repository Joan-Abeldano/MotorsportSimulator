package Model;

import java.util.ArrayList;

public class Championship {
    private String championshipName;
    private ArrayList<Event> championshipEvents;
    private ArrayList<GrandPrix> championshipGPs;
    private ArrayList<Team> championshipTeams;
    private ArrayList<Integer> pointSystem;
    //Championship rules
    private int fastestLapPoints;
    private int maxDriverPerTeam;
    private int minDriversPerTeam;
    private boolean weatherEnabled;
    private int minPitStops;
    private boolean carUpgradesEnabled;
    private boolean safetyCarEnabled;
    private boolean virtualSafetyCarEnabled;
    private boolean redFlagEnabled;

    public Championship(String championshipName) {
        this.championshipName = championshipName;
    }


}
