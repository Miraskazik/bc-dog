package cz.rb.bcdog.domain.mapper;

import cz.rb.bcdog.domain.repository.entity.DogEntity;
import cz.rb.bcdog.model.Dog;
import cz.rb.projectcommon.model.dog.DogListMessage;
import cz.rb.projectcommon.model.dog.DogMessage;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, uses = {GenderMapper.class})
public interface DogMapper {

    /**
     * Maps a DogEntity object to a Dog object.
     *
     * @param dogEntity The DogEntity object to be mapped
     * @return The mapped Dog object
     */
    Dog toDog(DogEntity dogEntity);

    DogEntity toDogEntity(DogMessage dog);

    DogMessage toDogMessage(DogEntity dog);

    List<Dog> toDog(List<DogEntity> dogEntity);

    default DogListMessage toDogMessageList(List<Dog> dogModels) {
        return DogListMessage
                .builder()
                .dogMessageList(toDogMessage(dogModels))
                .build();
    }

    List<DogMessage> toDogMessage(List<Dog> dogModels);

    DogMessage toDogMessage(Dog dogModel);
}
