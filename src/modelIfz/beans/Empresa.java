package modelIfz.beans;

import java.util.Date;

public class Empresa {
    private Long id=null;
    private String ruc;
    private String razonSocial;
    private String descripcion;
    private String telefono;
    private String direccion;
    private String email;
    private int activo;
    private int borrado;
    private Long user_id;
    private Date created_at;
    private Date updated_at;

    private User user;

    public Empresa() {
    }

    public Empresa(Long id, String ruc, String razonSocial, String descripcion, String telefono, String direccion, String email, int activo, int borrado, Long user_id, Date created_at, Date updated_at, User user) {
        this.id = id;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.activo = activo;
        this.borrado = borrado;
        this.user_id = user_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
