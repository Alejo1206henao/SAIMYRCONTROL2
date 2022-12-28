package co.com.saimyr.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
@Data
public class SaimyrAdmFacDetPK implements Serializable{

    @Column(name="cons_fac")
    private int consFac;

    private LocalDate ano;

    @Column(name="cons_mpio")
    private int consMpio;

    @Column(name="cons_det")
    private int consDet;

    @Column(name="cons_master")
    private long consMaster;

    public int getConsFac() {
        return consFac;
    }

    public void setConsFac(int consFac) {
        this.consFac = consFac;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
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

    public long getConsMaster() {
        return consMaster;
    }

    public void setConsMaster(long consMaster) {
        this.consMaster = consMaster;
    }
}
