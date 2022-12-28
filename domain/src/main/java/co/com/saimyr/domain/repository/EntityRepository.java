package co.com.saimyr.domain.repository;

import co.com.saimyr.domain.dto.EntityDto;

public interface EntityRepository {
    boolean exists(long entityId);
    EntityDto get();
}
