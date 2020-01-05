package modelIfz.beans;

import java.util.Date;

public class TipoDocumento {

    private Long id;
    private String tipo;
    private String dockey;
    private String descripcion;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long user_id;

    private User user;

    public TipoDocumento() {
    }

    public TipoDocumento(Long id, String tipo, String dockey, String descripcion, int activo, int borrado, Date created_at, Date updated_at, Long user_id, User user) {
        this.id = id;
        this.tipo = tipo;
        this.dockey = dockey;
        this.descripcion = descripcion;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user_id = user_id;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDockey() {
        return dockey;
    }

    public void setDockey(String dockey) {
        this.dockey = dockey;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
