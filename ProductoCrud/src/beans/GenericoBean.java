package beans;

public class GenericoBean {
  private Long 	id;
  private String 	estado;

  public GenericoBean() {
  }

  public GenericoBean(Long id) {
    this.id = id;
  }

  public GenericoBean(Long id, String estado) {
    this.id = id;
    this.estado = estado;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return "GenericoBean{" +
            "id=" + id +
            ", estado='" + estado + '\'' +
            '}';
  }
}
