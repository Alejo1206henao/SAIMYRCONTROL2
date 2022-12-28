package co.com.saimyr.web.controller;

import co.com.saimyr.domain.SmrAdmBillMvto;
import co.com.saimyr.domain.service.SmrAdmBillMvtoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Mvto")
public class SaimyrAdmBillMvtoController {

    private final SmrAdmBillMvtoService smrAdmBillMvtoService;

    public SaimyrAdmBillMvtoController(SmrAdmBillMvtoService smrAdmBillMvtoService) {
        this.smrAdmBillMvtoService = smrAdmBillMvtoService;
    }

    @GetMapping("/getMvo/{consMvto}")
    public Optional<List<SmrAdmBillMvto>> getByMvto(@PathVariable("consMvto") int consMvto) {
        return smrAdmBillMvtoService.getByMvto(consMvto);

    }

}
