package Rezeptsammler.DTO;

import Rezeptsammler.model.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CookDTO {
    private long id;
    private String forname;
    private String prename;
    private String username;
    private String password;
    private List<RecipeDTO> recipes;

    public CookDTO(long id, String forname, String prename, String username, String password) {
        this.id = id;
        this.forname = forname;
        this.prename = prename;
        this.username = username;
        this.password = password;
    }
}
