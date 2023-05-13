package pe.edu.galaxy.training.java.persistencia.inf;

import pe.edu.galaxy.training.java.bean.seguridad.Usuario;
import pe.edu.galaxy.training.java.persistencia.PersistenciaException;

public interface UsuarioDAO extends GenericoDAO<Usuario>{

	Usuario validarAcceso(Usuario usuario) throws PersistenciaException;
	
}
