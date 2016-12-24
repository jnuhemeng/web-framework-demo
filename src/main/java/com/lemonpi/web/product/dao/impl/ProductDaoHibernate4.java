package com.lemonpi.web.product.dao.impl;

import org.springframework.stereotype.Repository;

import com.lemonpi.web.common.dao.impl.BaseDaoHibernate4;
import com.lemonpi.web.product.dao.ProductDao;
import com.lemonpi.web.product.domain.Product;
/**
 * 商品Dao接口的Hibernate4实现
 *
 */
@Repository(value="productDaoHibernate4")
public class ProductDaoHibernate4 extends BaseDaoHibernate4<Product> implements ProductDao {

}
