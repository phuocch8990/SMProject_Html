package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the processor database table.
 * 
 */
@Entity
@NamedQuery(name="Processor.findAll", query="SELECT p FROM Processor p")
public class Processor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="BUS_CPU")
	private String busCpu;

	@Column(name="SPEED_CPU")
	private String speedCpu;

	@Column(name="TECHNOLOGY_CPU")
	private String technologyCpu;

	@Column(name="TYPE_CPU")
	private String typeCpu;

	//bi-directional many-to-one association to OverviewLaptop
	@OneToMany(mappedBy="processor", fetch=FetchType.EAGER)
	private List<OverviewLaptop> overviewLaptops;

	public Processor() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusCpu() {
		return this.busCpu;
	}

	public void setBusCpu(String busCpu) {
		this.busCpu = busCpu;
	}

	public String getSpeedCpu() {
		return this.speedCpu;
	}

	public void setSpeedCpu(String speedCpu) {
		this.speedCpu = speedCpu;
	}

	public String getTechnologyCpu() {
		return this.technologyCpu;
	}

	public void setTechnologyCpu(String technologyCpu) {
		this.technologyCpu = technologyCpu;
	}

	public String getTypeCpu() {
		return this.typeCpu;
	}

	public void setTypeCpu(String typeCpu) {
		this.typeCpu = typeCpu;
	}

	public List<OverviewLaptop> getOverviewLaptops() {
		return this.overviewLaptops;
	}

	public void setOverviewLaptops(List<OverviewLaptop> overviewLaptops) {
		this.overviewLaptops = overviewLaptops;
	}

	public OverviewLaptop addOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().add(overviewLaptop);
		overviewLaptop.setProcessor(this);

		return overviewLaptop;
	}

	public OverviewLaptop removeOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().remove(overviewLaptop);
		overviewLaptop.setProcessor(null);

		return overviewLaptop;
	}

}