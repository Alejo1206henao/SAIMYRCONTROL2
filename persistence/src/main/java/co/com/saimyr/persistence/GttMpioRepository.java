package co.com.saimyr.persistence;

import co.com.saimyr.domain.dto.EntityDTO;
import co.com.saimyr.domain.repository.EntityRepository;
import co.com.saimyr.persistence.crud.CrudGttMpio;
import co.com.saimyr.persistence.entity.SaimyrGttMunicipioCodigo;
import co.com.saimyr.persistence.mapper.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GttMpioRepository implements EntityRepository {
    private final CrudGttMpio crud;
    private final EntityMapper entityMapper;

    private SaimyrGttMunicipioCodigo gttMunicipioCodigo;

    @Autowired
    public GttMpioRepository(CrudGttMpio crud, EntityMapper entityMapper) {
        this.crud = crud;
        this.entityMapper = entityMapper;
    }

    @Override
    public boolean exists(long entityId) {
        return (gttMunicipioCodigo != null && gttMunicipioCodigo.getConsMpio() == entityId) || crud.existsById(entityId);
    }

    @Override
    public EntityDTO get() {
        if (gttMunicipioCodigo == null) {
            gttMunicipioCodigo = crud.findFirstBy().orElse(null);
        }

        return entityMapper.toEntity(gttMunicipioCodigo);
    }
}
