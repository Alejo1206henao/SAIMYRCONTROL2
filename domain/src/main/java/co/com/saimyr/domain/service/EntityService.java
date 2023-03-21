package co.com.saimyr.domain.service;

import co.com.saimyr.domain.dto.EntityDTO;
import co.com.saimyr.domain.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
    private final EntityRepository entityRepository;

    @Autowired
    public EntityService(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    public EntityDTO get() {
        return entityRepository.get();
    }
}
