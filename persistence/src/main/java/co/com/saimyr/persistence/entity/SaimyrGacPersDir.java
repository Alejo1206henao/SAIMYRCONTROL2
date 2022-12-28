package co.com.saimyr.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the SAIMYR_GAC_PERS_DIR database table.
 *
 */
@Entity
@Table(name="SAIMYR_GAC_PERS_DIR")
public class SaimyrGacPersDir implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SaimyrGacPersDirPK id;

    private String barrio;

    private String direccion;

    @Column(name="MPIO_CONS")
    private java.math.BigDecimal mpioCons;

    private String ppal;

    //bi-directional many-to-one association to SaimyrGacPer
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CONS_MPIO", referencedColumnName="CONS_MPIO", insertable=false, updatable=false),
            @JoinColumn(name="CONS_PERS", referencedColumnName="CONS_PERS", insertable=false, updatable=false)
    })
    private SaimyrGacPer saimyrGacPer;

    public SaimyrGacPersDir() {
    }

    public SaimyrGacPersDirPK getId() {
        return this.id;
    }

    public void setId(SaimyrGacPersDirPK id) {
        this.id = id;
    }

    public String getBarrio() {
        return this.barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public java.math.BigDecimal getMpioCons() {
        return this.mpioCons;
    }

    public void setMpioCons(java.math.BigDecimal mpioCons) {
        this.mpioCons = mpioCons;
    }

    public String getPpal() {
        return this.ppal;
    }

    public void setPpal(String ppal) {
        this.ppal = ppal;
    }

    public SaimyrGacPer getSaimyrGacPer() {
        return this.saimyrGacPer;
    }

    public void setSaimyrGacPer(SaimyrGacPer saimyrGacPer) {
        this.saimyrGacPer = saimyrGacPer;
    }

}