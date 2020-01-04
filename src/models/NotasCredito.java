package models;

import java.util.Date;

public class NotasCredito {
    private Long id=null;
    private Long cabecera_id;
    private String docu_numero;
    private String serie;
    private int numero;
    private String codigo;
    private String descripcion;
    private String hashcode;
    private String cdr;
    private String cdr_nota;
    private String cdr_observacion;
    private String docu_enviaws;
    private String docu_proce_status;
    private String tipo;
    private Date proce_fecha;
    private String tipoanulado;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public NotasCredito() {
    }

    public NotasCredito(Long id, Long cabecera_id, String docu_numero, String serie, int numero, String codigo, String descripcion, String hashcode, String cdr, String cdr_nota, String cdr_observacion, String docu_enviaws, String docu_proce_status, String tipo, Date proce_fecha, String tipoanulado, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.cabecera_id = cabecera_id;
        this.docu_numero = docu_numero;
        this.serie = serie;
        this.numero = numero;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.hashcode = hashcode;
        this.cdr = cdr;
        this.cdr_nota = cdr_nota;
        this.cdr_observacion = cdr_observacion;
        this.docu_enviaws = docu_enviaws;
        this.docu_proce_status = docu_proce_status;
        this.tipo = tipo;
        this.proce_fecha = proce_fecha;
        this.tipoanulado = tipoanulado;
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

    public String getDocu_numero() {
        return docu_numero;
    }

    public void setDocu_numero(String docu_numero) {
        this.docu_numero = docu_numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public String getCdr() {
        return cdr;
    }

    public void setCdr(String cdr) {
        this.cdr = cdr;
    }

    public String getCdr_nota() {
        return cdr_nota;
    }

    public void setCdr_nota(String cdr_nota) {
        this.cdr_nota = cdr_nota;
    }

    public String getCdr_observacion() {
        return cdr_observacion;
    }

    public void setCdr_observacion(String cdr_observacion) {
        this.cdr_observacion = cdr_observacion;
    }

    public String getDocu_enviaws() {
        return docu_enviaws;
    }

    public void setDocu_enviaws(String docu_enviaws) {
        this.docu_enviaws = docu_enviaws;
    }

    public String getDocu_proce_status() {
        return docu_proce_status;
    }

    public void setDocu_proce_status(String docu_proce_status) {
        this.docu_proce_status = docu_proce_status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getProce_fecha() {
        return proce_fecha;
    }

    public void setProce_fecha(Date proce_fecha) {
        this.proce_fecha = proce_fecha;
    }

    public String getTipoanulado() {
        return tipoanulado;
    }

    public void setTipoanulado(String tipoanulado) {
        this.tipoanulado = tipoanulado;
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
