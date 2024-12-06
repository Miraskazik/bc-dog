package cz.rb.bcdog.domain.service;

import cz.rb.bcdog.domain.mapper.DogMapper;
import cz.rb.bcdog.domain.repository.DogRepository;
import cz.rb.bcdog.model.Dog;
import cz.rb.projectcommon.model.dog.DogMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DogService {

    private final DogMapper dogMapper;

    private final DogRepository dogRepository;

    public List<Dog> getDogs() {
        return dogMapper.toDog(dogRepository.findAll());
    }

    public Dog getDog(final String dogName) {
        var dogs = dogRepository.findByNameEqualsIgnoreCase(dogName);
        return dogMapper.toDog(dogs.getFirst());
    }

    public DogMessage addDog(final DogMessage dog) {
        var dogEntity = dogMapper.toDogEntity(dog);
        var savedDog = dogRepository.saveAndFlush(dogEntity);
        return dogMapper.toDogMessage(savedDog);
    }
}
