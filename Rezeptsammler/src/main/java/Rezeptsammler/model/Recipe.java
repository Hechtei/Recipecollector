package Rezeptsammler.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity

public class Recipe {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "preparation_id", nullable = false)
    private Prep preparation;

    private double rating;

    private int kcal;

    private boolean vegetarian;

    private boolean vegan;

    public Recipe(String title, String description, double rating, int kcal, boolean vegetarian, boolean vegan) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.kcal = kcal;
        this.vegetarian = vegetarian;
        this.vegan = vegan;
    }
}
