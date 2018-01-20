package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the overview_phone database table.
 * 
 */
@Entity
@Table(name="overview_phone")
@NamedQuery(name="OverviewPhone.findAll", query="SELECT o FROM OverviewPhone o")
public class OverviewPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	//bi-directional many-to-one association to BehindCamera
	@ManyToOne
	@JoinColumn(name="BEHIND_CAMERA_ID")
	private BehindCamera behindCamera;

	//bi-directional many-to-one association to FrontCamera
	@ManyToOne
	@JoinColumn(name="FRONT_CAMERA_ID")
	private FrontCamera frontCamera;

	//bi-directional many-to-one association to MemoryPhone
	@ManyToOne
	@JoinColumn(name="MEMORY_PHONE_ID")
	private MemoryPhone memoryPhone;

	//bi-directional many-to-one association to OperatingSystem
	@ManyToOne
	@JoinColumn(name="OPERATING_SYSTEM_ID")
	private OperatingSystem operatingSystem;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	//bi-directional many-to-one association to Screen
	@ManyToOne
	private Screen screen;

	public OverviewPhone() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BehindCamera getBehindCamera() {
		return this.behindCamera;
	}

	public void setBehindCamera(BehindCamera behindCamera) {
		this.behindCamera = behindCamera;
	}

	public FrontCamera getFrontCamera() {
		return this.frontCamera;
	}

	public void setFrontCamera(FrontCamera frontCamera) {
		this.frontCamera = frontCamera;
	}

	public MemoryPhone getMemoryPhone() {
		return this.memoryPhone;
	}

	public void setMemoryPhone(MemoryPhone memoryPhone) {
		this.memoryPhone = memoryPhone;
	}

	public OperatingSystem getOperatingSystem() {
		return this.operatingSystem;
	}

	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Screen getScreen() {
		return this.screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

}