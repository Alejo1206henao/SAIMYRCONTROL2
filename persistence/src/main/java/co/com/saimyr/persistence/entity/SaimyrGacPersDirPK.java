package co.com.saimyr.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the SAIMYR_GAC_PERS_DIR database table.
 *
 */
@Embeddable
public class SaimyrGacPersDirPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="CONS_MPIO", insertable=false, updatable=false)
    private long consMpio;

    @Column(name="CONS_PERS", insertable=false, updatable=false)
    private long consPers;

    @Column(name="TIP_DIR", insertable=false, updatable=false)
    private String tipDir;

    public SaimyrGacPersDirPK() {
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
    public String getTipDir() {
        return this.tipDir;
    }
    public void setTipDir(String tipDir) {
        this.tipDir = tipDir;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaimyrGacPersDirPK)) {
            return false;
        }
        SaimyrGacPersDirPK castOther = (SaimyrGacPersDirPK)other;
        return
                (this.consMpio == castOther.consMpio)
                        && (this.consPers == castOther.consPers)
                        && this.tipDir.equals(castOther.tipDir);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) (this.consMpio ^ (this.consMpio >>> 32)));
        hash = hash * prime + ((int) (this.consPers ^ (this.consPers >>> 32)));
        hash = hash * prime + this.tipDir.hashCode();

        return hash;
    }
}