package net.salesianos.Reparaciones;

public class Reparacion {
    private String codigo;
    private String cliente;
    private String descripcion;
    private boolean urgente;

    public Reparacion(String codigo, String cliente, String descripcion, boolean urgente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.urgente = urgente;
    }
}
