package cz.rb.bcdog.domain.repository;

import cz.rb.bcdog.domain.repository.entity.DogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<DogEntity, Long> {

    List<DogEntity> findByNameEqualsIgnoreCase(final String name);
}
