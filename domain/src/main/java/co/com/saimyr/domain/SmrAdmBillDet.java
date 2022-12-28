package co.com.saimyr.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SmrAdmBillDet {
    private int consBill;
    private LocalDate year;
    private int consMpio;
    private int consDet;
    private int consMaster;
    private String gift;
    private int unitValue;
    private int tax;
    private int grossValue;
    private int total;
}
