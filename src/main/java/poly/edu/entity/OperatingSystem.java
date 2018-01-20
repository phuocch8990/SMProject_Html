package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the operating_system database table.
 * 
 */
@Entity
@Table(name="operating_system")
@NamedQuery(name="OperatingSystem.findAll", query="SELECT o FROM OperatingSystem o")
public class OperatingSystem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String chipset;

	private String gpu;

	private String operating;

	@Column(name="SPEED_CPU")
	private String speedCpu;

	//bi-directional many-to-one association to OverviewPhone
	@OneToMany(mappedBy="operatingSystem", fetch=FetchType.EAGER)
	private List<OverviewPhone> overviewPhones;

	public OperatingSystem() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChipset() {
		return this.chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getGpu() {
		return this.gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getOperating() {
		return this.operating;
	}

	public void setOperating(String operating) {
		this.operating = operating;
	}

	public String getSpeedCpu() {
		return this.speedCpu;
	}

	public void setSpeedCpu(String speedCpu) {
		this.speedCpu = speedCpu;
	}

	public List<OverviewPhone> getOverviewPhones() {
		return this.overviewPhones;
	}

	public void setOverviewPhones(List<OverviewPhone> overviewPhones) {
		this.overviewPhones = overviewPhones;
	}

	public OverviewPhone addOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().add(overviewPhone);
		overviewPhone.setOperatingSystem(this);

		return overviewPhone;
	}

	public OverviewPhone removeOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().remove(overviewPhone);
		overviewPhone.setOperatingSystem(null);

		return overviewPhone;
	}

}