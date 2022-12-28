package co.com.saimyr.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="saimyr_fac_det")
public class SaimyrAdmFacDet {
    @EmbeddedId
    private SaimyrAdmFacDetPK id;

    private String regalo;

    @Column(name="valor_unitario")
    private int ValorUnitario;

    private int impuesto;

    @Column(name="valor_bruto")
    private int valorBruto;

    private int total;

    public SaimyrAdmFacDetPK getId() {
        return id;
    }

    public void setId(SaimyrAdmFacDetPK id) {
        this.id = id;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }

    public int getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        ValorUnitario = valorUnitario;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(int valorBruto) {
        this.valorBruto = valorBruto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}