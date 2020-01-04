package models;

import java.util.Date;

public class Comprobante {
    private Long id=null;
    private String serie;
    private String numero;
    private int cantidad_digitos;
    private int estado;
    private Long empresa_id;
    private Long user_id;
    private Date created_at;
    private Date updated_at;
    private int activo;
    private int borrado;
    private Long sede_id;
    private Long tipo_comprobante_id;

    private Empresa empresa;
    private User user;

    public Comprobante() {
    }

    public Comprobante(Long id, String serie, String numero, int cantidad_digitos, int estado, Long empresa_id, Long user_id, Date created_at, Date updated_at, int activo, int borrado, Long sede_id, Long tipo_comprobante_id, Empresa empresa, User user) {
        this.id = id;
        this.serie = serie;
        this.numero = numero;
        this.cantidad_digitos = cantidad_digitos;
        this.estado = estado;
        this.empresa_id = empresa_id;
        this.user_id = user_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.activo = activo;
        this.borrado = borrado;
        this.sede_id = sede_id;
        this.tipo_comprobante_id = tipo_comprobante_id;
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

    public int getCantidad_digitos() {
        return cantidad_digitos;
    }

    public void setCantidad_digitos(int cantidad_digitos) {
        this.cantidad_digitos = cantidad_digitos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

    public Long getSede_id() {
        return sede_id;
    }

    public void setSede_id(Long sede_id) {
        this.sede_id = sede_id;
    }

    public Long getTipo_comprobante_id() {
        return tipo_comprobante_id;
    }

    public void setTipo_comprobante_id(Long tipo_comprobante_id) {
        this.tipo_comprobante_id = tipo_comprobante_id;
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
