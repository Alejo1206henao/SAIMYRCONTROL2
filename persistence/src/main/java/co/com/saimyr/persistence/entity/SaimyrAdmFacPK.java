package co.com.saimyr.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;


@Embeddable
public class SaimyrAdmFacPK implements Serializable {

    @Column(name="cons_fac")
    private int consFac;

    @Column(name="cons_mpio")
    private int consMpio;


    public int getConsFac() {
        return consFac;
    }

    public void setConsFac(int consFac) {
        this.consFac = consFac;
    }


    public int getConsMpio() {
        return consMpio;
    }

    public void setConsMpio(int consMpio) {
        this.consMpio = consMpio;
    }

}
