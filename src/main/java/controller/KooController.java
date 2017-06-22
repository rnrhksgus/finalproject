package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.TestTravelList;
import service.KooService;

@Controller
public class KooController {
	private KooService service;
	private String path;

	public KooController() {

	}

	public void setService(KooService service) {
		this.service = service;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	@RequestMapping("/travel_area.do")
	public String form() {
		return "travel_area";
	}
	
	@RequestMapping(value = "/searchOpen.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String searchProcess(String search) throws MalformedURLException, IOException {
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchKeyword?ServiceKey="
				 + "42deh6iG0fh7xEqYM%2BFr9xm3CpDfXnbzgpNPt2ZvxfA6YKhiVPmREfyLlZJtxLk0G9GPbRIFxKNIVcTvj71frg%3D%3D&keyword="
				 + URLEncoder.encode(search, "UTF-8") + "&MobileOS=ETC&MobileApp=AppTesting&_type=json";
		HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

		String input = null;
		String total = "";
		while ((input = reader.readLine()) != null) {
			total += input;
		}
		return total;
	}
	

}// end class
