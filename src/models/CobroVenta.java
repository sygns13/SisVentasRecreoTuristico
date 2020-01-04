package models;

import java.util.Date;

public class CobroVenta {
    private Long id=null;
    private Long venta_id;
    private Date fecha;
    private int tipo_pago;
    private double importe;
    private String numero_tarjeta;
    private String numero_cheque;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long tipo_tarjeta_id;
    private Long banco_id;

    private Empresa empresa;
    private User user;

    public CobroVenta() {
    }

    public CobroVenta(Long id, Long venta_id, Date fecha, int tipo_pago, double importe, String numero_tarjeta, String numero_cheque, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long tipo_tarjeta_id, Long banco_id, Empresa empresa, User user) {
        this.id = id;
        this.venta_id = venta_id;
        this.fecha = fecha;
        this.tipo_pago = tipo_pago;
        this.importe = importe;
        this.numero_tarjeta = numero_tarjeta;
        this.numero_cheque = numero_cheque;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.tipo_tarjeta_id = tipo_tarjeta_id;
        this.banco_id = banco_id;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(int tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getNumero_cheque() {
        return numero_cheque;
    }

    public void setNumero_cheque(String numero_cheque) {
        this.numero_cheque = numero_cheque;
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

    public Long getTipo_tarjeta_id() {
        return tipo_tarjeta_id;
    }

    public void setTipo_tarjeta_id(Long tipo_tarjeta_id) {
        this.tipo_tarjeta_id = tipo_tarjeta_id;
    }

    public Long getBanco_id() {
        return banco_id;
    }

    public void setBanco_id(Long banco_id) {
        this.banco_id = banco_id;
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
