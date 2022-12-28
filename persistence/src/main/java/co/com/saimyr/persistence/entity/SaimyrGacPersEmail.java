package co.com.saimyr.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the SAIMYR_GAC_PERS_EMAIL database table.
 *
 */
@Entity
@Table(name="SAIMYR_GAC_PERS_EMAIL")
public class SaimyrGacPersEmail implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SaimyrGacPersEmailPK id;

    private String descripcion;

    private String ppal;

    //bi-directional many-to-one association to SaimyrGacPers
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="CONS_PERS", referencedColumnName="CONS_PERS", insertable=false, updatable=false),
            @JoinColumn(name="CONS_MPIO", referencedColumnName="CONS_MPIO", insertable=false, updatable=false)
    })
    private SaimyrGacPer saimyrGacPer;

    public SaimyrGacPersEmail() {
    }

    public SaimyrGacPersEmailPK getId() {
        return this.id;
    }

    public void setId(SaimyrGacPersEmailPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPpal() {
        return this.ppal;
    }

    public void setPpal(String ppal) {
        this.ppal = ppal;
    }

    public SaimyrGacPer getSaimyrGacPer() {
        return saimyrGacPer;
    }

    public void setSaimyrGacPer(SaimyrGacPer saimyrGacPer) {
        this.saimyrGacPer = saimyrGacPer;
    }
}