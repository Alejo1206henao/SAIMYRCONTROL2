package co.com.saimyr.domain.repository;


import co.com.saimyr.domain.SmrAdmBillMvto;

import java.util.List;
import java.util.Optional;

public interface SaimyrBillMvtoRepository {
    Optional<List<SmrAdmBillMvto>> getByMvto (int consMvto);
}
