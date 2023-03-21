package co.com.saimyr.web.controller;

import co.com.saimyr.domain.dto.EntityDTO;
import co.com.saimyr.domain.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/api/entity")
public class EntityController {
    private final EntityService entityService;

    @Autowired
    public EntityController(EntityService entityService) {
        this.entityService = entityService;
    }

    @GetMapping
    public ResponseEntity<EntityDTO> get() {
        return ResponseEntity.ok(entityService.get());
    }
}
