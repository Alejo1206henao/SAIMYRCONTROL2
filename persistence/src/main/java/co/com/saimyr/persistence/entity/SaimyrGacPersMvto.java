package co.com.saimyr.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SAIMYR_GAC_PERS_MVTO database table.
 *
 */
@Entity
@Table(name="SAIMYR_GAC_PERS_MVTO")
public class SaimyrGacPersMvto implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SaimyrGacPersMvtoPK id;

    private String efectivo;

    private String estado;

    @Temporal(TemporalType.DATE)
    @Column(name="FCH_ARREGLO")
    private Date fchArreglo;

    @Temporal(TemporalType.DATE)
    @Column(name="FCH_MVTO")
    private Date fchMvto;

    private String manifestacion;

    private String medio;

    private BigDecimal motivo;

    @Column(name="NRO_DOC")
    private String nroDoc;

    @Column(name="NRO_DOC_EXT")
    private BigDecimal nroDocExt;

    private String observacion;

    @Column(name="RADICADO_NOTIF")
    private String radicadoNotif;

    @Column(name="TIP_DOC")
    private String tipDoc;

    @Column(name="TIP_MVTO")
    private BigDecimal tipMvto;

    //bi-directional many-to-one association to SaimyrGacPer
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CONS_MPIO", referencedColumnName="CONS_MPIO", insertable=false, updatable=false),
            @JoinColumn(name="CONS_PERS", referencedColumnName="CONS_PERS", insertable=false, updatable=false)
    })
    private SaimyrGacPer saimyrGacPer1;

    //bi-directional many-to-one association to SaimyrGacPer
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CONS_MPIO", referencedColumnName="CONS_MPIO", insertable=false, updatable=false),
            @JoinColumn(name="CONS_PERS_USUARIO", referencedColumnName="CONS_PERS", insertable=false, updatable=false)
    })
    private SaimyrGacPer saimyrGacPer2;

    public SaimyrGacPersMvto() {
    }

    public SaimyrGacPersMvtoPK getId() {
        return this.id;
    }

    public void setId(SaimyrGacPersMvtoPK id) {
        this.id = id;
    }

    public String getEfectivo() {
        return this.efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFchArreglo() {
        return this.fchArreglo;
    }

    public void setFchArreglo(Date fchArreglo) {
        this.fchArreglo = fchArreglo;
    }

    public Date getFchMvto() {
        return this.fchMvto;
    }

    public void setFchMvto(Date fchMvto) {
        this.fchMvto = fchMvto;
    }

    public String getManifestacion() {
        return this.manifestacion;
    }

    public void setManifestacion(String manifestacion) {
        this.manifestacion = manifestacion;
    }

    public String getMedio() {
        return this.medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public BigDecimal getMotivo() {
        return this.motivo;
    }

    public void setMotivo(BigDecimal motivo) {
        this.motivo = motivo;
    }

    public String getNroDoc() {
        return this.nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public BigDecimal getNroDocExt() {
        return this.nroDocExt;
    }

    public void setNroDocExt(BigDecimal nroDocExt) {
        this.nroDocExt = nroDocExt;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getRadicadoNotif() {
        return this.radicadoNotif;
    }

    public void setRadicadoNotif(String radicadoNotif) {
        this.radicadoNotif = radicadoNotif;
    }

    public String getTipDoc() {
        return this.tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public BigDecimal getTipMvto() {
        return this.tipMvto;
    }

    public void setTipMvto(BigDecimal tipMvto) {
        this.tipMvto = tipMvto;
    }

    public SaimyrGacPer getSaimyrGacPer1() {
        return this.saimyrGacPer1;
    }

    public void setSaimyrGacPer1(SaimyrGacPer saimyrGacPer1) {
        this.saimyrGacPer1 = saimyrGacPer1;
    }

    public SaimyrGacPer getSaimyrGacPer2() {
        return this.saimyrGacPer2;
    }

    public void setSaimyrGacPer2(SaimyrGacPer saimyrGacPer2) {
        this.saimyrGacPer2 = saimyrGacPer2;
    }

}