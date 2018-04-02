package kh.com.cambostore.controller;

import kh.com.cambostore.dao.ProductDao;
import kh.com.cambostore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home(Model model){
        List<Product> productsList = productDao.getProductList();
        model.addAttribute("products", productsList);
        return "home";
    }
}
