package dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class TestTravelDTO {
	private String addr1;
	private String addr2;
	private String areacode;
	private String booktour;
	private String cat1;
	private String cat2;
	private String cat3;
	private String contentid;
	private String contenttypeid;
	private String createdtime;
	private String firstimage;
	private String firstimage2;
	private String mapx;
	private String mapy;
	private String mlevel;
	private String modifiedtime;
	private String readcount;
	private String sigungucode;
	private String tel;
	private String title;

	public TestTravelDTO() {

	}

	public String getAddr1() {
		return addr1;
	}
	
	@XmlElement(name = "addr1")
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}
	
	@XmlElement(name = "addr2")
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAreacode() {
		return areacode;
	}

	@XmlElement(name = "areacode")
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getBooktour() {
		return booktour;
	}

	@XmlElement(name = "booktour")
	public void setBooktour(String booktour) {
		this.booktour = booktour;
	}

	public String getCat1() {
		return cat1;
	}

	@XmlElement(name = "cat1")
	public void setCat1(String cat1) {
		this.cat1 = cat1;
	}

	public String getCat2() {
		return cat2;
	}

	@XmlElement(name = "cat2")
	public void setCat2(String cat2) {
		this.cat2 = cat2;
	}

	public String getCat3() {
		return cat3;
	}

	@XmlElement(name = "cat3")
	public void setCat3(String cat3) {
		this.cat3 = cat3;
	}

	public String getContentid() {
		return contentid;
	}

	@XmlElement(name = "contentid")
	public void setContentid(String contentid) {
		this.contentid = contentid;
	}

	public String getContenttypeid() {
		return contenttypeid;
	}

	@XmlElement(name = "contenttypeid")
	public void setContenttypeid(String contenttypeid) {
		this.contenttypeid = contenttypeid;
	}

	public String getCreatedtime() {
		return createdtime;
	}

	@XmlElement(name = "createdtime")
	public void setCreatedtime(String createdtime) {
		this.createdtime = createdtime;
	}

	public String getFirstimage() {
		return firstimage;
	}

	@XmlElement(name = "firstimage")
	public void setFirstimage(String firstimage) {
		this.firstimage = firstimage;
	}

	public String getFirstimage2() {
		return firstimage2;
	}

	@XmlElement(name = "firstimage2")
	public void setFirstimage2(String firstimage2) {
		this.firstimage2 = firstimage2;
	}

	public String getMapx() {
		return mapx;
	}

	@XmlElement(name = "mapx")
	public void setMapx(String mapx) {
		this.mapx = mapx;
	}

	public String getMapy() {
		return mapy;
	}

	@XmlElement(name = "mapy")
	public void setMapy(String mapy) {
		this.mapy = mapy;
	}

	public String getMlevel() {
		return mlevel;
	}

	@XmlElement(name = "mlevel")
	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}

	public String getModifiedtime() {
		return modifiedtime;
	}

	@XmlElement(name = "modifiedtime")
	public void setModifiedtime(String modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

	public String getReadcount() {
		return readcount;
	}

	@XmlElement(name = "readcount")
	public void setReadcount(String readcount) {
		this.readcount = readcount;
	}

	public String getSigungucode() {
		return sigungucode;
	}

	@XmlElement(name = "sigungucode")
	public void setSigungucode(String sigungucode) {
		this.sigungucode = sigungucode;
	}

	public String getTel() {
		return tel;
	}
	
	@XmlElement(name = "tel")
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement(name = "title")
	public void setTitle(String title) {
		this.title = title;
	}

}
