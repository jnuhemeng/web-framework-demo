package com.lemonpi.web.product.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lemonpi.web.product.domain.Product;
import com.lemonpi.web.product.service.ProductService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品Action
 *
 */
@Controller("listProductAction")
public class ListProductAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProductService productService; 
	
	/** 显示所有商品 */
	public String list() {
		List<Product> productList = productService.list();
		ActionContext.getContext().getValueStack().set("productList", productList);
        
        return "list";
    }
}




