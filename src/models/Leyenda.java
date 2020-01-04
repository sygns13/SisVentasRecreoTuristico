package models;

import java.util.Date;

public class Leyenda {

    private Long id=null;
    private Long cabecera_id;
    private String leyenda_codigo;
    private String leyenda_texto;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public Leyenda(Long id) {
        this.id = id;
    }

    public Leyenda(Long id, Long cabecera_id, String leyenda_codigo, String leyenda_texto, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.cabecera_id = cabecera_id;
        this.leyenda_codigo = leyenda_codigo;
        this.leyenda_texto = leyenda_texto;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCabecera_id() {
        return cabecera_id;
    }

    public void setCabecera_id(Long cabecera_id) {
        this.cabecera_id = cabecera_id;
    }

    public String getLeyenda_codigo() {
        return leyenda_codigo;
    }

    public void setLeyenda_codigo(String leyenda_codigo) {
        this.leyenda_codigo = leyenda_codigo;
    }

    public String getLeyenda_texto() {
        return leyenda_texto;
    }

    public void setLeyenda_texto(String leyenda_texto) {
        this.leyenda_texto = leyenda_texto;
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
