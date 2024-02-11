package by.itacademy.flat.controller;
import by.itacademy.flat.controller.converter.PageImplJacksonSerializer;
import by.itacademy.flat.controller.dto.RequestFlatDto;
import by.itacademy.flat.controller.dto.ResponseFlatDto;
import by.itacademy.flat.error.exception.IllegalValueException;
import by.itacademy.flat.service.FlatService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flats")
public class FlatController {

    private final FlatService flatService;
    private final ObjectMapper objectMapper;

    public FlatController(FlatService flatService) {
        this.flatService = flatService;
        this.objectMapper = JsonMapper.builder()
                .addModules()
                .build();
    }

    @GetMapping
    @JsonSerialize(using = PageImplJacksonSerializer.class)
    public ResponseEntity<Page<ResponseFlatDto>> getFlats(@PageableDefault(value = 20, page = 1) Pageable pageable,
                                                          RequestFlatDto request) throws IllegalValueException {
       return ResponseEntity.ok(flatService.getFlatsPage(request,pageable));
    }

}
