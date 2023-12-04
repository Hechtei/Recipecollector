package Rezeptsammler.controller;

import Rezeptsammler.DTO.IngredientDTO;
import Rezeptsammler.DTO.PrepDTO;
import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.service.RecipeService;
import Rezeptsammler.service.RecipeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.h2.command.dml.Delete;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@WebMvcTest(controllers = RecipeControllerImpl.class)
public class RecipeControllerImplTest {

    @MockBean
    private RecipeService recipeService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    //Test Entities
    private List<RecipeDTO> recipeList;
    private RecipeDTO recipe_01;
    private RecipeDTO recipe_02;

    private final String controllerPath = "/api/recipes";

    @BeforeEach
    public void setUp() {

        IngredientDTO ingredientDTO_01 = new IngredientDTO(1, "banane", "pices", 1);
        IngredientDTO ingredientDTO_02 = new IngredientDTO(2, "Milch", "liter", 1);

        PrepDTO prepDTO = new PrepDTO(1, 4, "easy", "But banana Mouth");
        PrepDTO prepDTO_02 = new PrepDTO(2, 4, "middle", "bla bla bla");

        prepDTO.setIngredients(List.of(ingredientDTO_01));
        prepDTO_02.setIngredients(List.of(ingredientDTO_01, ingredientDTO_02));


        recipe_01 = new RecipeDTO(1,"Banane", "Wie esse ich eine Banane", prepDTO, 5.0, 100, true, true);
        recipe_02 = new RecipeDTO(2,"Bananenmilch", "So machst du Bananenmilch", prepDTO_02, 1.0, 200, true, false);

        recipe_01.setPreparation(prepDTO);
        recipe_02.setPreparation(prepDTO_02);
        recipeList = List.of(recipe_01, recipe_02);
    }

    @Test
    public void shouldSuccesfullyReturnAllRecipes() throws Exception {
        when(recipeService.getAllRecipes()).thenReturn(recipeList);

        this.mockMvc.perform(get(controllerPath))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.*", hasSize(2)))
                .andExpect(jsonPath("$[0].title", is(recipe_01.getTitle())))
                .andExpect(jsonPath("$[0].description", is(recipe_01.getDescription())))
                .andExpect(jsonPath("$[0].preparation.id", is(Long.valueOf(recipe_01.getPreparation().getId()).intValue())))
                .andExpect(jsonPath("$[0].preparation.portions", is(recipe_01.getPreparation().getPortions())))
                .andExpect(jsonPath("$[0].preparation.complexity", is(recipe_01.getPreparation().getComplexity())))
                .andExpect(jsonPath("$[0].preparation.execution", is(recipe_01.getPreparation().getExecution())))
                .andExpect(jsonPath("$[0].rating", is(recipe_01.getRating())))
                .andExpect(jsonPath("$[0].kcal", is(recipe_01.getKcal())))
                .andExpect(jsonPath("$[0].vegetarian", is(recipe_01.isVegetarian())))
                .andExpect(jsonPath("$[0].vegan", is(recipe_01.isVegan())))
                .andDo(print());

        verify(recipeService).getAllRecipes();
    }

    @Test
    public void shouldSuccessfullyReturnRecipeById() throws Exception {
        when(recipeService.getRecipeById(1)).thenReturn(recipe_01);

        this.mockMvc.perform(get(controllerPath + "/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.*", hasSize(9)))
                .andExpect(jsonPath("$.title", is(recipe_01.getTitle())))
                .andExpect(jsonPath("$.description", is(recipe_01.getDescription())))
                .andExpect(jsonPath("$.preparation.id", is(Long.valueOf(recipe_01.getPreparation().getId()).intValue())))
                .andExpect(jsonPath("$.preparation.portions", is(recipe_01.getPreparation().getPortions())))
                .andExpect(jsonPath("$.preparation.complexity", is(recipe_01.getPreparation().getComplexity())))
                .andExpect(jsonPath("$.preparation.execution", is(recipe_01.getPreparation().getExecution())))
                .andExpect(jsonPath("$.rating", is(recipe_01.getRating())))
                .andExpect(jsonPath("$.kcal", is(recipe_01.getKcal())))
                .andExpect(jsonPath("$.vegetarian", is(recipe_01.isVegetarian())))
                .andExpect(jsonPath("$.vegan", is(recipe_01.isVegan())))
                .andDo(print());

        verify(recipeService).getRecipeById(1);
    }

    @Test
    public void shouldSuccessfullyDeleteRecipe() throws Exception{
        doNothing().when(recipeService).deleteRecipeById(anyLong());
        this.mockMvc.perform(delete(controllerPath + "/1"))
                .andExpect(status().isOk());

        verify(recipeService).deleteRecipeById(anyLong());
    }




}
