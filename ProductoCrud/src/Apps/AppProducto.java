package Apps;

import beans.Producto;
import persistencia.ProductoBD;
import persistencia.ProductoBDImpl;

import java.util.List;

public class AppProducto {

  public static void main(String[] args) {
    eliminar();
    //actualizar();
    //insertar();
    listar();
  }

  private static void listar() {
    ProductoBD productoBD = new ProductoBDImpl();
    List<Producto> productos = productoBD.listar();
    for (Producto producto : productos) {
      System.out.println(producto);
    }

  }
  private static void insertar() {
    Producto  producto = new Producto();
    producto.setId(5L);
    producto.setNombre("Producto 5");
    producto.setPrecio(300D);
    producto.setCantidad(3);

    ProductoBD productoBD = new ProductoBDImpl();

   if(productoBD.insertar(producto)){
     System.out.println("exito");
   }else{
     System.out.println("error");
   }
  }

  private static void actualizar() {
    Producto  producto = new Producto(1L, "PRODUCTO NUEVO II", 600D, 100);
    ProductoBD productoBD = new ProductoBDImpl();

    if(productoBD.actualizar(producto)){
      System.out.println("exito");
    }else{
      System.out.println("error");
    }
  }

  private static void eliminar() {
    Producto  producto = new Producto(1L, "1");
    ProductoBD productoBD = new ProductoBDImpl();

    if(productoBD.eliminar(producto)){
      System.out.println("exito");
    }else{
      System.out.println("error");
    }
  }
}
