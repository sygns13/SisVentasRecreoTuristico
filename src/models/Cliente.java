package models;

import java.util.Date;

public class Cliente {
    private Long id=null;
    private String nombre;
    private Long tipo_documento_id;
    private String documento;
    private String direccion;
    private String telefono;
    private String correo1;
    private String correo2;
    private Long user_id;
    private Long empresa_id;
    private int ativo;
    private int borrado;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, Long tipo_documento_id, String documento, String direccion, String telefono, String correo1, String correo2, Long user_id, Long empresa_id, int ativo, int borrado, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.nombre = nombre;
        this.tipo_documento_id = tipo_documento_id;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo1 = correo1;
        this.correo2 = correo2;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.ativo = ativo;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
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

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
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
