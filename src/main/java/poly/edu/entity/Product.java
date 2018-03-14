package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String description;

	@Column(name="IMAGES_PRODUCT")
	private String imagesProduct;

	@Column(name="NAME_PRODUCT")
	private String nameProduct;

	private BigDecimal price;

	//bi-directional many-to-one association to CommentProduct
	@OneToMany(mappedBy="product", fetch=FetchType.EAGER)
	private List<CommentProduct> commentProducts;

	//bi-directional many-to-one association to InvoiceDetail
//	@OneToMany(mappedBy="product", fetch=FetchType.EAGER)
//	private List<InvoiceDetail> invoiceDetails;

	//bi-directional many-to-one association to OverviewLaptop
//	@OneToMany(mappedBy="product", fetch=FetchType.LAZY)
//	private List<OverviewLaptop> overviewLaptops;
//
//	//bi-directional many-to-one association to OverviewPhone
//	@OneToMany(mappedBy="product", fetch=FetchType.LAZY)
//	private List<OverviewPhone> overviewPhones;

	//bi-directional many-to-one association to Category
	@ManyToOne
	private Category category;

	public Product() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagesProduct() {
		return this.imagesProduct;
	}

	public void setImagesProduct(String imagesProduct) {
		this.imagesProduct = imagesProduct;
	}

	public String getNameProduct() {
		return this.nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<CommentProduct> getCommentProducts() {
		return this.commentProducts;
	}

	public void setCommentProducts(List<CommentProduct> commentProducts) {
		this.commentProducts = commentProducts;
	}

	public CommentProduct addCommentProduct(CommentProduct commentProduct) {
		getCommentProducts().add(commentProduct);
		commentProduct.setProduct(this);

		return commentProduct;
	}

	public CommentProduct removeCommentProduct(CommentProduct commentProduct) {
		getCommentProducts().remove(commentProduct);
		commentProduct.setProduct(null);

		return commentProduct;
	}

//	public List<InvoiceDetail> getInvoiceDetails() {
//		return this.invoiceDetails;
//	}
//
//	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
//		this.invoiceDetails = invoiceDetails;
//	}
//
//	public InvoiceDetail addInvoiceDetail(InvoiceDetail invoiceDetail) {
//		getInvoiceDetails().add(invoiceDetail);
//		invoiceDetail.setProduct(this);
//
//		return invoiceDetail;
//	}
//
//	public InvoiceDetail removeInvoiceDetail(InvoiceDetail invoiceDetail) {
//		getInvoiceDetails().remove(invoiceDetail);
//		invoiceDetail.setProduct(null);
//
//		return invoiceDetail;
//	}

//	public List<OverviewLaptop> getOverviewLaptops() {
//		return this.overviewLaptops;
//	}
//
//	public void setOverviewLaptops(List<OverviewLaptop> overviewLaptops) {
//		this.overviewLaptops = overviewLaptops;
//	}
//
//	public OverviewLaptop addOverviewLaptop(OverviewLaptop overviewLaptop) {
//		getOverviewLaptops().add(overviewLaptop);
//		overviewLaptop.setProduct(this);
//
//		return overviewLaptop;
//	}
//
//	public OverviewLaptop removeOverviewLaptop(OverviewLaptop overviewLaptop) {
//		getOverviewLaptops().remove(overviewLaptop);
//		overviewLaptop.setProduct(null);
//
//		return overviewLaptop;
//	}
//
//	public List<OverviewPhone> getOverviewPhones() {
//		return this.overviewPhones;
//	}
//
//	public void setOverviewPhones(List<OverviewPhone> overviewPhones) {
//		this.overviewPhones = overviewPhones;
//	}
//
//	public OverviewPhone addOverviewPhone(OverviewPhone overviewPhone) {
//		getOverviewPhones().add(overviewPhone);
//		overviewPhone.setProduct(this);
//
//		return overviewPhone;
//	}
//
//	public OverviewPhone removeOverviewPhone(OverviewPhone overviewPhone) {
//		getOverviewPhones().remove(overviewPhone);
//		overviewPhone.setProduct(null);
//		return overviewPhone;
//	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", description=" + description + ", imagesProduct=" + imagesProduct
//				+ ", nameProduct=" + nameProduct + ", price=" + price + ", commentProducts=" + commentProducts
//				+ ", invoiceDetails=" + invoiceDetails + ", overviewLaptops=" + overviewLaptops + ", overviewPhones="
//				+ overviewPhones + ", category=" + category + "]";
//	}
	

}