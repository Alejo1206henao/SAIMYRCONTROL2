package co.com.saimyr.web.controller;

import co.com.saimyr.domain.SmrAdmBill;
import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.SmrBill;
import co.com.saimyr.domain.dto.BillAdmDetDTO;
import co.com.saimyr.domain.dto.SmrAdmBillDTO;
import co.com.saimyr.domain.service.SmrAdmBillDetService;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public/api/det")
public class SaimyrAdmBillDetController {

    private SmrAdmBillDetService smrAdmBillDetService;

    @Autowired
    public SaimyrAdmBillDetController(SmrAdmBillDetService smrAdmBillDetService){
        this.smrAdmBillDetService = smrAdmBillDetService;
    }

    @GetMapping("/detail/{detail}")
    public ResponseEntity<List<BillAdmDetDTO>> getByAll (@PathVariable("detail") int consDet){
        return ResponseEntity.of(smrAdmBillDetService.getByDet(consDet));
    }

//    @GetMapping("/Bill/{bill}")
//    public ResponseEntity<BillAdmDetDTO>getByBill (@PathVariable("bill") int consBill){
//    } //pruebas
//
//    @GetMapping("/total/{total}")
//    public  ResponseEntity<BillAdmDetDTO> getByTotal (@PathVariable ("total") int total){
//    } //pruebas

    @PostMapping
    public ResponseEntity<BillAdmDetDTO>save(@RequestBody BillAdmDetDTO billAdmDetDTO){
        SmrAdmBillDet smrAdmBillDet = new SmrAdmBillDet(billAdmDetDTO);
        return new ResponseEntity<>(smrAdmBillDetService.save(smrAdmBillDet), HttpStatus.CREATED);
    }
}
