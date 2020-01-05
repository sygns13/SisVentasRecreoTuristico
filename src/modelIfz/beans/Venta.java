package modelIfz.beans;

import java.util.Date;

public class Venta {
    private Long id;
    private Date fecha;
    private Long clientes_id;
    private Long comprobantes_id;
    private double subtotal_inafecto;
    private double sub_total_afecto;
    private double igv;
    private int estado;
    private Long user_id;
    private int pagado;
    private String hora;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Date created_at;
    private Date updated_at;

    private Empresa empresa;
    private User user;

    public Venta() {
    }

    public Venta(Long id, Date fecha, Long clientes_id, Long comprobantes_id, double subtotal_inafecto, double sub_total_afecto, double igv, int estado, Long user_id, int pagado, String hora, Long empresa_id, int activo, int borrado, Date created_at, Date updated_at, Empresa empresa, User user) {
        this.id = id;
        this.fecha = fecha;
        this.clientes_id = clientes_id;
        this.comprobantes_id = comprobantes_id;
        this.subtotal_inafecto = subtotal_inafecto;
        this.sub_total_afecto = sub_total_afecto;
        this.igv = igv;
        this.estado = estado;
        this.user_id = user_id;
        this.pagado = pagado;
        this.hora = hora;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(Long clientes_id) {
        this.clientes_id = clientes_id;
    }

    public Long getComprobantes_id() {
        return comprobantes_id;
    }

    public void setComprobantes_id(Long comprobantes_id) {
        this.comprobantes_id = comprobantes_id;
    }

    public double getSubtotal_inafecto() {
        return subtotal_inafecto;
    }

    public void setSubtotal_inafecto(double subtotal_inafecto) {
        this.subtotal_inafecto = subtotal_inafecto;
    }

    public double getSub_total_afecto() {
        return sub_total_afecto;
    }

    public void setSub_total_afecto(double sub_total_afecto) {
        this.sub_total_afecto = sub_total_afecto;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
