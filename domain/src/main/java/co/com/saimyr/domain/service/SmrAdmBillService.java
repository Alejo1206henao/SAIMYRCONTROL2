package co.com.saimyr.domain.service;

import co.com.saimyr.domain.SmrBill;
import co.com.saimyr.domain.SmrAdmBill;
import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.repository.SaimyrBillDetRepository;
import co.com.saimyr.domain.repository.SaimyrBillMvtoRepository;
import co.com.saimyr.domain.repository.SaimyrBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SmrAdmBillService {

    private static final String VIGENTE = "V";
    private final SaimyrBillRepository saimyrBillRepository;
    private final SaimyrBillDetRepository saimyrBillDetRepository;
    private final SaimyrBillMvtoRepository saimyrBillMvtoRepository;

    @Autowired
    public SmrAdmBillService(SaimyrBillRepository saimyrBillRepository, SaimyrBillDetRepository saimyrBillDetRepository, SaimyrBillMvtoRepository saimyrBillMvtoRepository) {
        this.saimyrBillRepository = saimyrBillRepository;
        this.saimyrBillDetRepository = saimyrBillDetRepository;
        this.saimyrBillMvtoRepository = saimyrBillMvtoRepository;
    }

    public List<SmrAdmBill> getAll(){
        return saimyrBillRepository.getAll();
    }

    public List<SmrAdmBill> getById(String smrNumber){
        return saimyrBillRepository.getById(smrNumber);
    }

    public List<SmrAdmBill> getByDate (LocalDate date){
        return saimyrBillRepository.getByDate(date);
    }

    public Optional<List<SmrAdmBill>> getByStatu (String statu){
        return saimyrBillRepository.getByStatu(statu);
    }

    @Transactional
    public List<SmrAdmBill> save (List<SmrAdmBill> smrAdmBills){
        //saimyrBillDetRepository.save(this.buildAdmBillDet(facturas))
        return saimyrBillRepository.save(smrAdmBills);
    }





//    public List<SmrAdmBillMvto> buidAdmBillMvto (List<Factura> facturaList){
//        List<SmrAdmBillMvto> billMvtos = new ArrayList<>();
//        for (Factura factura: facturaList) {
//            SmrAdmBillMvto smrAdmBillMvto = new SmrAdmBillMvto();
//            smrAdmBillMvto.setMvtoDate();
//            smrAdmBillMvto.setSoportDoc();
//            smrAdmBillMvto.setPayType();
//            smrAdmBillMvto.setUser();
//            smrAdmBillMvto.getValue();
//            smrAdmBillMvto.getValue();
//            billMvtos.add(smrAdmBillMvto);
//        }
//        return billMvtos;
//    }

}
