package one2many;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ORD")
public class Order {
	
	@Id
	@Column(name="ORDID",length=3)
	private int orderId;
	
	@Column(name="ORDERDATE")
	private LocalDate orderDate;
	
	 @ManyToOne
	 @JoinColumn(name="custid")
	 private Customer customer;
	 
	 
	 public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@OneToMany(mappedBy="Order",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
		private List<Item> item;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getCommPlan() {
		return commPlan;
	}

	public void setCommPlan(String commPlan) {
		this.commPlan = commPlan;
	}

	public LocalDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDate shipDate) {
		this.shipDate = shipDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Column(name="COMMPLAN",length=1)
	private String commPlan;
	
	@Column(name="SHIPDATE")
	private LocalDate shipDate;
	
	@Column(name="TOTAL")
	private double total;
	
	
	
	
}
/* ORDID                                     NOT NULL NUMBER(4)
ORDERDATE                                          DATE
COMMPLAN                                           VARCHAR2(1)
CUSTID                                    NOT NULL NUMBER(6)
SHIPDATE                                           DATE
TOTAL                                              NUMBER(8,2)*/