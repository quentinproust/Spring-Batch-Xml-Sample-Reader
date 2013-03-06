package xmlsample.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {
	@XmlElement
	private String id;
	@XmlElement
	private int product;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * @return the product
	 */
	public int getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(final int product) {
		this.product = product;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + "]";
	}

}
