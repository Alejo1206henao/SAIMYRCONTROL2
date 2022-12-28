package co.com.saimyr.persistence;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.repository.SaimyrBillDetRepository;
import co.com.saimyr.persistence.crud.FacturaDetCrudRepository;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import co.com.saimyr.persistence.mapper.SmrAdmBillDetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SaimyrAdmFacDetImple implements SaimyrBillDetRepository {

    private final FacturaDetCrudRepository facturaDetCrudRepository;
    private final SmrAdmBillDetMapper mapper;

    @Autowired
    public SaimyrAdmFacDetImple(FacturaDetCrudRepository facturaDetCrudRepository, SmrAdmBillDetMapper mapper) {
        this.facturaDetCrudRepository = facturaDetCrudRepository;
        this.mapper = mapper;
    }


    @Override
    public Optional<List<SmrAdmBillDet>> getByDet(int consDet) {
        return Optional.empty();
    }

    @Override
    public List<SmrAdmBillDet> save(List<SmrAdmBillDet> billDetList) {
        return null;
    }
}
