package models;

import java.util.Date;

public class Cabecera {
    private Long id=null;
    private String idexterno;
    private String empr_razonsocial;
    private String empr_ubigeo;
    private String empr_nombrecomercial;
    private String empr_direccion;
    private String empr_provincia;
    private String empr_departamento;
    private String empr_distrito;
    private String empr_pais;
    private String empr_nroruc;
    private String empr_tipodoc;
    private String clie_numero;
    private String clie_tipodoc;
    private String clie_nombre;
    private Date docu_fecha;
    private String docu_tipodocumento;
    private String docu_numero;
    private String docu_moneda;
    private String docu_gravada;
    private String docu_inafecta;
    private String docu_exonerada;
    private String docu_gratuita;
    private String docu_descuento;
    private String docu_subtotal;
    private String docu_total;
    private String docu_igv;
    private String tasa_igv;
    private String docu_isc;
    private String tasa_isc;
    private String docu_otrostributos;
    private String tasa_otrostributos;
    private String docu_otroscargos;
    private String docu_percepcion;
    private String hashcode;
    private String cdr;
    private String cdr_nota;
    private String cdr_observacion;
    private String docu_enviaws;
    private String docu_proce_status;
    private Date docu_proce_fecha;
    private String docu_link_pdf;
    private String docu_link_cdr;
    private String docu_link_xml;
    private String clie_correo_cpe1;
    private String clie_correo_cpe2;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;
    private Long venta_id;

    private Empresa empresa;
    private User user;

    public Cabecera() {
    }

