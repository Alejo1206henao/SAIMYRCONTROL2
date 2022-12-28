package co.com.saimyr.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SmrAdmBillMvto {
    private int consBill;
    private LocalDate year;
    private int consMpio;
    private int consMvto;
    private LocalDate mvtoDate;
    private String soportDoc;
    private String payType;
    private String user;
    private int value;
    private String statu;

}
