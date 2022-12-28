package co.com.saimyr.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the SAIMYR_GAC_PERS database table.
 *
 */
@Entity
@Table(name="SAIMYR_GAC_PERS")
public class SaimyrGacPer implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SaimyrGacPerPK id;

    @Column(name="COD_SUSCRIPTOR")
    private String codSuscriptor;

    @Column(name="DIGITO_VERIF")
    private String digitoVerif;

    @Column(name="DIR_PPAL")
    private String dirPpal;

    @Column(name="ENVIO_FACTURA")
    private String envioFactura;

    private String nombre;

    @Column(name="NOMBRE_COMPLETO")
    private String nombreCompleto;

    @Column(name="NRO_DOC_ID_CATASTRAL")
    private String nroDocIdCatastral;

    @Column(name="NRO_DOC_ID_VERDADERO")
    private String nroDocIdVerdadero;

    @Column(name="PRIMER_APELL")
    private String primerApell;

    @Column(name="SEGUNDO_APELL")
    private String segundoApell;

    private String sexo;

    @Column(name="TEL_PPAL")
    private String telPpal;

    @Column(name="TIP_PERS")
    private String tipPers;

    @Column(name="TIP_USER")
    private String tipUser;

    @Column(name="ESTADO_USU")
    private String estadoUsu;

    //bi-directional many-to-one association to SaimyrGttMunicipioCodigo
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONS_MPIO",insertable=false,updatable=false)
    private SaimyrGttMunicipioCodigo saimyrGttMunicipioCodigo;

    @OneToMany
    private List<SaimyrAdmFactura> saimyrAdmFacturas;

    //bi-directional many-to-one association to SaimyrGacPersEmail
	/*@OneToMany(mappedBy="saimyrGacPer", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<SaimyrGacPersEmail> saimyrGacPersEmails;*/

    public SaimyrGacPer() {
    }

    public SaimyrGacPerPK getId() {
        return this.id;
    }

    public void setId(SaimyrGacPerPK id) {
        this.id = id;
    }

    public String getCodSuscriptor() {
        return this.codSuscriptor;
    }

    public void setCodSuscriptor(String codSuscriptor) {
        this.codSuscriptor = codSuscriptor;
    }

    public String getDigitoVerif() {
        return this.digitoVerif;
    }

    public void setDigitoVerif(String digitoVerif) {
        this.digitoVerif = digitoVerif;
    }

    public String getDirPpal() {
        return this.dirPpal;
    }

    public void setDirPpal(String dirPpal) {
        this.dirPpal = dirPpal;
    }

    public String getEnvioFactura() {
        return this.envioFactura;
    }

    public void setEnvioFactura(String envioFactura) {
        this.envioFactura = envioFactura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNroDocIdCatastral() {
        return this.nroDocIdCatastral;
    }

    public void setNroDocIdCatastral(String nroDocIdCatastral) {
        this.nroDocIdCatastral = nroDocIdCatastral;
    }

    public String getNroDocIdVerdadero() {
        return this.nroDocIdVerdadero;
    }

    public void setNroDocIdVerdadero(String nroDocIdVerdadero) {
        this.nroDocIdVerdadero = nroDocIdVerdadero;
    }

    public String getPrimerApell() {
        return this.primerApell;
    }

    public void setPrimerApell(String primerApell) {
        this.primerApell = primerApell;
    }

    public String getSegundoApell() {
        return this.segundoApell;
    }

    public void setSegundoApell(String segundoApell) {
        this.segundoApell = segundoApell;
    }

    public String getTelPpal() {
        return this.telPpal;
    }

    public void setTelPpal(String telPpal) {
        this.telPpal = telPpal;
    }

    public String getTipPers() {
        return this.tipPers;
    }

    public void setTipPers(String tipPers) {
        this.tipPers = tipPers;
    }

    public String getTipUser() {
        return this.tipUser;
    }

    public void setTipUser(String tipUser) {
        this.tipUser = tipUser;
    }

    public SaimyrGttMunicipioCodigo getSaimyrGttMunicipioCodigo() {
        return this.saimyrGttMunicipioCodigo;
    }

    public void setSaimyrGttMunicipioCodigo(SaimyrGttMunicipioCodigo saimyrGttMunicipioCodigo) {
        this.saimyrGttMunicipioCodigo = saimyrGttMunicipioCodigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

	/*public List<SaimyrGacPersEmail> getSaimyrGacPersEmails() {
		return saimyrGacPersEmails;
	}

	public void setSaimyrGacPersEmails(List<SaimyrGacPersEmail> saimyrGacPersEmails) {
		this.saimyrGacPersEmails = saimyrGacPersEmails;
	}*/

    public String getEstadoUsu() {
        return estadoUsu;
    }

    public void setEstadoUsu(String estadoUsu) {
        this.estadoUsu = estadoUsu;
    }
}
