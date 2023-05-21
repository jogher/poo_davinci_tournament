import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<player> players) {
        this.players = players;
    }
}
