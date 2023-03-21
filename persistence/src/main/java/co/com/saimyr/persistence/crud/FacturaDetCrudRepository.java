package co.com.saimyr.persistence.crud;

import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDetPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FacturaDetCrudRepository extends JpaRepository<SaimyrAdmFacDet, SaimyrAdmFacDetPK> {
    @Query ( value = "SELECT NVL (MAX (cons_det) + 1, 1) FROM saimyr_adm_fac_det", nativeQuery = true )
    Optional<List<SaimyrAdmFacDet>> findByIdConsDet(int consDet);
//    Optional<List<SaimyrAdmFacDet>>findByTotal(int total); falta prueba

}
