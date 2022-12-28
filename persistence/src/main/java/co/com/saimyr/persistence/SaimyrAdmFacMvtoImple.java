package co.com.saimyr.persistence;

import co.com.saimyr.domain.SmrAdmBillMvto;
import co.com.saimyr.domain.repository.SaimyrBillMvtoRepository;
import co.com.saimyr.persistence.crud.FacturaMvtoCrudRepository;
import co.com.saimyr.persistence.entity.SaimyrAdmFacMvto;
import co.com.saimyr.persistence.mapper.SmrAdmBillMvtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SaimyrAdmFacMvtoImple implements SaimyrBillMvtoRepository {
    private final FacturaMvtoCrudRepository facturaMvtoCrudRepository;
    private final SmrAdmBillMvtoMapper mapper;

    @Autowired
    public SaimyrAdmFacMvtoImple(FacturaMvtoCrudRepository facturaMvtoCrudRepository, SmrAdmBillMvtoMapper mapper) {
        this.facturaMvtoCrudRepository = facturaMvtoCrudRepository;
        this.mapper = mapper;
    }
    @Override
    public Optional<List<SmrAdmBillMvto>> getByMvto (int consMvto){
        Optional<List<SaimyrAdmFacMvto>> saimyrAdmFacMvtos = facturaMvtoCrudRepository.findByIdConsMvto(consMvto);
        return Optional.empty();
    }

}
