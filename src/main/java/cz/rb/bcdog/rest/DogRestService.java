package cz.rb.bcdog.rest;

import cz.rb.bcdog.domain.mapper.DogMapper;
import cz.rb.bcdog.domain.service.DogService;
import cz.rb.projectcommon.model.DogListMessage;
import cz.rb.projectcommon.model.DogMessage;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
@RequiredArgsConstructor
@Slf4j
public class DogRestService {

    private final DogService dogService;
    private final DogMapper dogMapper;

    @GetMapping("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<DogListMessage> getDogs() {
        log.info("DogRestService | getAllDogs001 | starting request");
        var response = dogService.getDogs();
        log.info("DogRestService | getAllDogs002 | request finished: {}", response);
        return ResponseEntity.ok(dogMapper.toDogMessageList(response));
    }

    @GetMapping("/{dogName}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<DogMessage> getDog(final @PathVariable("dogName") String dogname) {
        log.info("DogRestService | getDog001 | starting request");
        var response = dogService.getDog(dogname);
        log.info("DogRestService | getDog002 | request finished: {}", response);
        return ResponseEntity.ok(dogMapper.toDogMessage(response));
    }
}