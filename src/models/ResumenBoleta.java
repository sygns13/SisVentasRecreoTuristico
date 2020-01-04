package models;

import java.util.Date;

public class ResumenBoleta {

    private Long id=null;
    private String razonsocial;
    private String ruc;
    private Date fecha_emision;
    private Date fecha_envio;
    private String enviar;
    private String docstatus;
    private String hashcode;
    private String cdr;
    private String cdr_nota;
    private String docu_link_pdf;
    private String docu_link_cdr;
    private String docu_link_xml;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public ResumenBoleta() {
    }

    public ResumenBoleta(Long id, String razonsocial, String ruc, Date fecha_emision, Date fecha_envio, String enviar, String docstatus, String hashcode, String cdr, String cdr_nota, String docu_link_pdf, String docu_link_cdr, String docu_link_xml, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.razonsocial = razonsocial;
        this.ruc = ruc;
        this.fecha_emision = fecha_emision;
        this.fecha_envio = fecha_envio;
        this.enviar = enviar;
        this.docstatus = docstatus;
        this.hashcode = hashcode;
        this.cdr = cdr;
        this.cdr_nota = cdr_nota;
        this.docu_link_pdf = docu_link_pdf;
        this.docu_link_cdr = docu_link_cdr;
        this.docu_link_xml = docu_link_xml;
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

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getEnviar() {
        return enviar;
    }

    public void setEnviar(String enviar) {
        this.enviar = enviar;
    }

    public String getDocstatus() {
        return docstatus;
    }

    public void setDocstatus(String docstatus) {
        this.docstatus = docstatus;
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

    public String getDocu_link_pdf() {
        return docu_link_pdf;
    }

    public void setDocu_link_pdf(String docu_link_pdf) {
        this.docu_link_pdf = docu_link_pdf;
    }

    public String getDocu_link_cdr() {
        return docu_link_cdr;
    }

    public void setDocu_link_cdr(String docu_link_cdr) {
        this.docu_link_cdr = docu_link_cdr;
    }

    public String getDocu_link_xml() {
        return docu_link_xml;
    }

    public void setDocu_link_xml(String docu_link_xml) {
        this.docu_link_xml = docu_link_xml;
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
