package com.contentstack.webapp;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


	}

	@GetMapping("/about")
	public String about(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

		String aboutUs = getAboutUs();
		if (aboutUs == null) {
			model.addAttribute("about", "Could not fetch AboutUs..");
		} else {
			model.addAttribute("about", aboutUs);
		}
		return "about";
	}

	@GetMapping("/contact")
	public String contact(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

		String contactUs = getContactUs();
		if (contactUs == null) {
			model.addAttribute("contact", "Could not fetch contactUs..");
		} else {
			model.addAttribute("contact", contactUs);
		}
		return "contact";
	}

	@GetMapping("/")
	public String home(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

		ArrayList<NewsModel> listOfHeadlines = getNewsHeadlines();
		if (listOfHeadlines == null || listOfHeadlines.size() == 0) {
			model.addAttribute("headlines", "Could not fetch Headlines..");
		} else {
			model.addAttribute("headlines", listOfHeadlines);
		}
		return "headline";
	}

	@GetMapping("/headline")
	public String headline(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

		ArrayList<NewsModel> listOfHeadlines = getNewsHeadlines();
		if (listOfHeadlines == null || listOfHeadlines.size() == 0) {
			model.addAttribute("headlines", "Could not fetch Headlines..");
		} else {
			model.addAttribute("headlines", listOfHeadlines);
		}
		return "headline";
	}

	@GetMapping("/products")
	public String allProducts(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

		ArrayList<NewsModel> listOfProducts = getAllProducts();
		if (listOfProducts == null || listOfProducts.size() == 0) {
			model.addAttribute("products", "Could not fetch Products..");
		} else {
			model.addAttribute("products", listOfProducts);
		}
		System.out.println("products: "+listOfProducts);
		return "products";
	}

	private ArrayList<NewsModel> getNewsHeadlines() {

		try {
			ArrayList<NewsModel> newsHeadlines = new ArrayList<>();
			NewsModel m1 = new NewsModel();
			m1.setDescription("dit is een tekst");
			m1.setTitle("dit is de titel van de tekst");
			m1.setImage("http://localhost:8080/images/Hond1.jpg");
			newsHeadlines.add(m1);
			return newsHeadlines;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return null;
	}

	private ArrayList<NewsModel> getAllProducts() {

		try {
			ArrayList<NewsModel> allProducts = new ArrayList<>();
			NewsModel m1 = new NewsModel();
			m1.setDescription("dit is het eerste product");
			m1.setTitle("een eenmalige begeleiding");
			m1.setImage("http://localhost:8080/images/snapshot.png");
			allProducts.add(m1);
			NewsModel m2 = new NewsModel();
			m2.setDescription("dit is het tweede product");
			m2.setTitle("10 beurten begeleiding");
			m2.setImage("http://localhost:8080/images/hond3.jpg");
			allProducts.add(m2);
			return allProducts;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	private String getAboutUs() {

		try {
			final String[] ABOUT_US = {"wie ben ik wat doe ik?"};
		return ABOUT_US[0];
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	private String getContactUs() {

		try {
			final String[] contact = {"Dit is mijn naam <BR> Dit is mijn straat <BR> dit is mijn woonplaats <BR> dit is mijn email adres"};
			return contact[0];
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
