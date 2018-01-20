package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the behind_camera database table.
 * 
 */
@Entity
@Table(name="behind_camera")
@NamedQuery(name="BehindCamera.findAll", query="SELECT b FROM BehindCamera b")
public class BehindCamera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String advanced;

	private String camera;

	private String flash;

	private String resolution;

	//bi-directional many-to-one association to OverviewPhone
	@OneToMany(mappedBy="behindCamera", fetch=FetchType.EAGER)
	private List<OverviewPhone> overviewPhones;

	public BehindCamera() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdvanced() {
		return this.advanced;
	}

	public void setAdvanced(String advanced) {
		this.advanced = advanced;
	}

	public String getCamera() {
		return this.camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getFlash() {
		return this.flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public List<OverviewPhone> getOverviewPhones() {
		return this.overviewPhones;
	}

	public void setOverviewPhones(List<OverviewPhone> overviewPhones) {
		this.overviewPhones = overviewPhones;
	}

	public OverviewPhone addOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().add(overviewPhone);
		overviewPhone.setBehindCamera(this);

		return overviewPhone;
	}

	public OverviewPhone removeOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().remove(overviewPhone);
		overviewPhone.setBehindCamera(null);

		return overviewPhone;
	}

}