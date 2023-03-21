package co.com.saimyr.domain.repository;

import co.com.saimyr.domain.dto.EntityDTO;

public interface EntityRepository {
    boolean exists(long entityId);
    EntityDTO get();
}
