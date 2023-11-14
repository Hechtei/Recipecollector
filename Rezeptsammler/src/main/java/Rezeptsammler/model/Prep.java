package Rezeptsammler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Prep {

    @Id
    @GeneratedValue
    private long id;

    private int portions;

    private String complexity;

    private String execution;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "used_ingredients"
            ,joinColumns = {
            @JoinColumn(name = "prep", nullable = false, referencedColumnName = "id")}
            ,inverseJoinColumns = {
            @JoinColumn(name ="ingredient", nullable = false, referencedColumnName = "id")})
    private List<Ingredient> ingredients;


    @OneToOne(mappedBy = "preparation", cascade = CascadeType.ALL)
    private Recipe recipe;

    public Prep(int portions, String complexity, String execution) {
        this.portions = portions;
        this.complexity = complexity;
        this.execution = execution;

    }
}
