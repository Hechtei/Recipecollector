package Rezeptsammler.controller;

import Rezeptsammler.DTO.CookDTO;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CookController {
    @GetMapping
    List<CookDTO> getAllCooks();

    @PostMapping
    CookDTO addNewCook(@RequestBody CookDTO cookDTO);

    @GetMapping
    CookDTO getCookById(@Parameter(description = "The unique cookId")
                        @PathVariable("cookId") long cookId);
}
