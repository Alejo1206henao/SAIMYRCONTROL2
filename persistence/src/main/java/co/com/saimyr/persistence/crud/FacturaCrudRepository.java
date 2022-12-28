package co.com.saimyr.persistence.crud;

import co.com.saimyr.persistence.entity.SaimyrAdmFacPK;
import co.com.saimyr.persistence.entity.SaimyrAdmFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FacturaCrudRepository extends JpaRepository<SaimyrAdmFactura, SaimyrAdmFacPK> {
    List<SaimyrAdmFactura> findBySmrNumero(String smrNumero);

    List<SaimyrAdmFactura> findByFecha(LocalDate fecha);

    Optional<List<SaimyrAdmFactura>> findByEstado(String estado);

    @Query(value = "" +
            "SELECT     Nvl(Max(cons_pers), 0) + 1 " +
            "FROM       saimyr_adm_fac ", nativeQuery = true)
    long getMaxControlId();
}
