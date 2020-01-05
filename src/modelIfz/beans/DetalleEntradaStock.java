package modelIfz.beans;

import java.util.Date;

public class DetalleEntradaStock {

    private Long id=null;
    private double cantidad;
    private double costo;
    private Long almacen_id;
    private int cantreal;
    private String unidad;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long lote_id;
    private Long producto_id;
    private Long entrada_stock_id;

    private Empresa empresa;
    private User user;

    public DetalleEntradaStock() {
    }

    public DetalleEntradaStock(Long id, double cantidad, double costo, Long almacen_id, int cantreal, String unidad, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long lote_id, Long producto_id, Long entrada_stock_id, Empresa empresa, User user) {
        this.id = id;
        this.cantidad = cantidad;
        this.costo = costo;
        this.almacen_id = almacen_id;
        this.cantreal = cantreal;
        this.unidad = unidad;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.lote_id = lote_id;
        this.producto_id = producto_id;
        this.entrada_stock_id = entrada_stock_id;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Long getAlmacen_id() {
        return almacen_id;
    }

    public void setAlmacen_id(Long almacen_id) {
        this.almacen_id = almacen_id;
    }

    public int getCantreal() {
        return cantreal;
    }

    public void setCantreal(int cantreal) {
        this.cantreal = cantreal;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
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

    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }

    public Long getEntrada_stock_id() {
        return entrada_stock_id;
    }

    public void setEntrada_stock_id(Long entrada_stock_id) {
        this.entrada_stock_id = entrada_stock_id;
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
