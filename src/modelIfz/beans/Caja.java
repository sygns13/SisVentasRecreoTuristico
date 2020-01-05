package modelIfz.beans;

import java.util.Date;

public class Caja {
    private Long id=null;
    private String numero;
    private String descripcion;
    private Double monto;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long user_id;
    private Long user_id_gestiona;
    private Long sede_id;

    private Empresa empresa;
    private User user;

    public Caja() {
    }

    public Caja(Long id, String numero, String descripcion, Double monto, int activo, int borrado, Date created_at, Date updated_at, Long user_id, Long user_id_gestiona, Long sede_id, Empresa empresa, User user) {
        this.id = id;
        this.numero = numero;
        this.descripcion = descripcion;
        this.monto = monto;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user_id = user_id;
        this.user_id_gestiona = user_id_gestiona;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
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

    public Long getUser_id_gestiona() {
        return user_id_gestiona;
    }

    public void setUser_id_gestiona(Long user_id_gestiona) {
        this.user_id_gestiona = user_id_gestiona;
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
