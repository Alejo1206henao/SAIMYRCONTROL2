package co.com.saimyr.persistence.crud;

import co.com.saimyr.persistence.entity.SaimyrGttMunicipioCodigo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CrudGttMpio extends CrudRepository<SaimyrGttMunicipioCodigo, Long> {
    Optional<SaimyrGttMunicipioCodigo> findFirstBy();
}