    public Cabecera(Long id, String idexterno, String empr_razonsocial, String empr_ubigeo, String empr_nombrecomercial, String empr_direccion, String empr_provincia, String empr_departamento, String empr_distrito, String empr_pais, String empr_nroruc, String empr_tipodoc, String clie_numero, String clie_tipodoc, String clie_nombre, Date docu_fecha, String docu_tipodocumento, String docu_numero, String docu_moneda, String docu_gravada, String docu_inafecta, String docu_exonerada, String docu_gratuita, String docu_descuento, String docu_subtotal, String docu_total, String docu_igv, String tasa_igv, String docu_isc, String tasa_isc, String docu_otrostributos, String tasa_otrostributos, String docu_otroscargos, String docu_percepcion, String hashcode, String cdr, String cdr_nota, String cdr_observacion, String docu_enviaws, String docu_proce_status, Date docu_proce_fecha, String docu_link_pdf, String docu_link_cdr, String docu_link_xml, String clie_correo_cpe1, String clie_correo_cpe2, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Long venta_id, Empresa empresa, User user) {
        this.id = id;
        this.idexterno = idexterno;
        this.empr_razonsocial = empr_razonsocial;
        this.empr_ubigeo = empr_ubigeo;
        this.empr_nombrecomercial = empr_nombrecomercial;
        this.empr_direccion = empr_direccion;
        this.empr_provincia = empr_provincia;
        this.empr_departamento = empr_departamento;
        this.empr_distrito = empr_distrito;
        this.empr_pais = empr_pais;
        this.empr_nroruc = empr_nroruc;
        this.empr_tipodoc = empr_tipodoc;
        this.clie_numero = clie_numero;
        this.clie_tipodoc = clie_tipodoc;
        this.clie_nombre = clie_nombre;
        this.docu_fecha = docu_fecha;
        this.docu_tipodocumento = docu_tipodocumento;
        this.docu_numero = docu_numero;
        this.docu_moneda = docu_moneda;
        this.docu_gravada = docu_gravada;
        this.docu_inafecta = docu_inafecta;
        this.docu_exonerada = docu_exonerada;
        this.docu_gratuita = docu_gratuita;
        this.docu_descuento = docu_descuento;
        this.docu_subtotal = docu_subtotal;
        this.docu_total = docu_total;
        this.docu_igv = docu_igv;
        this.tasa_igv = tasa_igv;
        this.docu_isc = docu_isc;
        this.tasa_isc = tasa_isc;
        this.docu_otrostributos = docu_otrostributos;
        this.tasa_otrostributos = tasa_otrostributos;
        this.docu_otroscargos = docu_otroscargos;
        this.docu_percepcion = docu_percepcion;
        this.hashcode = hashcode;
        this.cdr = cdr;
        this.cdr_nota = cdr_nota;
        this.cdr_observacion = cdr_observacion;
        this.docu_enviaws = docu_enviaws;
        this.docu_proce_status = docu_proce_status;
        this.docu_proce_fecha = docu_proce_fecha;
        this.docu_link_pdf = docu_link_pdf;
        this.docu_link_cdr = docu_link_cdr;
        this.docu_link_xml = docu_link_xml;
        this.clie_correo_cpe1 = clie_correo_cpe1;
        this.clie_correo_cpe2 = clie_correo_cpe2;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.venta_id = venta_id;
        this.empresa = empresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdexterno() {
        return idexterno;
    }

    public void setIdexterno(String idexterno) {
        this.idexterno = idexterno;
    }

    public String getEmpr_razonsocial() {
        return empr_razonsocial;
    }

    public void setEmpr_razonsocial(String empr_razonsocial) {
        this.empr_razonsocial = empr_razonsocial;
    }

    public String getEmpr_ubigeo() {
        return empr_ubigeo;
    }

    public void setEmpr_ubigeo(String empr_ubigeo) {
        this.empr_ubigeo = empr_ubigeo;
    }

    public String getEmpr_nombrecomercial() {
        return empr_nombrecomercial;
    }

    public void setEmpr_nombrecomercial(String empr_nombrecomercial) {
        this.empr_nombrecomercial = empr_nombrecomercial;
    }

    public String getEmpr_direccion() {
        return empr_direccion;
    }

    public void setEmpr_direccion(String empr_direccion) {
        this.empr_direccion = empr_direccion;
    }

    public String getEmpr_provincia() {
        return empr_provincia;
    }

    public void setEmpr_provincia(String empr_provincia) {
        this.empr_provincia = empr_provincia;
    }

    public String getEmpr_departamento() {
        return empr_departamento;
    }

    public void setEmpr_departamento(String empr_departamento) {
        this.empr_departamento = empr_departamento;
    }

    public String getEmpr_distrito() {
        return empr_distrito;
    }

    public void setEmpr_distrito(String empr_distrito) {
        this.empr_distrito = empr_distrito;
    }

    public String getEmpr_pais() {
        return empr_pais;
    }

    public void setEmpr_pais(String empr_pais) {
        this.empr_pais = empr_pais;
    }

    public String getEmpr_nroruc() {
        return empr_nroruc;
    }

    public void setEmpr_nroruc(String empr_nroruc) {
        this.empr_nroruc = empr_nroruc;
    }

    public String getEmpr_tipodoc() {
        return empr_tipodoc;
    }

    public void setEmpr_tipodoc(String empr_tipodoc) {
        this.empr_tipodoc = empr_tipodoc;
    }

    public String getClie_numero() {
        return clie_numero;
    }

    public void setClie_numero(String clie_numero) {
        this.clie_numero = clie_numero;
    }

    public String getClie_tipodoc() {
        return clie_tipodoc;
    }

    public void setClie_tipodoc(String clie_tipodoc) {
        this.clie_tipodoc = clie_tipodoc;
    }

    public String getClie_nombre() {
        return clie_nombre;
    }

    public void setClie_nombre(String clie_nombre) {
        this.clie_nombre = clie_nombre;
    }

    public Date getDocu_fecha() {
        return docu_fecha;
    }

    public void setDocu_fecha(Date docu_fecha) {
        this.docu_fecha = docu_fecha;
    }

    public String getDocu_tipodocumento() {
        return docu_tipodocumento;
    }

    public void setDocu_tipodocumento(String docu_tipodocumento) {
        this.docu_tipodocumento = docu_tipodocumento;
    }

    public String getDocu_numero() {
        return docu_numero;
    }

    public void setDocu_numero(String docu_numero) {
        this.docu_numero = docu_numero;
    }

    public String getDocu_moneda() {
        return docu_moneda;
    }

    public void setDocu_moneda(String docu_moneda) {
        this.docu_moneda = docu_moneda;
    }

    public String getDocu_gravada() {
        return docu_gravada;
    }

    public void setDocu_gravada(String docu_gravada) {
        this.docu_gravada = docu_gravada;
    }

    public String getDocu_inafecta() {
        return docu_inafecta;
    }

    public void setDocu_inafecta(String docu_inafecta) {
        this.docu_inafecta = docu_inafecta;
    }

    public String getDocu_exonerada() {
        return docu_exonerada;
    }

    public void setDocu_exonerada(String docu_exonerada) {
        this.docu_exonerada = docu_exonerada;
    }

    public String getDocu_gratuita() {
        return docu_gratuita;
    }

    public void setDocu_gratuita(String docu_gratuita) {
        this.docu_gratuita = docu_gratuita;
    }

    public String getDocu_descuento() {
        return docu_descuento;
    }

    public void setDocu_descuento(String docu_descuento) {
        this.docu_descuento = docu_descuento;
    }

    public String getDocu_subtotal() {
        return docu_subtotal;
    }

    public void setDocu_subtotal(String docu_subtotal) {
        this.docu_subtotal = docu_subtotal;
    }

    public String getDocu_total() {
        return docu_total;
    }

    public void setDocu_total(String docu_total) {
        this.docu_total = docu_total;
    }

    public String getDocu_igv() {
        return docu_igv;
    }

    public void setDocu_igv(String docu_igv) {
        this.docu_igv = docu_igv;
    }

    public String getTasa_igv() {
        return tasa_igv;
    }

    public void setTasa_igv(String tasa_igv) {
        this.tasa_igv = tasa_igv;
    }

    public String getDocu_isc() {
        return docu_isc;
    }

    public void setDocu_isc(String docu_isc) {
        this.docu_isc = docu_isc;
    }

    public String getTasa_isc() {
        return tasa_isc;
    }

    public void setTasa_isc(String tasa_isc) {
        this.tasa_isc = tasa_isc;
    }

    public String getDocu_otrostributos() {
        return docu_otrostributos;
    }

    public void setDocu_otrostributos(String docu_otrostributos) {
        this.docu_otrostributos = docu_otrostributos;
    }

    public String getTasa_otrostributos() {
        return tasa_otrostributos;
    }

    public void setTasa_otrostributos(String tasa_otrostributos) {
        this.tasa_otrostributos = tasa_otrostributos;
    }

    public String getDocu_otroscargos() {
        return docu_otroscargos;
    }

    public void setDocu_otroscargos(String docu_otroscargos) {
        this.docu_otroscargos = docu_otroscargos;
    }

    public String getDocu_percepcion() {
        return docu_percepcion;
    }

    public void setDocu_percepcion(String docu_percepcion) {
        this.docu_percepcion = docu_percepcion;
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

    public Date getDocu_proce_fecha() {
        return docu_proce_fecha;
    }

    public void setDocu_proce_fecha(Date docu_proce_fecha) {
        this.docu_proce_fecha = docu_proce_fecha;
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

    public String getClie_correo_cpe1() {
        return clie_correo_cpe1;
    }

    public void setClie_correo_cpe1(String clie_correo_cpe1) {
        this.clie_correo_cpe1 = clie_correo_cpe1;
    }

    public String getClie_correo_cpe2() {
        return clie_correo_cpe2;
    }

    public void setClie_correo_cpe2(String clie_correo_cpe2) {
        this.clie_correo_cpe2 = clie_correo_cpe2;
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

    public Long getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(Long venta_id) {
        this.venta_id = venta_id;
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
