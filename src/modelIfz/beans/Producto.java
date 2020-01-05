package modelIfz.beans;

import java.util.Date;

public class Producto {
    private Long id=null;
    private String nombre;
    private double stock_minimo;
    private double precio_unidad;
    private int grabado;
    private double precio_compra;
    private Date fecha;
    private String ubicacion;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long tipo_producto_id;
    private Long marca_id;
    private int activo_lotes;

    private Empresa empresa;
    private User user;

    public Producto() {
    }

    public Producto(Long id, String nombre, double stock_minimo, double precio_unidad, int grabado, double precio_compra, Date fecha, String ubicacion, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long tipo_producto_id, Long marca_id, int activo_lotes, Empresa empresa, User user) {
        this.id = id;
        this.nombre = nombre;
        this.stock_minimo = stock_minimo;
        this.precio_unidad = precio_unidad;
        this.grabado = grabado;
        this.precio_compra = precio_compra;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.tipo_producto_id = tipo_producto_id;
        this.marca_id = marca_id;
        this.activo_lotes = activo_lotes;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(double stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public double getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getGrabado() {
        return grabado;
    }

    public void setGrabado(int grabado) {
        this.grabado = grabado;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public Long getTipo_producto_id() {
        return tipo_producto_id;
    }

    public void setTipo_producto_id(Long tipo_producto_id) {
        this.tipo_producto_id = tipo_producto_id;
    }

    public Long getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(Long marca_id) {
        this.marca_id = marca_id;
    }

    public int getActivo_lotes() {
        return activo_lotes;
    }

    public void setActivo_lotes(int activo_lotes) {
        this.activo_lotes = activo_lotes;
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
