package models;

import java.util.Date;

public class DetalleUnidadProducto {
    private Long id=null;
    private String codigo;
    private double precio;
    private double costo_compra;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long producto_id;
    private Long unidad_id;

    private Empresa empresa;
    private User user;

    public DetalleUnidadProducto() {
    }

    public DetalleUnidadProducto(Long id, String codigo, double precio, double costo_compra, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long producto_id, Long unidad_id, Empresa empresa, User user) {
        this.id = id;
        this.codigo = codigo;
        this.precio = precio;
        this.costo_compra = costo_compra;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.producto_id = producto_id;
        this.unidad_id = unidad_id;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto_compra() {
        return costo_compra;
    }

    public void setCosto_compra(double costo_compra) {
        this.costo_compra = costo_compra;
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

    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }

    public Long getUnidad_id() {
        return unidad_id;
    }

    public void setUnidad_id(Long unidad_id) {
        this.unidad_id = unidad_id;
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
