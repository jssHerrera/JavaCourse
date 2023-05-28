package beans;
public class Producto extends  GenericoBean{
  private String nombre;
  private Double precio;
  private Integer cantidad;

  public Producto() {
  }

  public Producto(Long id, String nombre, Double precio, Integer cantidad) {
    super(id);
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public Producto(Long id, String estado) {
    super(id, estado);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
}
  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return super.toString() + "Producto{" +
            "nombre='" + nombre + '\'' +
            ", precio=" + precio +
            ", cantidad=" + cantidad +
            '}';
  }
}
