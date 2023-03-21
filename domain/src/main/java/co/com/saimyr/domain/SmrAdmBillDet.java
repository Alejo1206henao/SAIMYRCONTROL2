package co.com.saimyr.domain;

import co.com.saimyr.domain.dto.BillAdmDetDTO;
import co.com.saimyr.domain.dto.SmrAdmBillDTO;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

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

    public SmrAdmBillDet (BillAdmDetDTO dto){
        setConsMpio(dto.getConsMpio());
        setYear(dto.getAno());
        setConsDet(dto.getConsDet());
        setConsMaster(dto.getConsMaster());
        setGift(dto.getRegalo());
        setUnitValue(dto.getValorUnit());
        setTax(dto.getImpuesto());
        setGrossValue(dto.getValorBruto());
        setTotal(dto.getTotal());
    }



    public int getConsBill() {
        return consBill;
    }

    public void setConsBill(int consBill) {
        this.consBill = consBill;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public int getConsMpio() {
        return consMpio;
    }

    public void setConsMpio(int consMpio) {
        this.consMpio = consMpio;
    }

    public int getConsDet() {
        return consDet;
    }

    public void setConsDet(int consDet) {
        this.consDet = consDet;
    }

    public int getConsMaster() {
        return consMaster;
    }

    public void setConsMaster(int consMaster) {
        this.consMaster = consMaster;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public int getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(int unitValue) {
        this.unitValue = unitValue;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getGrossValue() {
        return grossValue;
    }

    public void setGrossValue(int grossValue) {
        this.grossValue = grossValue;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
