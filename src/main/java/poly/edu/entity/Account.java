package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String email;

	private String fullname;

	private byte gender;

	private String password;

	private String phone;

	private byte roles;

	//bi-directional many-to-one association to CommentProduct
	@OneToMany(mappedBy="account", fetch=FetchType.EAGER)
	private List<CommentProduct> commentProducts;

	//bi-directional many-to-one association to Image
	@OneToMany(mappedBy="account", fetch=FetchType.EAGER)
	private List<Image> images;

	//bi-directional many-to-one association to Invoice
	@OneToMany(mappedBy="account", fetch=FetchType.EAGER)
	private List<Invoice> invoices;

	public Account() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public byte getGender() {
		return this.gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte getRoles() {
		return this.roles;
	}

	public void setRoles(byte roles) {
		this.roles = roles;
	}

	public List<CommentProduct> getCommentProducts() {
		return this.commentProducts;
	}

	public void setCommentProducts(List<CommentProduct> commentProducts) {
		this.commentProducts = commentProducts;
	}

	public CommentProduct addCommentProduct(CommentProduct commentProduct) {
		getCommentProducts().add(commentProduct);
		commentProduct.setAccount(this);

		return commentProduct;
	}

	public CommentProduct removeCommentProduct(CommentProduct commentProduct) {
		getCommentProducts().remove(commentProduct);
		commentProduct.setAccount(null);

		return commentProduct;
	}

	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Image addImage(Image image) {
		getImages().add(image);
		image.setAccount(this);

		return image;
	}

	public Image removeImage(Image image) {
		getImages().remove(image);
		image.setAccount(null);

		return image;
	}

	public List<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Invoice addInvoice(Invoice invoice) {
		getInvoices().add(invoice);
		invoice.setAccount(this);

		return invoice;
	}

	public Invoice removeInvoice(Invoice invoice) {
		getInvoices().remove(invoice);
		invoice.setAccount(null);

		return invoice;
	}

}