package Rezeptsammler.service;

import Rezeptsammler.DTO.CookDTO;
import Rezeptsammler.model.Cook;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CookService {
    List<CookDTO> getAllCooks();
    CookDTO getCookById(Long id);

    CookDTO addNewCook(CookDTO cookDTO);

}
