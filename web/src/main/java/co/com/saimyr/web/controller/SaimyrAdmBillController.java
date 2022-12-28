package co.com.saimyr.web.controller;

import co.com.saimyr.domain.Factura;
import co.com.saimyr.domain.SmrAdmBill;
import co.com.saimyr.domain.service.SmrAdmBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("public/api/control")
public class SaimyrAdmBillController {
    private final SmrAdmBillService smrAdmBillService;

    @Autowired
    public SaimyrAdmBillController(SmrAdmBillService smrAdmBillService) {
        this.smrAdmBillService = smrAdmBillService;
    }

    @GetMapping("/getAll")
    public List<SmrAdmBill> getAll(){
        return smrAdmBillService.getAll();
    }

    @GetMapping("/getId/{smrNumber}")
    public List<SmrAdmBill> getById(@PathVariable("smrNumber") String smrNumber){
        return smrAdmBillService.getById(smrNumber);
    }

    @GetMapping("/getDate/{date}")
    public List<SmrAdmBill> getByDate (@PathVariable("date") LocalDate date){
        return smrAdmBillService.getByDate(date);
    }

    @GetMapping("/getStatu/{statu}")
    public Optional<List<SmrAdmBill>> getByStatu (@PathVariable("statu") String statu){
        return smrAdmBillService.getByStatu(statu);
    }


    @PostMapping("/save")
    public ResponseEntity<List<SmrAdmBill>> save (@RequestBody List<Factura> facturas){
        return new ResponseEntity<>(smrAdmBillService.save(facturas), HttpStatus.CREATED);
    }

}
