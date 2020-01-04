package models;

import java.util.Date;

public class FacturaProveedor {
    private Long id=null;
    private String serie;
    private String numero;
    private Date fecha;
    private int pagado;
    private double total;
    private String observaciones;
    private double total_soles;
    private int en_soles;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Long entrada_stock_id;
    private Long tipo_comprobantes_id;
    private Long sede_id;

    private Empresa empresa;
    private User user;

    public FacturaProveedor() {
    }

    public FacturaProveedor(Long id, String serie, String numero, Date fecha, int pagado, double total, String observaciones, double total_soles, int en_soles, Long user_id, Long empresa_id, int activo, int borrado, Long entrada_stock_id, Long tipo_comprobantes_id, Long sede_id, Empresa empresa, User user) {
        this.id = id;
        this.serie = serie;
        this.numero = numero;
        this.fecha = fecha;
        this.pagado = pagado;
        this.total = total;
        this.observaciones = observaciones;
        this.total_soles = total_soles;
        this.en_soles = en_soles;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.entrada_stock_id = entrada_stock_id;
        this.tipo_comprobantes_id = tipo_comprobantes_id;
        this.sede_id = sede_id;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getTotal_soles() {
        return total_soles;
    }

    public void setTotal_soles(double total_soles) {
        this.total_soles = total_soles;
    }

    public int getEn_soles() {
        return en_soles;
    }

    public void setEn_soles(int en_soles) {
        this.en_soles = en_soles;
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

    public Long getEntrada_stock_id() {
        return entrada_stock_id;
    }

    public void setEntrada_stock_id(Long entrada_stock_id) {
        this.entrada_stock_id = entrada_stock_id;
    }

    public Long getTipo_comprobantes_id() {
        return tipo_comprobantes_id;
    }

    public void setTipo_comprobantes_id(Long tipo_comprobantes_id) {
        this.tipo_comprobantes_id = tipo_comprobantes_id;
    }

    public Long getSede_id() {
        return sede_id;
    }

    public void setSede_id(Long sede_id) {
        this.sede_id = sede_id;
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
