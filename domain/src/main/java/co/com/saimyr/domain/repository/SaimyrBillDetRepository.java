package co.com.saimyr.domain.repository;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.SmrAdmBillMvto;

import java.util.List;
import java.util.Optional;

public interface SaimyrBillDetRepository {

    Optional<List<SmrAdmBillDet>> getByDet (int consDet);
    List<SmrAdmBillDet> save (List<SmrAdmBillDet> billDetList);
}
