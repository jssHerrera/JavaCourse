package pe.edu.galaxy.training.java.bean.procesos;

import pe.edu.galaxy.training.java.bean.maestros.Producto;
import pe.edu.galaxy.training.java.presentacion.generico.GenericoMB;
import static java.util.Objects.isNull;
public class PedidoDetalle extends GenericoMB{
	
	
	private PedidoCabesera pedidoCabesera;
	private Producto producto;
	private Integer cantidad;
	private Double precio;
	private Double subTotal;
	
	public  void calcularSubTotal() {
		if(isNull(this.precio)) {
			this.precio = 0.0;
		}
		if(isNull(this.cantidad)) {
			this.cantidad = 0;
		}
		
		this.subTotal = this.precio* this.cantidad;
	}
	
	public PedidoDetalle() {
	super();
	this.pedidoCabesera = new PedidoCabesera();
	this.producto = new Producto();
	}

	public PedidoCabesera getPedidoCabesera() {
		return pedidoCabesera;
	}

	public void setPedidoCabesera(PedidoCabesera pedidoCabesera) {
		this.pedidoCabesera = pedidoCabesera;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "PedidoDetalle [pedidoCabesera=" + pedidoCabesera + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", subTotal=" + subTotal + "]";
	}

	
}
