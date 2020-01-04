package models;

import java.util.Date;

public class Proveedor {
    private Long id=null;
    private Long tipo_documento_id;
    private String documento;
    private String nombre;
    private String direccion;
    private String telefono;
    private String anexo;
    private String celular;
    private String responsable;
    private int activo;
    private int borrado;
    private Long user_id;
    private Long empresa_id;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public Proveedor() {
    }

    public Proveedor(Long id, Long tipo_documento_id, String documento, String nombre, String direccion, String telefono, String anexo, String celular, String responsable, int activo, int borrado, Long user_id, Long empresa_id, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.tipo_documento_id = tipo_documento_id;
        this.documento = documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.anexo = anexo;
        this.celular = celular;
        this.responsable = responsable;
        this.activo = activo;
        this.borrado = borrado;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
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

    public Long getTipo_documento_id() {
        return tipo_documento_id;
    }

    public void setTipo_documento_id(Long tipo_documento_id) {
        this.tipo_documento_id = tipo_documento_id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
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

    public Long getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Long empresa_id) {
        this.empresa_id = empresa_id;
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
