package co.com.saimyr.domain;

import lombok.Data;

@Data
public class SmrBill {
    private int consMpio;
    private  int idElectronico;
    private  int CodigoVerificacion;
    private String numero;
    private int identificacion;
    private String nombre;
    private int codigo;
    private String regalo;
    private String descripcion;
    private int valorUnitario;
    private int cantidad;
    private int valorBruto;
    private int impuestos;
    private int retenciones;
    private int total;
}
