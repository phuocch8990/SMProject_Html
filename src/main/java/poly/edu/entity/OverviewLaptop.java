package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the overview_laptop database table.
 * 
 */
@Entity
@Table(name="overview_laptop")
@NamedQuery(name="OverviewLaptop.findAll", query="SELECT o FROM OverviewLaptop o")
public class OverviewLaptop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	//bi-directional many-to-one association to ExpandableFeature
	@ManyToOne
	@JoinColumn(name="EXPANDABLE_FEATURES_ID")
	private ExpandableFeature expandableFeature;

	//bi-directional many-to-one association to GraphicsSound
	@ManyToOne
	@JoinColumn(name="GRAPHICS_SOUND_ID")
	private GraphicsSound graphicsSound;

	//bi-directional many-to-one association to MemoryLaptop
	@ManyToOne
	@JoinColumn(name="MEMORY_LAPTOP_ID")
	private MemoryLaptop memoryLaptop;

	//bi-directional many-to-one association to Processor
	@ManyToOne
	private Processor processor;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	//bi-directional many-to-one association to Screen
	@ManyToOne
	private Screen screen;

	public OverviewLaptop() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ExpandableFeature getExpandableFeature() {
		return this.expandableFeature;
	}

	public void setExpandableFeature(ExpandableFeature expandableFeature) {
		this.expandableFeature = expandableFeature;
	}

	public GraphicsSound getGraphicsSound() {
		return this.graphicsSound;
	}

	public void setGraphicsSound(GraphicsSound graphicsSound) {
		this.graphicsSound = graphicsSound;
	}

	public MemoryLaptop getMemoryLaptop() {
		return this.memoryLaptop;
	}

	public void setMemoryLaptop(MemoryLaptop memoryLaptop) {
		this.memoryLaptop = memoryLaptop;
	}

	public Processor getProcessor() {
		return this.processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
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