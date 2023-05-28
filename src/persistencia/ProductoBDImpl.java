package persistencia;

import beans.Producto;
import utilitario.ConnetDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoBDImpl implements ProductoBD {

  @Override
  public List<Producto> listar() {
    try {
      ConnetDB.cargarDriver();
      Connection cn = ConnetDB.conectar();
      String sql = "SELECT PRODUCTO_ID, NOMBRE, PRECIO, CANTIDAD, ESTADO FROM PRODUCTO";
      assert cn != null;
      PreparedStatement ps = cn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();

      List<Producto> productos = new ArrayList<>();
      while (rs.next()) {
        Producto oProducto = new Producto();
        oProducto.setId(rs.getLong("PRODUCTO_ID"));
        oProducto.setNombre(rs.getString("NOMBRE"));
        oProducto.setPrecio(rs.getDouble("PRECIO"));
        oProducto.setCantidad(rs.getInt("CANTIDAD"));
        oProducto.setEstado(rs.getString("ESTADO"));
        productos.add(oProducto);
      }

      rs.close();
      ps.close();
      cn.close();

      return productos;

    } catch (Exception e) {
      System.err.println("Error al listar" + e.getMessage());
      return null;
    }
  }

  @Override
  public Boolean insertar(Producto producto) {
    try {
      ConnetDB.cargarDriver();
      Connection cn = ConnetDB.conectar();
      String sql = "INSERT INTO PRODUCTO(PRODUCTO_ID, NOMBRE, PRECIO, CANTIDAD) VALUES (?, ?, ?, ?)";

      assert cn != null;
      PreparedStatement ps = cn.prepareStatement(sql);
      ps.setLong(1, producto.getId());
      ps.setString(2, producto.getNombre());
      ps.setDouble(3, producto.getPrecio());
      ps.setInt(4, producto.getCantidad());

      int ret = ps.executeUpdate();

      ps.close();
      cn.close();
      return ret > 0;
    } catch (Exception e) {
      System.err.println("error" + e.getMessage());
      return false;
    }
  }

  @Override
  public Boolean actualizar(Producto producto) {
    try {
      ConnetDB.conectar();
      Connection cn = ConnetDB.conectar();
      String sql = "UPDATE PRODUCTO SET NOMBRE=?, PRECIO=?, CANTIDAD=?  WHERE PRODUCTO_ID=?";
      assert cn != null;
      PreparedStatement ps = cn.prepareStatement(sql);
      ps.setString(1, producto.getNombre());
      ps.setDouble(2, producto.getPrecio());
      ps.setInt(3, producto.getCantidad());
      ps.setLong(4, producto.getId());

      int ret = ps.executeUpdate();

      ps.close();
      cn.close();
      return ret > 0;
    } catch (Exception e) {
      System.err.println("Error" + e.getMessage());
      return false;
    }
  }

  @Override
  public Boolean eliminar(Producto producto) {
    try {
      ConnetDB.cargarDriver();
      Connection cn = ConnetDB.conectar();
      String sql = "UPDATE PRODUCTO SET ESTADO=?  WHERE PRODUCTO_ID=?";
      assert cn != null;
      PreparedStatement ps = cn.prepareStatement(sql);
      ps.setString(1, producto.getEstado());
      ps.setLong(2, producto.getId());
      int ret = ps.executeUpdate();
      ps.close();
      cn.close();
      return ret > 0;
    } catch (Exception e) {
      System.err.println("Error" + e.getMessage());
      return false;
    }
  }
}
