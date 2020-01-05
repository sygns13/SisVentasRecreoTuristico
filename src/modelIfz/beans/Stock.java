package modelIfz.beans;

import java.util.Date;

public class Stock {

    private Long id;
    private double cantidad;
    private int activo;
    private int borrado;
    private Long empresa_id;
    private Long user_id;
    private Date created_at;
    private Date updated_at;
    private Long almacen_id;
    private Long producto_id;

    private Empresa empresa;
    private User user;

    public Stock() {
    }

    public Stock(Long id, double cantidad, int activo, int borrado, Long empresa_id, Long user_id, Date created_at, Date updated_at, Long almacen_id, Long producto_id, Empresa empresa, User user) {
        this.id = id;
        this.cantidad = cantidad;
        this.activo = activo;
        this.borrado = borrado;
        this.empresa_id = empresa_id;
        this.user_id = user_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.almacen_id = almacen_id;
        this.producto_id = producto_id;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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

    public Long getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Long empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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

    public Long getAlmacen_id() {
        return almacen_id;
    }

    public void setAlmacen_id(Long almacen_id) {
        this.almacen_id = almacen_id;
    }

    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
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
