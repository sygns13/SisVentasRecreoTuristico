package modelIfz.beans;

import java.util.Date;

public class ResumenDetalle {
    private Long id=null;
    private Long resumen_boleta_id;
    private Long cabecera_id;
    private int activo;
    private int borrado;
    private Long empresa_id;
    private Long user_id;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public ResumenDetalle() {
    }

    public ResumenDetalle(Long id, Long resumen_boleta_id, Long cabecera_id, int activo, int borrado, Long empresa_id, Long user_id, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.resumen_boleta_id = resumen_boleta_id;
        this.cabecera_id = cabecera_id;
        this.activo = activo;
        this.borrado = borrado;
        this.empresa_id = empresa_id;
        this.user_id = user_id;
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

    public Long getResumen_boleta_id() {
        return resumen_boleta_id;
    }

    public void setResumen_boleta_id(Long resumen_boleta_id) {
        this.resumen_boleta_id = resumen_boleta_id;
    }

    public Long getCabecera_id() {
        return cabecera_id;
    }

    public void setCabecera_id(Long cabecera_id) {
        this.cabecera_id = cabecera_id;
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
