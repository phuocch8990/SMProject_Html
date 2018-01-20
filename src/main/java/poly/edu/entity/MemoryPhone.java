package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the memory_phone database table.
 * 
 */
@Entity
@Table(name="memory_phone")
@NamedQuery(name="MemoryPhone.findAll", query="SELECT m FROM MemoryPhone m")
public class MemoryPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="MICRO_SD")
	private String microSd;

	private String ram;

	private String rom;

	//bi-directional many-to-one association to OverviewPhone
	@OneToMany(mappedBy="memoryPhone", fetch=FetchType.EAGER)
	private List<OverviewPhone> overviewPhones;

	public MemoryPhone() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMicroSd() {
		return this.microSd;
	}

	public void setMicroSd(String microSd) {
		this.microSd = microSd;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return this.rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public List<OverviewPhone> getOverviewPhones() {
		return this.overviewPhones;
	}

	public void setOverviewPhones(List<OverviewPhone> overviewPhones) {
		this.overviewPhones = overviewPhones;
	}

	public OverviewPhone addOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().add(overviewPhone);
		overviewPhone.setMemoryPhone(this);

		return overviewPhone;
	}

	public OverviewPhone removeOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().remove(overviewPhone);
		overviewPhone.setMemoryPhone(null);

		return overviewPhone;
	}

}