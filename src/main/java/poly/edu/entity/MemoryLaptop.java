package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the memory_laptop database table.
 * 
 */
@Entity
@Table(name="memory_laptop")
@NamedQuery(name="MemoryLaptop.findAll", query="SELECT m FROM MemoryLaptop m")
public class MemoryLaptop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="BUS_RAM")
	private String busRam;

	@Column(name="HARD_DRIVE")
	private String hardDrive;

	private String ram;

	@Column(name="TYPE_RAM")
	private String typeRam;

	//bi-directional many-to-one association to OverviewLaptop
	@OneToMany(mappedBy="memoryLaptop", fetch=FetchType.EAGER)
	private List<OverviewLaptop> overviewLaptops;

	public MemoryLaptop() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusRam() {
		return this.busRam;
	}

	public void setBusRam(String busRam) {
		this.busRam = busRam;
	}

	public String getHardDrive() {
		return this.hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getTypeRam() {
		return this.typeRam;
	}

	public void setTypeRam(String typeRam) {
		this.typeRam = typeRam;
	}

	public List<OverviewLaptop> getOverviewLaptops() {
		return this.overviewLaptops;
	}

	public void setOverviewLaptops(List<OverviewLaptop> overviewLaptops) {
		this.overviewLaptops = overviewLaptops;
	}

	public OverviewLaptop addOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().add(overviewLaptop);
		overviewLaptop.setMemoryLaptop(this);

		return overviewLaptop;
	}

	public OverviewLaptop removeOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().remove(overviewLaptop);
		overviewLaptop.setMemoryLaptop(null);

		return overviewLaptop;
	}

}