package modelIfz.beans;

import java.util.Date;

public class DetalleVenta {
    private Long id=null;
    private Long venta_id;
    private Long producto_id;
    private double precio_venta;
    private double precio_compra;
    private double cantidad;
    private Long almacen_id;
    private int es_grabado;
    private double descuento;
    private int tipo_descuento;
    private double cantidad_real;
    private String unidad;
    private Long lote_id;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long platos_ventas_id;
    private int tipo;

    private Empresa empresa;
    private User user;

    public DetalleVenta() {
    }

    public DetalleVenta(Long id, Long venta_id, Long producto_id, double precio_venta, double precio_compra, double cantidad, Long almacen_id, int es_grabado, double descuento, int tipo_descuento, double cantidad_real, String unidad, Long lote_id, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long platos_ventas_id, int tipo, Empresa empresa, User user) {
        this.id = id;
        this.venta_id = venta_id;
        this.producto_id = producto_id;
        this.precio_venta = precio_venta;
        this.precio_compra = precio_compra;
        this.cantidad = cantidad;
        this.almacen_id = almacen_id;
        this.es_grabado = es_grabado;
        this.descuento = descuento;
        this.tipo_descuento = tipo_descuento;
        this.cantidad_real = cantidad_real;
        this.unidad = unidad;
        this.lote_id = lote_id;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.platos_ventas_id = platos_ventas_id;
        this.tipo = tipo;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(Long venta_id) {
        this.venta_id = venta_id;
    }

    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Long getAlmacen_id() {
        return almacen_id;
    }

    public void setAlmacen_id(Long almacen_id) {
        this.almacen_id = almacen_id;
    }

    public int getEs_grabado() {
        return es_grabado;
    }

    public void setEs_grabado(int es_grabado) {
        this.es_grabado = es_grabado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getTipo_descuento() {
        return tipo_descuento;
    }

    public void setTipo_descuento(int tipo_descuento) {
        this.tipo_descuento = tipo_descuento;
    }

    public double getCantidad_real() {
        return cantidad_real;
    }

    public void setCantidad_real(double cantidad_real) {
        this.cantidad_real = cantidad_real;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Long getLote_id() {
        return lote_id;
    }

    public void setLote_id(Long lote_id) {
        this.lote_id = lote_id;
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

    public Long getPlatos_ventas_id() {
        return platos_ventas_id;
    }

    public void setPlatos_ventas_id(Long platos_ventas_id) {
        this.platos_ventas_id = platos_ventas_id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
