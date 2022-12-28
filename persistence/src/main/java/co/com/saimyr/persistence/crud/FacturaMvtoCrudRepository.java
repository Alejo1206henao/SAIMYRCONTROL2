package co.com.saimyr.persistence.crud;

import co.com.saimyr.persistence.entity.SaimyrAdmFacMvto;
import co.com.saimyr.persistence.entity.SaimyrAdmFacMvtoPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FacturaMvtoCrudRepository extends JpaRepository<SaimyrAdmFacMvto, SaimyrAdmFacMvtoPK> {

    Optional<List<SaimyrAdmFacMvto>> findByIdConsMvto(int consMvto);
}
