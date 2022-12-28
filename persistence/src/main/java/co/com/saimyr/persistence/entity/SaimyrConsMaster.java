package co.com.saimyr.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="saimyr_cons_master")
public class SaimyrConsMaster {
    @EmbeddedId
    private SaimyrConsMasterPK id;

    private int codigo;

    private String descripcion;

    private String estado;

    public SaimyrConsMasterPK getId() {
        return id;
    }

    public void setId(SaimyrConsMasterPK id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
