package modelIfz.beans;

import java.util.Date;

public class PermisosUser {

    private Long id=null;
    private Long user_gestiona_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long user_id;
    private Long permiso_id;


    private Empresa empresa;
    private User user;

    public PermisosUser() {
    }

    public PermisosUser(Long id, Long user_gestiona_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long user_id, Long permiso_id, Empresa empresa, User user) {
        this.id = id;
        this.user_gestiona_id = user_gestiona_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user_id = user_id;
        this.permiso_id = permiso_id;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_gestiona_id() {
        return user_gestiona_id;
    }

    public void setUser_gestiona_id(Long user_gestiona_id) {
        this.user_gestiona_id = user_gestiona_id;
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

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getPermiso_id() {
        return permiso_id;
    }

    public void setPermiso_id(Long permiso_id) {
        this.permiso_id = permiso_id;
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
