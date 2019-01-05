package models;

import org.eclipse.microprofile.graphql.Type;

import java.util.List;

/*
@Type should generate the following schema:
    # A character in Starwars
    interface Character {
        id: String
        name: String
        friends: [Character]
        appearsIn: [Episode]
    }
 */
@Type(name = "MovieCharacter", description = "A character in Starwars")
public interface Character {
    public String getId();

    public void setId(String id);

    public String getName();

    public void setName(String name);

    public List<Character> getFriends();

    public void setFriends(List<Character> friends);

    public List<Episode> getAppearsIn();

    public void setAppearsIn(List<Episode> episodes);
}
