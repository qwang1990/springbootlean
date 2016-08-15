package com.wang.business.controllers;

import com.wang.business.entities.Product;
import com.wang.business.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by wangqi on 16/8/14.
 */
@Controller
public class ProductionController {
    @RequestMapping("/product/list")
    private String process(Map<String,Object> model) {
        final ProductService productService = new ProductService();
        final List<Product> allProducts = productService.findAll();
        model.put("prods",allProducts);
        return "/product/list";
    }

    @RequestMapping("/product/comments")
    private String comment(@RequestParam("prodId")Integer prodId,Map<String,Object> model) {

        final ProductService productService = new ProductService();
        final Product product = productService.findById(prodId);
        model.put("prod",product);
        return "/product/comments";
    }
}
