package Rezeptsammler.controller;

import Rezeptsammler.DTO.CookDTO;
import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.service.RecipeService;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThControllerImpl {

    RecipeService recipeService;

    public ThControllerImpl(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/")
    public ModelAndView getHomepage(){
        List<RecipeDTO> list = recipeService.getAllRecipes();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("recipes",list);
        return modelAndView;
    }

    @PostMapping("/speichern")
    public String addRecipe(@RequestParam String recipeTitel){
    return "";
    }

    @GetMapping("/create")
    public String getCreate(){return "create";}

    @GetMapping("/signup")
    public String getSignUp(){return "signup";}
    @GetMapping("/login")
    public String getLogin(){return "login";}
}
