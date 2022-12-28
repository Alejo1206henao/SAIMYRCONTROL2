package co.com.saimyr.persistence.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity

@Table(name = "Saimyr_Adm_factura")
public class SaimyrAdmFactura {

    @EmbeddedId
    private SaimyrAdmFacPK id;

    @Column(name="id_electronico")
    private int idElectronico;

    @Column(name="smr_numero")
    private String smrNumero;

    private int identificacion;
    private String nombre;
    private LocalDate fecha;

    private String estado;

    private int total;

    public SaimyrAdmFacPK getId() {
        return id;
    }

    public void setId(SaimyrAdmFacPK id) {
        this.id = id;
    }

    public int getIdElectronico() {
        return idElectronico;
    }

    public void setIdElectronico(int idElectronico) {
        this.idElectronico = idElectronico;
    }

    public String getSmrNumero() {
        return smrNumero;
    }

    public void setSmrNumero(String smrNumero) {
        this.smrNumero = smrNumero;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}