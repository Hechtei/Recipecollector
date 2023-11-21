package Rezeptsammler.service;

import Rezeptsammler.DTO.CookDTO;
import Rezeptsammler.mapper.CookMapper;
import Rezeptsammler.model.Cook;
import Rezeptsammler.repository.CookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookServiceImpl implements CookService{

    CookRepository cookRepository;

    CookMapper cookMapper;

    public CookServiceImpl(CookRepository cookRepository, CookMapper cookMapper) {
        this.cookRepository = cookRepository;
        this.cookMapper = cookMapper;
    }

    @Override
    public List<CookDTO> getAllCooks() {
        return this.cookMapper.cooksToCooksDTO(cookRepository.findAll());
    }

    @Override
    public CookDTO getCookById(Long id) {
        return this.cookMapper.cookToCookDTO(this.cookRepository.getById(id));
    }

    @Override
    public CookDTO addNewCook(CookDTO cookDTO) {
        Cook tmp = cookMapper.cookDTOToCook(cookDTO);

        return cookMapper.cookToCookDTO(cookRepository.save(tmp));

    }
}
