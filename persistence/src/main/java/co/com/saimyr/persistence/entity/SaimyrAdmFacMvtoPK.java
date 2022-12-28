package co.com.saimyr.persistence.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class SaimyrAdmFacMvtoPK implements Serializable {

    @Column(name="cons_fac")
    private int consFac;

    private LocalDate ano;

    @Column(name="cons_mpio")
    private int consMpio;

    @Column(name="cons_mvto")
    private int consMvto;

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

    public int getConsMvto() {
        return consMvto;
    }

    public void setConsMvto(int consMvto) {
        this.consMvto = consMvto;
    }
}
