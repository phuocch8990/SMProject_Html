package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the screen database table.
 * 
 */
@Entity
@NamedQuery(name="Screen.findAll", query="SELECT s FROM Screen s")
public class Screen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String resolution;

	@Column(name="SCREEN_TECHNOLOGY")
	private String screenTechnology;

	@Column(name="TOUCH_TECHNOLOGY")
	private String touchTechnology;

	@Column(name="WIDE_SCREEN")
	private String wideScreen;

	//bi-directional many-to-one association to OverviewLaptop
	@OneToMany(mappedBy="screen", fetch=FetchType.EAGER)
	private List<OverviewLaptop> overviewLaptops;

	//bi-directional many-to-one association to OverviewPhone
	@OneToMany(mappedBy="screen", fetch=FetchType.EAGER)
	private List<OverviewPhone> overviewPhones;

	public Screen() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getScreenTechnology() {
		return this.screenTechnology;
	}

	public void setScreenTechnology(String screenTechnology) {
		this.screenTechnology = screenTechnology;
	}

	public String getTouchTechnology() {
		return this.touchTechnology;
	}

	public void setTouchTechnology(String touchTechnology) {
		this.touchTechnology = touchTechnology;
	}

	public String getWideScreen() {
		return this.wideScreen;
	}

	public void setWideScreen(String wideScreen) {
		this.wideScreen = wideScreen;
	}

	public List<OverviewLaptop> getOverviewLaptops() {
		return this.overviewLaptops;
	}

	public void setOverviewLaptops(List<OverviewLaptop> overviewLaptops) {
		this.overviewLaptops = overviewLaptops;
	}

	public OverviewLaptop addOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().add(overviewLaptop);
		overviewLaptop.setScreen(this);

		return overviewLaptop;
	}

	public OverviewLaptop removeOverviewLaptop(OverviewLaptop overviewLaptop) {
		getOverviewLaptops().remove(overviewLaptop);
		overviewLaptop.setScreen(null);

		return overviewLaptop;
	}

	public List<OverviewPhone> getOverviewPhones() {
		return this.overviewPhones;
	}

	public void setOverviewPhones(List<OverviewPhone> overviewPhones) {
		this.overviewPhones = overviewPhones;
	}

	public OverviewPhone addOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().add(overviewPhone);
		overviewPhone.setScreen(this);

		return overviewPhone;
	}

	public OverviewPhone removeOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().remove(overviewPhone);
		overviewPhone.setScreen(null);

		return overviewPhone;
	}

}