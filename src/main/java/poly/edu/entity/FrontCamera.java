package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the front_camera database table.
 * 
 */
@Entity
@Table(name="front_camera")
@NamedQuery(name="FrontCamera.findAll", query="SELECT f FROM FrontCamera f")
public class FrontCamera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="OTHER_INFORMATION")
	private String otherInformation;

	private String resolution;

	@Column(name="VIDEO_CALL")
	private byte videoCall;

	//bi-directional many-to-one association to OverviewPhone
	@OneToMany(mappedBy="frontCamera", fetch=FetchType.EAGER)
	private List<OverviewPhone> overviewPhones;

	public FrontCamera() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOtherInformation() {
		return this.otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public byte getVideoCall() {
		return this.videoCall;
	}

	public void setVideoCall(byte videoCall) {
		this.videoCall = videoCall;
	}

	public List<OverviewPhone> getOverviewPhones() {
		return this.overviewPhones;
	}

	public void setOverviewPhones(List<OverviewPhone> overviewPhones) {
		this.overviewPhones = overviewPhones;
	}

	public OverviewPhone addOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().add(overviewPhone);
		overviewPhone.setFrontCamera(this);

		return overviewPhone;
	}

	public OverviewPhone removeOverviewPhone(OverviewPhone overviewPhone) {
		getOverviewPhones().remove(overviewPhone);
		overviewPhone.setFrontCamera(null);

		return overviewPhone;
	}

}