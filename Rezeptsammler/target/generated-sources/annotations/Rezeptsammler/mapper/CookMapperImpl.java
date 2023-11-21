package Rezeptsammler.mapper;

import Rezeptsammler.DTO.CookDTO;
import Rezeptsammler.model.Cook;
import Rezeptsammler.model.Recipe;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-21T15:16:54+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class CookMapperImpl implements CookMapper {

    @Override
    public CookDTO cookToCookDTO(Cook cook) {
        if ( cook == null ) {
            return null;
        }

        CookDTO cookDTO = new CookDTO();

        cookDTO.setId( cook.getId() );
        cookDTO.setForname( cook.getForname() );
        cookDTO.setPrename( cook.getPrename() );
        cookDTO.setStars( cook.getStars() );
        List<Recipe> list = cook.getRecipes();
        if ( list != null ) {
            cookDTO.setRecipes( new ArrayList<Recipe>( list ) );
        }

        return cookDTO;
    }

    @Override
    public List<CookDTO> cooksToCooksDTO(List<Cook> CookList) {
        if ( CookList == null ) {
            return null;
        }

        List<CookDTO> list = new ArrayList<CookDTO>( CookList.size() );
        for ( Cook cook : CookList ) {
            list.add( cookToCookDTO( cook ) );
        }

        return list;
    }

    @Override
    public Cook cookDTOToCook(CookDTO cookDTO) {
        if ( cookDTO == null ) {
            return null;
        }

        Cook cook = new Cook();

        cook.setId( cookDTO.getId() );
        cook.setForname( cookDTO.getForname() );
        cook.setPrename( cookDTO.getPrename() );
        cook.setStars( cookDTO.getStars() );
        List<Recipe> list = cookDTO.getRecipes();
        if ( list != null ) {
            cook.setRecipes( new ArrayList<Recipe>( list ) );
        }

        return cook;
    }

    @Override
    public List<Cook> cooksDTOToCooks(List<CookDTO> cookDTOList) {
        if ( cookDTOList == null ) {
            return null;
        }

        List<Cook> list = new ArrayList<Cook>( cookDTOList.size() );
        for ( CookDTO cookDTO : cookDTOList ) {
            list.add( cookDTOToCook( cookDTO ) );
        }

        return list;
    }
}
