package pe.edu.galaxy.training.java.presentacion.procesos;

import java.util.Optional;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import pe.edu.galaxy.training.java.bean.maestros.Cliente;
import pe.edu.galaxy.training.java.bean.procesos.PedidoCabesera;
import pe.edu.galaxy.training.java.presentacion.generico.GenericoMB;
import pe.edu.galaxy.training.java.service.impl.ClienteServiceImpl;
import pe.edu.galaxy.training.java.service.inf.ClienteService;

@ManagedBean(name = "pedidoMB")
@SessionScoped
public class PedidoMB extends GenericoMB {
	private Cliente cliente;
	private PedidoCabesera pedidoCabesera;
	private ClienteService clienteService;

//	private Empleado empleado;

	public PedidoMB() {
		this.cliente = new Cliente();
		this.setPedidoCabesera(new PedidoCabesera());
		this.clienteService = new ClienteServiceImpl();
		this.cliente.setNroDocumento("20100017491");
	}

	public void buscarClienteXNroDocumento() {
		try {
			//variable para almacenar el nuemero de documento
			String getNroDocumento = this.cliente.getNroDocumento();

			//validacion cuando sale nullPointerExeption
			if (this.clienteService == null) {
				System.out.println("cliente is null");
			} else {
				System.out.println("cliente is not null");
			}

			//variable de tipo Optional 
			Optional<Cliente> optCliente = this.clienteService.buscarClienteXNroDocumento(getNroDocumento);
			
			//validadicon si el optCliente esta vacio
			if (optCliente.isEmpty()) {
				super.msgAlert("No existe Cliente con el Ruc: " + getNroDocumento + " especificado");
			}
			
			//optiene el cliente
			this.cliente = optCliente.get();
			
			//validacion si clinete no se encuentra
			if (this.getCliente().getRazonSocial() == null) {
				super.msgAlert("No existe Cliente con el Ruc: " + getNroDocumento + " especificado");
			}

			System.out.println(cliente);
		} catch (Exception e) {
			e.printStackTrace();
			super.msgError("Erro al realizar la búsqueda");
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PedidoCabesera getPedidoCabesera() {
		return pedidoCabesera;
	}

	public void setPedidoCabesera(PedidoCabesera pedidoCabesera) {
		this.pedidoCabesera = pedidoCabesera;
	}

}
