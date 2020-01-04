package models;

import java.util.Date;

public class PlatosVenta {
    private Long id=null;
    private double precio_unitario;
    private double cantidad;
    private Date fecha;
    private double costo_produccion;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long producto_plato_id;
    private Long user_id;
    private Long empresa_id;

    private Empresa empresa;
    private User user;

    public PlatosVenta() {
    }

    public PlatosVenta(Long id, double precio_unitario, double cantidad, Date fecha, double costo_produccion, int activo, int borrado, Date created_at, Date updated_at, Long producto_plato_id, Long user_id, Long empresa_id, Empresa empresa, User user) {
        this.id = id;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.costo_produccion = costo_produccion;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.producto_plato_id = producto_plato_id;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCosto_produccion() {
        return costo_produccion;
    }

    public void setCosto_produccion(double costo_produccion) {
        this.costo_produccion = costo_produccion;
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

    public Long getProducto_plato_id() {
        return producto_plato_id;
    }

    public void setProducto_plato_id(Long producto_plato_id) {
        this.producto_plato_id = producto_plato_id;
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
