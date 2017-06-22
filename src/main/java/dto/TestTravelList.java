package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class TestTravelList {
	private List<TestTravelDTO> travelList;
	
	public TestTravelList() {
	
	}
	
	public List<TestTravelDTO> getTravelList() {
		return travelList;
	}
	
	
	@XmlElement(name = "item")
	public void setTravelList(List<TestTravelDTO> travelList) {
		this.travelList = travelList;
	}
	
}
