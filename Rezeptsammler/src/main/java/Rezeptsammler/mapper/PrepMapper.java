package Rezeptsammler.mapper;

import Rezeptsammler.DTO.PrepDTO;
import Rezeptsammler.model.Prep;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PrepMapper {


    Prep prepDTOToPrep(PrepDTO prepDTO);
    List<PrepDTO> prepDTOsToPrep(List<Prep> prepList);

    PrepDTO prepToPrepDTO(Prep prep);

    List<PrepDTO> prepsTOPrepDTO(List<Prep> prepList);

}
