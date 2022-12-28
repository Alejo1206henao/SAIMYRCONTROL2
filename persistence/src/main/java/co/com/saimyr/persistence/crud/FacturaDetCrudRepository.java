package co.com.saimyr.persistence.crud;

import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDetPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FacturaDetCrudRepository extends JpaRepository<SaimyrAdmFacDet, SaimyrAdmFacDetPK> {

    Optional<List<SaimyrAdmFacDet>> findByIdConsDet(int consDet);
}
