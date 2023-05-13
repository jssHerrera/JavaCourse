package pe.edu.galaxy.training.java.service.impl;

import java.util.List;
import java.util.Optional;

import pe.edu.galaxy.training.java.bean.maestros.Cliente;
import pe.edu.galaxy.training.java.bean.maestros.ClienteVO;
import pe.edu.galaxy.training.java.persistencia.PersistenciaException;
import pe.edu.galaxy.training.java.persistencia.impl.ClienteDAOImpl;
import pe.edu.galaxy.training.java.persistencia.inf.ClienteDAO;
import pe.edu.galaxy.training.java.service.ServicioException;
import pe.edu.galaxy.training.java.service.inf.ClienteService;

public class ClienteServiceImpl implements ClienteService {

	private ClienteDAO clienteDAO;

	public ClienteServiceImpl() {
		this.clienteDAO = new ClienteDAOImpl();
	}

	@Override
	public List<Cliente> listar(Cliente t) throws ServicioException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarXId(Long id) throws ServicioException {
		try {
			return clienteDAO.buscarXId(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServicioException(e);
		}
	}

	@Override
	public boolean insertar(Cliente cliente) throws ServicioException {
		try {
			return clienteDAO.insertar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServicioException(e);
		}
	}

	@Override
	public boolean actualizar(Cliente cliente) throws ServicioException {
		try {
			return clienteDAO.actualizar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServicioException(e);
		}
	}

	@Override
	public boolean eliminar(Cliente t) throws ServicioException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ClienteVO> listarVO(ClienteVO clienteVO) throws ServicioException {
		try {
			return clienteDAO.listarVO(clienteVO);
		} catch (PersistenciaException e) {
			throw new ServicioException(e);
		}
	}

	@Override
	public Optional<Cliente> buscarClienteXNroDocumento(String nroDocumento) throws ServicioException {
		try {
			return clienteDAO.buscarClienteXNroDocumento(nroDocumento);
		} catch (PersistenciaException e) {
			throw new ServicioException(e);
		}
	}

}
