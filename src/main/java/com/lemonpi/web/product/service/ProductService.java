package com.lemonpi.web.product.service;

import java.util.List;

import com.lemonpi.web.product.domain.Product;

/**
 * 商品service接口
 *
 */
public interface ProductService {
	/** 显示所有商品 */
	List<Product> list();

}
