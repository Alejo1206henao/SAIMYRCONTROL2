package co.com.saimyr.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the SAIMYR_GAC_PERS_EMAIL database table.
 *
 */
@Embeddable
public class SaimyrGacPersEmailPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="CONS_MPIO")
    private long consMpio;

    @Column(name="CONS_PERS")
    private long consPers;

    private String email;

    public SaimyrGacPersEmailPK() {
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
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaimyrGacPersEmailPK)) {
            return false;
        }
        SaimyrGacPersEmailPK castOther = (SaimyrGacPersEmailPK)other;
        return
                (this.consMpio == castOther.consMpio)
                        && (this.consPers == castOther.consPers)
                        && this.email.equals(castOther.email);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) (this.consMpio ^ (this.consMpio >>> 32)));
        hash = hash * prime + ((int) (this.consPers ^ (this.consPers >>> 32)));
        hash = hash * prime + this.email.hashCode();

        return hash;
    }
}