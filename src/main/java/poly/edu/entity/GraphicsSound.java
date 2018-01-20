package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the graphics_sound database table.
 * 
 */
@Entity
@Table(name="graphics_sound")
@NamedQuery(name="GraphicsSound.findAll", query="SELECT g FROM GraphicsSound g")
public class GraphicsSound implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="GRAPHICS_CARD")
	private String graphicsCard;

	@Column(name="TECHNOLOGY_SOUND")
	private String technologySound;

	//bi-directional many-to-one association to OverviewLaptop
	@OneToMany(mappedBy="graphicsSound", fetch=FetchType.EAGER)
	private List<OverviewLaptop> overviewLaptops;

	public GraphicsSound() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGraphicsCard() {
		return this.graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public String getTechnologySound() {
		return this.technologySound;
	}

	public void setTechnologySound(String technologySound) {
		this.technologySound = technologySound;
	}

	public List<OverviewLaptop> getOverviewLaptops() {
		return this.overviewLaptops;
	}

	public void setOverviewLaptops(List<OverviewLaptop> overviewLaptops) {
		this.overviewLaptops = overviewLaptops;
	}

	public OverviewLaptop addOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().add(overviewLaptop);
		overviewLaptop.setGraphicsSound(this);

		return overviewLaptop;
	}

	public OverviewLaptop removeOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().remove(overviewLaptop);
		overviewLaptop.setGraphicsSound(null);

		return overviewLaptop;
	}

}