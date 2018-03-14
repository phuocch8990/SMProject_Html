package poly.edu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the overview_laptop database table.
 * 
 */
@Entity
@Table(name="overview_laptop")
@NamedQuery(name="OverviewLaptop.findAll", query="SELECT o FROM OverviewLaptop o")
public class OverviewLaptop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="BUS_CPU")
	private String busCpu;

	@Column(name="BUS_RAM")
	private String busRam;

	@Column(name="CONG_GIAO_TIEP")
	private String congGiaoTiep;

	@Column(name="GRAPHICS_CARD")
	private String graphicsCard;

	@Column(name="HARD_DRIVE")
	private String hardDrive;

	private String ram;

	@Column(name="READ_MICROSD")
	private String readMicrosd;

	private String resolution;

	@Column(name="SCREEN_TECHNOLOGY")
	private String screenTechnology;

	@Column(name="SPEED_CPU")
	private String speedCpu;

	@Column(name="TECHNOLOGY_CPU")
	private String technologyCpu;

	@Column(name="TECHNOLOGY_SOUND")
	private String technologySound;

	@Column(name="TOUCH_TECHNOLOGY")
	private String touchTechnology;

	@Column(name="TYPE_CPU")
	private String typeCpu;

	@Column(name="TYPE_RAM")
	private String typeRam;

	@Column(name="WIDE_SCREEN")
	private String wideScreen;

	@Column(name="WIRELESS_CONNECTIVITY")
	private String wirelessConnectivity;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	public OverviewLaptop() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusCpu() {
		return this.busCpu;
	}

	public void setBusCpu(String busCpu) {
		this.busCpu = busCpu;
	}

	public String getBusRam() {
		return this.busRam;
	}

	public void setBusRam(String busRam) {
		this.busRam = busRam;
	}

	public String getCongGiaoTiep() {
		return this.congGiaoTiep;
	}

	public void setCongGiaoTiep(String congGiaoTiep) {
		this.congGiaoTiep = congGiaoTiep;
	}

	public String getGraphicsCard() {
		return this.graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
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

	public String getReadMicrosd() {
		return this.readMicrosd;
	}

	public void setReadMicrosd(String readMicrosd) {
		this.readMicrosd = readMicrosd;
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

	public String getTechnologySound() {
		return this.technologySound;
	}

	public void setTechnologySound(String technologySound) {
		this.technologySound = technologySound;
	}

	public String getTouchTechnology() {
		return this.touchTechnology;
	}

	public void setTouchTechnology(String touchTechnology) {
		this.touchTechnology = touchTechnology;
	}

	public String getTypeCpu() {
		return this.typeCpu;
	}

	public void setTypeCpu(String typeCpu) {
		this.typeCpu = typeCpu;
	}

	public String getTypeRam() {
		return this.typeRam;
	}

	public void setTypeRam(String typeRam) {
		this.typeRam = typeRam;
	}

	public String getWideScreen() {
		return this.wideScreen;
	}

	public void setWideScreen(String wideScreen) {
		this.wideScreen = wideScreen;
	}

	public String getWirelessConnectivity() {
		return this.wirelessConnectivity;
	}

	public void setWirelessConnectivity(String wirelessConnectivity) {
		this.wirelessConnectivity = wirelessConnectivity;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}