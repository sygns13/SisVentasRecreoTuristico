package models;

import java.util.Date;

public class RetiroProducto {
    private Long id=null;
    private Date fecha;
    private String motivo;
    private String hora;
    private double cantidad;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long lote_id;

    private Empresa empresa;
    private User user;

    public RetiroProducto() {
    }

    public RetiroProducto(Long id, Date fecha, String motivo, String hora, double cantidad, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long lote_id, Empresa empresa, User user) {
        this.id = id;
        this.fecha = fecha;
        this.motivo = motivo;
        this.hora = hora;
        this.cantidad = cantidad;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.lote_id = lote_id;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Long empresa_id) {
        this.empresa_id = empresa_id;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getBorrado() {
        return borrado;
    }

    public void setBorrado(int borrado) {
        this.borrado = borrado;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Long getLote_id() {
        return lote_id;
    }

    public void setLote_id(Long lote_id) {
        this.lote_id = lote_id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
