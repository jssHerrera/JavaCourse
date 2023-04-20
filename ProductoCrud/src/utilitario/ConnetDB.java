package utilitario;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnetDB {
  private  static  String url = "jdbc:oracle:thin:@localhost:1521:XE";
  private  static  String usuario = "JWEBM1";
  private  static  String clave = "secret";
  private static String driver 	= "oracle.jdbc.OracleDriver";

  public static  Boolean cargarDriver() {
    try {
      Class.forName(driver);
      return true;
    } catch (Exception e) {
      System.err.println("Error al cargar el driver " + e.getMessage());
      return false;
    }
  }
  public static  Boolean cargarDriver(String driver) {
    ConnetDB.driver=driver;
    return cargarDriver();
  }
  public static Connection conectar(String url,String usuario,String clave) {
    ConnetDB.url=url;
    ConnetDB.usuario=usuario;
    ConnetDB.clave=clave;
    return conectar();
  }
  public static Connection conectar() {
    try {
      if (!cargarDriver()) {
        return null;
      }
      return DriverManager.getConnection(url, usuario, clave);
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println("Error de conexion " + e.getMessage());
      return null;
    }

  }
}
