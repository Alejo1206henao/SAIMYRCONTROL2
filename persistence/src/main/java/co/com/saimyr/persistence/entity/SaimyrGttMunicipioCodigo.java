package co.com.saimyr.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="SAIMYR_GTT_MUNICIPIO_CODIGO")
@Getter
@Setter
@NoArgsConstructor
public class SaimyrGttMunicipioCodigo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONS_MPIO")
	private long consMpio;

	private String direccion;
	private String lema;
	private String mail;
	private String nit;
	private String nombre;
	private String telefono;
	private String web;
}