package models;

import org.eclipse.microprofile.graphql.*;

/*
@Type should generate the following schema:
    # A starship from Starwars
    type Starship {
        id: String
        name: String
        length: Float
    }

@InputType should generate the following schema:
    # Input object for a starship
    input Starship {
        # uuid of a new Starship
        uuid: String
        name: String
        length: Float
    }
 */
@Type(name = "Starship", description = "A starship from Starwars")
@InputType(name = "StarshipInput", description = "Input object for a starship")
@FieldsOrder(fields = {"name", "id", "lentgth"})
@IgnoreFields(fields = {"color"})
public class Starship {
    @InputField(name = "uuid", description = "uuid of a new Starship")
    private String id;
    private String name;
    private float length;
    private String color;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
