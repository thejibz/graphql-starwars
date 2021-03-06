package services;

import models.Character;
import models.Tweet;
import org.eclipse.microprofile.graphql.*;

import java.util.List;
import java.util.concurrent.Flow;

public class CharacterService {
    /*
    @Query should generate the following schema:
    type Query {
        #Returns all the friends of a character
        getFriendsOf(character: CharacterInput): [Character]
    }

    Note:
    While the type of the method parameter and the return type were the same (Character) in Java,
    two distinct types are generated in the GraphQL schema (Character and CharacterInput).
    This is necessary as input and object types are defined separately in the GraphQL spec.
     */
    @Query(value = "getFriendsOf", description = "Returns all the friends of a character")
    public List<Character> getFriendsOf(Character character) {
        // ...
        return null;
    }

    /*
    @Mutation should generate the following schema:
    type Mutation {
        #Save a new character
        addCharacter(character: CharacterInput): Character
    }

    Note:
    While the type of the method parameter and the return type were the same (Character) in Java,
    two distinct types are generated in the GraphQL schema (Character and CharacterInput).
    This is necessary as input and object types are defined separately in the GraphQL spec.
     */
    @Mutation(name = "addCharacter", description = "Save a new character")
    public Character save(Character character) {
        // ...
        return null;
    }

    /*
    @Subscription should generate the following schema:
    type Subscription {
        #Get notified when a new character enter the story
        onNewCharacter(clientSubscriptionId: String): Character
    }

    Note:
    Inspired by this blog post https://graphql.org/blog/subscriptions-in-graphql-and-relay/ and
    https://github.com/apollographql/graphql-subscriptions
    We assume that an event-publishing mechanism is in place on the server (like MQTT) and
    that this mechanism needs a clientSubscriptionId to know which clients subscribed.
     */
    @Subscription(name = "onNewCharacter", description = "Get notified when a new character enter the story")
    public Flow.Publisher<Character> onNewCharacter(String clientSubscriptionId) {
        // ...
        return null;
    }

    /*
    @Argument should generate the following schema:
    type Query {
        #Search characters by name
        #name: Search terms
        searchByName(name: String = "Han Solo"): [Character]
    }
     */
    @Query(value = "searchByName", description = "Search characters by name")
    public List<Character> getByName(
            @Argument(name = "name", defaultValue = "Han Solo", description = "Search terms")
                    String search) {
        // ...

        return null;
    }

    /*
    @Source should generate the following schema:
        type Character {
            # Other fields ...
            tweets: [Tweet]
        }
     */
    @Query(value = "tweets", description = "Get the last tweets for a character")
    public List<Tweet> tweets(@Source Character character) {
        // Contact Twitter to fetch the Tweets about this book
        return null;
    }
}
