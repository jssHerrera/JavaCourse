package pe.edu.galaxy.training.java.service.inf;

import java.util.List;
import java.util.Optional;

import pe.edu.galaxy.training.java.bean.maestros.Cliente;
import pe.edu.galaxy.training.java.bean.maestros.ClienteVO;
import pe.edu.galaxy.training.java.service.ServicioException;

public interface ClienteService extends GenericoService<Cliente>{
	List<ClienteVO> listarVO(ClienteVO clienteVO) throws ServicioException;
	Optional<Cliente> buscarClienteXNroDocumento(String nroDocumento) throws ServicioException;
}
