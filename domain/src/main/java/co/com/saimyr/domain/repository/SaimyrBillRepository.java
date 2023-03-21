package co.com.saimyr.domain.repository;


import co.com.saimyr.domain.SmrAdmBill;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface SaimyrBillRepository {
    List<SmrAdmBill> getAll();
    List<SmrAdmBill> getById(String smrNumber);
    List<SmrAdmBill> getByDate(LocalDate date);
    Optional<List<SmrAdmBill>> getByStatu (String statu);
    List<SmrAdmBill> save(List<SmrAdmBill> smrAdmBills);
}
