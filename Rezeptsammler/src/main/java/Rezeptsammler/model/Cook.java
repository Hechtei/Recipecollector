package Rezeptsammler.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cook {
    @Id
    @GeneratedValue
    private long id;


    private String forname;
    private String prename;
    private String username;
    private String password;

    @OneToMany(mappedBy = "cook", cascade = CascadeType.ALL)
    private List<Recipe> recipes;

    public Cook( String forname, String prename, String username, String password) {

        this.forname = forname;
        this.prename = prename;
        this.username = username;
        this.password = password;
    }
}