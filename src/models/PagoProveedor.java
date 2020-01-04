package models;

import java.util.Date;

public class PagoProveedor {
    private Long id=null;
    private Date fecha;
    private double monto_pago;
    private double monto_real;
    private int tipo_pago;
    private Long banco_id_emisor;
    private Long banco_id_receptor;
    private String numero_cheque;
    private int es_soles;
    private String codigo_operacion;
    private Long empresa_id;
    private Long user_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long factura_proveedor_id;
    private Long cuenta_proveedor_id;

    private Empresa empresa;
    private User user;

    public PagoProveedor() {
    }

    public PagoProveedor(Long id, Date fecha, double monto_pago, double monto_real, int tipo_pago, Long banco_id_emisor, Long banco_id_receptor, String numero_cheque, int es_soles, String codigo_operacion, Long empresa_id, Long user_id, int activo, int borrado, Date created_at, Date updated_at, Long factura_proveedor_id, Long cuenta_proveedor_id, Empresa empresa, User user) {
        this.id = id;
        this.fecha = fecha;
        this.monto_pago = monto_pago;
        this.monto_real = monto_real;
        this.tipo_pago = tipo_pago;
        this.banco_id_emisor = banco_id_emisor;
        this.banco_id_receptor = banco_id_receptor;
        this.numero_cheque = numero_cheque;
        this.es_soles = es_soles;
        this.codigo_operacion = codigo_operacion;
        this.empresa_id = empresa_id;
        this.user_id = user_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.factura_proveedor_id = factura_proveedor_id;
        this.cuenta_proveedor_id = cuenta_proveedor_id;
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

    public double getMonto_pago() {
        return monto_pago;
    }

    public void setMonto_pago(double monto_pago) {
        this.monto_pago = monto_pago;
    }

    public double getMonto_real() {
        return monto_real;
    }

    public void setMonto_real(double monto_real) {
        this.monto_real = monto_real;
    }

    public int getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(int tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Long getBanco_id_emisor() {
        return banco_id_emisor;
    }

    public void setBanco_id_emisor(Long banco_id_emisor) {
        this.banco_id_emisor = banco_id_emisor;
    }

    public Long getBanco_id_receptor() {
        return banco_id_receptor;
    }

    public void setBanco_id_receptor(Long banco_id_receptor) {
        this.banco_id_receptor = banco_id_receptor;
    }

    public String getNumero_cheque() {
        return numero_cheque;
    }

    public void setNumero_cheque(String numero_cheque) {
        this.numero_cheque = numero_cheque;
    }

    public int getEs_soles() {
        return es_soles;
    }

    public void setEs_soles(int es_soles) {
        this.es_soles = es_soles;
    }

    public String getCodigo_operacion() {
        return codigo_operacion;
    }

    public void setCodigo_operacion(String codigo_operacion) {
        this.codigo_operacion = codigo_operacion;
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

    public Long getFactura_proveedor_id() {
        return factura_proveedor_id;
    }

    public void setFactura_proveedor_id(Long factura_proveedor_id) {
        this.factura_proveedor_id = factura_proveedor_id;
    }

    public Long getCuenta_proveedor_id() {
        return cuenta_proveedor_id;
    }

    public void setCuenta_proveedor_id(Long cuenta_proveedor_id) {
        this.cuenta_proveedor_id = cuenta_proveedor_id;
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
