package pe.edu.galaxy.training.java.bean.procesos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import pe.edu.galaxy.training.java.bean.constantes.Constantes;
import pe.edu.galaxy.training.java.bean.generico.GenericoBean;
import pe.edu.galaxy.training.java.bean.maestros.Cliente;
import pe.edu.galaxy.training.java.bean.maestros.Empleado;

public class PedidoCabesera extends GenericoBean {
	
	private Cliente cliente;
	private Empleado empleado;
	private String glosa;
	
	private Date fechaRegistro;
	
	private Double subTotal;
	private Double descuento;
	private Double igv;
	private Double total;
	
	
	private List<PedidoDetalle> listarPedidoDetalle;
		
	public PedidoCabesera() {
		super();
		
		this.subTotal = 0.0;
		this.descuento = 0.0;
		this.igv = 0.0;
		this.total = 0.0;
		
		this.cliente = new Cliente();
		this.empleado = new Empleado();
		this.listarPedidoDetalle = new ArrayList<PedidoDetalle>();
	}

	
	public void calcularTotales() {
		if(Objects.isNull(this.listarPedidoDetalle)) {
			this.subTotal = 0.0;
			this.descuento = 0.0;
			this.igv = 0.0;
			this.total = 0.0;
		}
		
		for (PedidoDetalle obPedidoDetalle : listarPedidoDetalle) {
			this.subTotal += obPedidoDetalle.getSubTotal();
		}
		
		if(Objects.isNull(this.subTotal)) {
			this.subTotal = 0.0;
		}
		
		this.igv = (this.subTotal- this.descuento) * Constantes.IGV;
		this.total = this.subTotal + igv;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public String getGlosa() {
		return glosa;
	}

	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getIgv() {
		return igv;
	}

	public void setIgv(Double igv) {
		this.igv = igv;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<PedidoDetalle> getListarPedidoDetalle() {
		return listarPedidoDetalle;
	}

	public void setListarPedidoDetalle(List<PedidoDetalle> listarPedidoDetalle) {
		this.listarPedidoDetalle = listarPedidoDetalle;
	}

	@Override
	public String toString() {
		return "PedidoCabesera [cliente=" + cliente + ", empleado=" + empleado + ", glosa=" + glosa + ", fechaRegistro="
				+ fechaRegistro + ", subTotal=" + subTotal + ", descuento=" + descuento + ", igv=" + igv + ", total="
				+ total + ", listarPedidoDetalle=" + listarPedidoDetalle + "]";
	}
	
	
	
}
	