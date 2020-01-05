package modelIfz.beans;

import java.util.Date;

public class DatosUser {

    private Long id=null;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String direccion;
    private String telefono;
    private Long tipo_documento_id;
    private String documento;
    private String email;
    private Long user_gestiona_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long user_id;

    private Empresa empresa;
    private User user;

    public DatosUser() {
    }

    public DatosUser(Long id, String nombres, String apellido_paterno, String apellido_materno, String direccion, String telefono, Long tipo_documento_id, String documento, String email, Long user_gestiona_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long user_id, Empresa empresa, User user) {
        this.id = id;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo_documento_id = tipo_documento_id;
        this.documento = documento;
        this.email = email;
        this.user_gestiona_id = user_gestiona_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user_id = user_id;

        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
