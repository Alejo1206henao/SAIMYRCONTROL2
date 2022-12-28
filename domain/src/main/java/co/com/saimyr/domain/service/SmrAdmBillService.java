package co.com.saimyr.domain.service;

import co.com.saimyr.domain.Factura;
import co.com.saimyr.domain.SmrAdmBill;
import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.SmrAdmBillMvto;
import co.com.saimyr.domain.repository.SaimyrBillDetRepository;
import co.com.saimyr.domain.repository.SaimyrBillMvtoRepository;
import co.com.saimyr.domain.repository.SaimyrBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<SmrAdmBill> save (List<Factura> facturas){
        //saimyrBillDetRepository.save(this.buildAdmBillDet(facturas));
        return saimyrBillRepository.save(this.buildAdmBill(facturas));
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


    public List<SmrAdmBill> buildAdmBill (List<Factura> facturaList){
        List<SmrAdmBill> bills = new ArrayList<>();
        for (Factura factura: facturaList) {
            SmrAdmBill smrAdmBill = new SmrAdmBill();
            smrAdmBill.setConsMpio(factura.getConsMpio());
            smrAdmBill.setYear(2022);
            smrAdmBill.setIdElectronic(factura.getIdElectronico());
            smrAdmBill.setSmrNumber(factura.getNumero());
            smrAdmBill.setNumberId(factura.getIdentificacion());
            smrAdmBill.setName(factura.getNombre());
            smrAdmBill.setStatu(VIGENTE);
            smrAdmBill.setTotal(factura.getTotal());
            bills.add(smrAdmBill);
        }
        return bills;
    }

    public List<SmrAdmBillDet> buildAdmBillDet (List<Factura> facturaList) {
        List<SmrAdmBillDet> billDets = new ArrayList<>();
        for (Factura factura: facturaList) {
            SmrAdmBillDet admBillDet = new SmrAdmBillDet();
            admBillDet.setGift(factura.getRegalo());
            admBillDet.setUnitValue(factura.getValorUnitario());
            admBillDet.setTax(factura.getImpuestos());
            admBillDet.setGrossValue(factura.getValorBruto());
            admBillDet.setTotal(factura.getTotal());
            billDets.add(admBillDet);
        }

        return billDets;
    }

}
