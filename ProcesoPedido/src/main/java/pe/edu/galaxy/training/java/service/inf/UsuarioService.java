package pe.edu.galaxy.training.java.service.inf;

import pe.edu.galaxy.training.java.bean.seguridad.Usuario;
import pe.edu.galaxy.training.java.service.ServicioException;

public interface UsuarioService extends GenericoService<Usuario> {

	Usuario validarAcceso(Usuario usuario) throws  ServicioException;
}
