package co.com.saimyr.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SmrAdmBill {
    private int consBill;
    private int year;
    private int consMpio;
    private int numberId;
    private String name;
    private LocalDate date;
    private int idElectronic;
    private String smrNumber;
    private String statu;
    private int total;

}
