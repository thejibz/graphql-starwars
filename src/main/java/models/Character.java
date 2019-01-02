package models;

import java.util.List;

public abstract class Character implements IEntity {
    protected String id;
    protected String name;
    protected List<Character> friends;
    protected List<Episode> appearsIn;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Character> getFriends() {
        return this.friends;
    }
    public void setFriends(List<Character> friends) {
        this.friends = friends;
    }

    public List<Episode> getAppearsIn() {
        return this.appearsIn;
    }
    public void setAppearsIn(List<Episode> episodes) {
        this.appearsIn = episodes;
    }
}
