package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the overview_phone database table.
 * 
 */
@Entity
@Table(name="overview_phone")
@NamedQuery(name="OverviewPhone.findAll", query="SELECT o FROM OverviewPhone o")
public class OverviewPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String advanced;

	private String camera;

	private String chipset;

	private String flash;

	private String gpu;

	@Column(name="MICRO_SD")
	private String microSd;

	private String operating;

	@Column(name="OTHER_INFORMATION")
	private String otherInformation;

	private String ram;

	@Column(name="RESOLUTION_BEHINDCAMERA")
	private String resolutionBehindcamera;

	@Column(name="RESOLUTION_FRONTCAMERA")
	private String resolutionFrontcamera;

	@Column(name="RESOLUTION_SCREEN")
	private String resolutionScreen;

	private String rom;

	@Column(name="SCREEN_TECHNOLOGY")
	private String screenTechnology;

	@Column(name="SPEED_CPU")
	private String speedCpu;

	@Column(name="TOUCH_TECHNOLOGY")
	private String touchTechnology;

	@Column(name="VIDEO_CALL")
	private String videoCall;

	@Column(name="WIDE_SCREEN")
	private String wideScreen;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	public OverviewPhone() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

	public String getChipset() {
		return this.chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getFlash() {
		return this.flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
	}

	public String getGpu() {
		return this.gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getMicroSd() {
		return this.microSd;
	}

	public void setMicroSd(String microSd) {
		this.microSd = microSd;
	}

	public String getOperating() {
		return this.operating;
	}

	public void setOperating(String operating) {
		this.operating = operating;
	}

	public String getOtherInformation() {
		return this.otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getResolutionBehindcamera() {
		return this.resolutionBehindcamera;
	}

	public void setResolutionBehindcamera(String resolutionBehindcamera) {
		this.resolutionBehindcamera = resolutionBehindcamera;
	}

	public String getResolutionFrontcamera() {
		return this.resolutionFrontcamera;
	}

	public void setResolutionFrontcamera(String resolutionFrontcamera) {
		this.resolutionFrontcamera = resolutionFrontcamera;
	}

	public String getResolutionScreen() {
		return this.resolutionScreen;
	}

	public void setResolutionScreen(String resolutionScreen) {
		this.resolutionScreen = resolutionScreen;
	}

	public String getRom() {
		return this.rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getScreenTechnology() {
		return this.screenTechnology;
	}

	public void setScreenTechnology(String screenTechnology) {
		this.screenTechnology = screenTechnology;
	}

	public String getSpeedCpu() {
		return this.speedCpu;
	}

	public void setSpeedCpu(String speedCpu) {
		this.speedCpu = speedCpu;
	}

	public String getTouchTechnology() {
		return this.touchTechnology;
	}

	public void setTouchTechnology(String touchTechnology) {
		this.touchTechnology = touchTechnology;
	}

	public String getVideoCall() {
		return this.videoCall;
	}

	public void setVideoCall(String videoCall) {
		this.videoCall = videoCall;
	}

	public String getWideScreen() {
		return this.wideScreen;
	}

	public void setWideScreen(String wideScreen) {
		this.wideScreen = wideScreen;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

//	@Override
//	public String toString() {
//		return "OverviewPhone [id=" + id + ", advanced=" + advanced + ", camera=" + camera + ", chipset=" + chipset
//				+ ", flash=" + flash + ", gpu=" + gpu + ", microSd=" + microSd + ", operating=" + operating
//				+ ", otherInformation=" + otherInformation + ", ram=" + ram + ", resolutionBehindcamera="
//				+ resolutionBehindcamera + ", resolutionFrontcamera=" + resolutionFrontcamera + ", resolutionScreen="
//				+ resolutionScreen + ", rom=" + rom + ", screenTechnology=" + screenTechnology + ", speedCpu="
//				+ speedCpu + ", touchTechnology=" + touchTechnology + ", videoCall=" + videoCall + ", wideScreen="
//				+ wideScreen + ", product=" + product + "]";
//	}

}