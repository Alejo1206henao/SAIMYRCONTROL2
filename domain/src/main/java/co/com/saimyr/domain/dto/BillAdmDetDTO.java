package co.com.saimyr.domain.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BillAdmDetDTO {
    private int consFac;
    private LocalDate ano;
    private int consMpio;
    private int consDet;
    private int consMaster;
    private String regalo;
    private int valorUnit;
    private int impuesto;
    private int valorBruto;
    private int total;
}
