package co.com.saimyr.domain.service;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.repository.SaimyrBillDetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmrAdmBillDetService {

    private final SaimyrBillDetRepository saimyrBillDetRepository;

    @Autowired
    public SmrAdmBillDetService(SaimyrBillDetRepository saimyrBillDetRepository) {
        this.saimyrBillDetRepository = saimyrBillDetRepository;
    }

    public Optional<List<SmrAdmBillDet>> getByIdDet(int consDet){
        return saimyrBillDetRepository.getByDet(consDet);
    }


}
