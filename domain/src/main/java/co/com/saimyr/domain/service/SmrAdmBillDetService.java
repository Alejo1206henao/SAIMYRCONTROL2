package co.com.saimyr.domain.service;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.SmrBill;
import co.com.saimyr.domain.dto.BillAdmDetDTO;
import co.com.saimyr.domain.repository.SaimyrBillDetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SmrAdmBillDetService {

    private final SaimyrBillDetRepository saimyrBillDetRepository;

    @Autowired
    public SmrAdmBillDetService(SaimyrBillDetRepository saimyrBillDetRepository) {
        this.saimyrBillDetRepository = saimyrBillDetRepository;
    }

    public Optional<List<BillAdmDetDTO>> getByDet(int consDet){
        return saimyrBillDetRepository.getByAll(consDet);
    }

    public BillAdmDetDTO save (SmrAdmBillDet smrAdmBillDet){
        return saimyrBillDetRepository.save(smrAdmBillDet);
    }


//    public List<SmrAdmBillDet> buildAdmBillDet (List<SmrBill> smrBillList) {
//        List<SmrAdmBillDet> billDets = new ArrayList<>();
//        for (SmrBill smrBill : smrBillList) {
//            SmrAdmBillDet admBillDet = new SmrAdmBillDet();
//            admBillDet.setGift(smrBill.getRegalo());
//            admBillDet.setUnitValue(smrBill.getValorUnitario());
//            admBillDet.setTax(smrBill.getImpuestos());
//            admBillDet.setGrossValue(smrBill.getValorBruto());
//            admBillDet.setTotal(smrBill.getTotal());
//            billDets.add(admBillDet);
//        }
//
//        return billDets;
//    }
}

