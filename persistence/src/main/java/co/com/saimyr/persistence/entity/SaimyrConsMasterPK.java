package co.com.saimyr.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SaimyrConsMasterPK implements Serializable {

    @Column(name="cons_mpio")
    private int consMpio;

    @Column(name="cons_master")
    private int consMaster;

    public int getConsMpio() {
        return consMpio;
    }

    public void setConsMpio(int consMpio) {
        this.consMpio = consMpio;
    }

    public int getConsMaster() {
        return consMaster;
    }

    public void setConsMaster(int consMaster) {
        this.consMaster = consMaster;
    }
}
