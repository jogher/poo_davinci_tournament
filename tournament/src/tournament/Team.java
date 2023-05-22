package tournament;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> Players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return Players;
    }

    public void setPlayers(ArrayList<Player> Players) {
        this.Players = Players;
    }
}
