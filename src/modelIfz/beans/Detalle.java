package modelIfz.beans;

import java.util.Date;

public class Detalle {
    private Long id=null;
    private Long cabecera_id;
    private String item_orden;
    private String item_unidad;
    private String item_cantidad;
    private String item_codproducto;
    private String item_descripcion;
    private String item_afectacion;
    private String item_tipo_precio_venta;
    private String item_pventa;
    private String item_pventa_no_onerosa;
    private String item_to_subtotal;
    private String item_to_igv;
    private String item_preunitfin;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public Detalle() {
    }

    public Detalle(Long id, Long cabecera_id, String item_orden, String item_unidad, String item_cantidad, String item_codproducto, String item_descripcion, String item_afectacion, String item_tipo_precio_venta, String item_pventa, String item_pventa_no_onerosa, String item_to_subtotal, String item_to_igv, String item_preunitfin, Long user_id, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.cabecera_id = cabecera_id;
        this.item_orden = item_orden;
        this.item_unidad = item_unidad;
        this.item_cantidad = item_cantidad;
        this.item_codproducto = item_codproducto;
        this.item_descripcion = item_descripcion;
        this.item_afectacion = item_afectacion;
        this.item_tipo_precio_venta = item_tipo_precio_venta;
        this.item_pventa = item_pventa;
        this.item_pventa_no_onerosa = item_pventa_no_onerosa;
        this.item_to_subtotal = item_to_subtotal;
        this.item_to_igv = item_to_igv;
        this.item_preunitfin = item_preunitfin;
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

    public String getItem_orden() {
        return item_orden;
    }

    public void setItem_orden(String item_orden) {
        this.item_orden = item_orden;
    }

    public String getItem_unidad() {
        return item_unidad;
    }

    public void setItem_unidad(String item_unidad) {
        this.item_unidad = item_unidad;
    }

    public String getItem_cantidad() {
        return item_cantidad;
    }

    public void setItem_cantidad(String item_cantidad) {
        this.item_cantidad = item_cantidad;
    }

    public String getItem_codproducto() {
        return item_codproducto;
    }

    public void setItem_codproducto(String item_codproducto) {
        this.item_codproducto = item_codproducto;
    }

    public String getItem_descripcion() {
        return item_descripcion;
    }

    public void setItem_descripcion(String item_descripcion) {
        this.item_descripcion = item_descripcion;
    }

    public String getItem_afectacion() {
        return item_afectacion;
    }

    public void setItem_afectacion(String item_afectacion) {
        this.item_afectacion = item_afectacion;
    }

    public String getItem_tipo_precio_venta() {
        return item_tipo_precio_venta;
    }

    public void setItem_tipo_precio_venta(String item_tipo_precio_venta) {
        this.item_tipo_precio_venta = item_tipo_precio_venta;
    }

    public String getItem_pventa() {
        return item_pventa;
    }

    public void setItem_pventa(String item_pventa) {
        this.item_pventa = item_pventa;
    }

    public String getItem_pventa_no_onerosa() {
        return item_pventa_no_onerosa;
    }

    public void setItem_pventa_no_onerosa(String item_pventa_no_onerosa) {
        this.item_pventa_no_onerosa = item_pventa_no_onerosa;
    }

    public String getItem_to_subtotal() {
        return item_to_subtotal;
    }

    public void setItem_to_subtotal(String item_to_subtotal) {
        this.item_to_subtotal = item_to_subtotal;
    }

    public String getItem_to_igv() {
        return item_to_igv;
    }

    public void setItem_to_igv(String item_to_igv) {
        this.item_to_igv = item_to_igv;
    }

    public String getItem_preunitfin() {
        return item_preunitfin;
    }

    public void setItem_preunitfin(String item_preunitfin) {
        this.item_preunitfin = item_preunitfin;
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
