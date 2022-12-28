package co.com.saimyr.web.controller;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.service.SmrAdmBillDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Det")
public class SaimyrAdmBillDetController {

    private final SmrAdmBillDetService smrAdmBillDetService;

    @Autowired
    public SaimyrAdmBillDetController(SmrAdmBillDetService smrAdmBillDetService) {
        this.smrAdmBillDetService = smrAdmBillDetService;
    }

    @GetMapping("/getDet/{consDet}")
    public Optional<List<SmrAdmBillDet>> getByDet (@PathVariable("consDet") int consDet){
        return smrAdmBillDetService.getByIdDet(consDet);
    }
}
