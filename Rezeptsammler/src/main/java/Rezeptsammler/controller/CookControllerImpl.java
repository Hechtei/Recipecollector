package Rezeptsammler.controller;

import Rezeptsammler.DTO.CookDTO;
import Rezeptsammler.service.CookService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cooks")
public class CookControllerImpl implements CookController{

    CookService cookService;

    @GetMapping
    public List<CookDTO> getAllCooks(){return cookService.getAllCooks();}

    @PostMapping
    public CookDTO addNewCook(@RequestBody CookDTO cookDTO){ return cookService.addNewCook(cookDTO);}

    @GetMapping("/{CookId}")
    public CookDTO getCookById(@Parameter(description = "The unique cookId")
                                   @PathVariable("cookId") long cookId){ return cookService.getCookById(cookId);}


}
