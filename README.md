## Producto - Crud

Este proyecto es un crud basico que permite Listar, Crear, actualizar y eliminar. los datos registrados en BD

## Configuración de la conexión a la base de datos

El proyecto utiliza una base de datos Oracle para almacenar los datos. Para establecer la conexión a la base de datos, se requiere lo siguiente:

### Controlador JDBC

El proyecto utiliza el controlador JDBC de Oracle. Asegúrate de descargar y agregar el archivo jar del controlador JDBC en el directorio lib del proyecto.

### Detalles de conexión

Se utilizan los siguientes detalles de conexión para establecer la conexión con la base de datos Oracle:

- URL: `jdbc:oracle:thin:@localhost:1521:XE`
- Usuario: `your_username`
- Contraseña: `your_password`
- Controlador: `oracle.jdbc.OracleDriver`

### Drive jar
El proyecto utiliza el driver JDBC de Oracle, el archivo jar que se utiliza es `obdbc11.jar`
