package co.com.saimyr.domain.repository;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.SmrAdmBillMvto;
import co.com.saimyr.domain.dto.BillAdmDetDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface SaimyrBillDetRepository {

    Optional<List<BillAdmDetDTO>> getByAll (int consBill);

//    Optional<List<BillAdmDetDTO>> getByTotal (int total); falta prueba
    BillAdmDetDTO save (SmrAdmBillDet smrAdmBillDet);
}
