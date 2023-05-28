package persistencia;

import beans.Producto;

import java.util.List;

public interface ProductoBD {

  List<Producto> listar();
  Boolean insertar(Producto producto);
  Boolean actualizar(Producto producto);
  Boolean eliminar(Producto producto);
}
