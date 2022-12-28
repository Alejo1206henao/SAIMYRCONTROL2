package co.com.saimyr.domain.service;

import co.com.saimyr.domain.SmrAdmBillMvto;
import co.com.saimyr.domain.repository.SaimyrBillMvtoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmrAdmBillMvtoService {

    private final SaimyrBillMvtoRepository saimyrBillMvtoRepository;

    public SmrAdmBillMvtoService(SaimyrBillMvtoRepository saimyrBillMvtoRepository) {
        this.saimyrBillMvtoRepository = saimyrBillMvtoRepository;
    }
    public Optional<List<SmrAdmBillMvto>> getByMvto(int consMvto) {
        return saimyrBillMvtoRepository.getByMvto(consMvto);
    }
}