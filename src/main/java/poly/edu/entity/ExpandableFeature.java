package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the expandable_features database table.
 * 
 */
@Entity
@Table(name="expandable_features")
@NamedQuery(name="ExpandableFeature.findAll", query="SELECT e FROM ExpandableFeature e")
public class ExpandableFeature implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="CONG_GIAO_TIEP")
	private String congGiaoTiep;

	@Column(name="READ_MICROSD")
	private String readMicrosd;

	@Column(name="WIRELESS_CONNECTIVITY")
	private String wirelessConnectivity;

	//bi-directional many-to-one association to OverviewLaptop
	@OneToMany(mappedBy="expandableFeature", fetch=FetchType.EAGER)
	private List<OverviewLaptop> overviewLaptops;

	public ExpandableFeature() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCongGiaoTiep() {
		return this.congGiaoTiep;
	}

	public void setCongGiaoTiep(String congGiaoTiep) {
		this.congGiaoTiep = congGiaoTiep;
	}

	public String getReadMicrosd() {
		return this.readMicrosd;
	}

	public void setReadMicrosd(String readMicrosd) {
		this.readMicrosd = readMicrosd;
	}

	public String getWirelessConnectivity() {
		return this.wirelessConnectivity;
	}

	public void setWirelessConnectivity(String wirelessConnectivity) {
		this.wirelessConnectivity = wirelessConnectivity;
	}

	public List<OverviewLaptop> getOverviewLaptops() {
		return this.overviewLaptops;
	}

	public void setOverviewLaptops(List<OverviewLaptop> overviewLaptops) {
		this.overviewLaptops = overviewLaptops;
	}

	public OverviewLaptop addOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().add(overviewLaptop);
		overviewLaptop.setExpandableFeature(this);

		return overviewLaptop;
	}

	public OverviewLaptop removeOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().remove(overviewLaptop);
		overviewLaptop.setExpandableFeature(null);

		return overviewLaptop;
	}

}