package co.com.saimyr.persistence.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="saimyr_adm_fac_mvto")
public class SaimyrAdmFacMvto {

    @EmbeddedId
    private SaimyrAdmFacMvtoPK id;

    @Column(name="fecha_mvto")
    private LocalDate fechaMvto;

    @Column(name="doc_soporte")
    private String docSoporte;

    @Column(name="tip_pago")
    private String tipPago;

    private String usuario;

    private int valor;

    private String estado;

    public SaimyrAdmFacMvtoPK getId() {
        return id;
    }

    public void setId(SaimyrAdmFacMvtoPK id) {
        this.id = id;
    }

    public LocalDate getFechaMvto() {
        return fechaMvto;
    }

    public void setFechaMvto(LocalDate fechaMvto) {
        this.fechaMvto = fechaMvto;
    }

    public String getDocSoporte() {
        return docSoporte;
    }

    public void setDocSoporte(String docSoporte) {
        this.docSoporte = docSoporte;
    }

    public String getTipPago() {
        return tipPago;
    }

    public void setTipPago(String tipPago) {
        this.tipPago = tipPago;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
