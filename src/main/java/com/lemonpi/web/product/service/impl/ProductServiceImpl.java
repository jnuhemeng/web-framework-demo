package com.lemonpi.web.product.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemonpi.web.product.dao.ProductDao;
import com.lemonpi.web.product.domain.Product;
import com.lemonpi.web.product.service.ProductService;

/**
 * 商品service接口的实现
 *
 */
@Service(value="productServiceImpl")
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return productDao.list(Product.class);
	}

}
