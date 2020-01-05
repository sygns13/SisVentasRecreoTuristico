package modelIfz.beans;

public class ProductoPlato {

    private Long id=null;
    private String nombre;
    private double precio_venta;
    private String codigo;
    private Long user_id;
    private Long empresa_id;
    private int activo;
    private int borrado;
    private Double created_at;
    private Double updated_at;
    private Long tipo_producto_id;

    private Empresa empresa;
    private User user;

    public ProductoPlato() {
    }

    public ProductoPlato(Long id, String nombre, double precio_venta, String codigo, Long user_id, Long empresa_id, int activo, int borrado, Double created_at, Double updated_at, Long tipo_producto_id, Empresa empresa, User user) {
        this.id = id;
        this.nombre = nombre;
        this.precio_venta = precio_venta;
        this.codigo = codigo;
        this.user_id = user_id;
        this.empresa_id = empresa_id;
        this.activo = activo;
        this.borrado = borrado;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.tipo_producto_id = tipo_producto_id;
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

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Double getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Double created_at) {
        this.created_at = created_at;
    }

    public Double getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Double updated_at) {
        this.updated_at = updated_at;
    }

    public Long getTipo_producto_id() {
        return tipo_producto_id;
    }

    public void setTipo_producto_id(Long tipo_producto_id) {
        this.tipo_producto_id = tipo_producto_id;
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
