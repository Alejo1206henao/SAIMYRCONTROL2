package co.com.saimyr.persistence;

import co.com.saimyr.domain.SmrAdmBill;
import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.dto.BillAdmDetDTO;
import co.com.saimyr.domain.repository.SaimyrBillDetRepository;
import co.com.saimyr.domain.service.SmrAdmBillDetService;
import co.com.saimyr.persistence.crud.FacturaDetCrudRepository;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import co.com.saimyr.persistence.entity.SaimyrAdmFactura;
import co.com.saimyr.persistence.mapper.SmrAdmBillDetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class SaimyrAdmFacDetImple implements SaimyrBillDetRepository {

    private final FacturaDetCrudRepository facturaDetCrudRepository;
    private final SmrAdmBillDetMapper smrAdmBillDetMapper;

    @Autowired
    public SaimyrAdmFacDetImple(FacturaDetCrudRepository facturaDetCrudRepository, SmrAdmBillDetMapper smrAdmBillDetMapper) {
        this.facturaDetCrudRepository = facturaDetCrudRepository;
        this.smrAdmBillDetMapper = smrAdmBillDetMapper;
    }

    @Override
    public Optional<List<BillAdmDetDTO>> getByAll(int consBill) {
        return facturaDetCrudRepository.findByIdConsDet(consBill).map(admFacDet -> smrAdmBillDetMapper.toDetDto(admFacDet));
    }

    @Override
    public BillAdmDetDTO save (SmrAdmBillDet smrAdmBillDet) {
            SaimyrAdmFacDet saimyrAdmFacDet = smrAdmBillDetMapper.toSaimyrAdmDet(smrAdmBillDet);
            return smrAdmBillDetMapper.toBillDetDto(this.facturaDetCrudRepository.save(saimyrAdmFacDet));
    }
}
