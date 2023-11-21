package Rezeptsammler.mapper;

import Rezeptsammler.DTO.CookDTO;
import Rezeptsammler.model.Cook;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CookMapper {
    CookDTO cookToCookDTO(Cook cook);
    List<CookDTO> cooksToCooksDTO(List<Cook> CookList);

    Cook cookDTOToCook(CookDTO cookDTO);
    List<Cook> cooksDTOToCooks(List<CookDTO> cookDTOList);
}
