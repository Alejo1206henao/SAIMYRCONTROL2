package co.com.saimyr.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the SAIMYR_GAC_PERS_MVTO database table.
 *
 */
@Embeddable
public class SaimyrGacPersMvtoPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="CONS_MPIO", insertable=false, updatable=false)
    private long consMpio;

    @Column(name="CONS_PERS", insertable=false, updatable=false)
    private long consPers;

    private String modulo;

    @Column(name="CONS_MVTO")
    private long consMvto;

    public SaimyrGacPersMvtoPK() {
    }
    public long getConsMpio() {
        return this.consMpio;
    }
    public void setConsMpio(long consMpio) {
        this.consMpio = consMpio;
    }
    public long getConsPers() {
        return this.consPers;
    }
    public void setConsPers(long consPers) {
        this.consPers = consPers;
    }
    public String getModulo() {
        return this.modulo;
    }
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    public long getConsMvto() {
        return this.consMvto;
    }
    public void setConsMvto(long consMvto) {
        this.consMvto = consMvto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaimyrGacPersMvtoPK)) {
            return false;
        }
        SaimyrGacPersMvtoPK castOther = (SaimyrGacPersMvtoPK)other;
        return
                (this.consMpio == castOther.consMpio)
                        && (this.consPers == castOther.consPers)
                        && this.modulo.equals(castOther.modulo)
                        && (this.consMvto == castOther.consMvto);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) (this.consMpio ^ (this.consMpio >>> 32)));
        hash = hash * prime + ((int) (this.consPers ^ (this.consPers >>> 32)));
        hash = hash * prime + this.modulo.hashCode();
        hash = hash * prime + ((int) (this.consMvto ^ (this.consMvto >>> 32)));

        return hash;
    }
}