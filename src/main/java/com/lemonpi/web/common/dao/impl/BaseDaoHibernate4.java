package com.lemonpi.web.common.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lemonpi.web.common.dao.BaseDao;

/**
 * 通用Dao的Hibernate4实现
 *
 * @param <T>
 */
public class BaseDaoHibernate4<T> implements BaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
	 * 根据ID加载实体
	 */
	@SuppressWarnings("unchecked")
	public T get(Class<T> entityClazz, Serializable id) {
		// TODO Auto-generated method stub
		return (T)getSessionFactory().getCurrentSession().get(entityClazz, id);
	}
	
	/**
	 * 保存实体
	 */
	public Serializable save(T entity) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().save(entity);
	}
	
	/**
	 * 查询所有实体
	 */
	@Override
	public List<T> list(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<T> list = (List<T>)
			getSessionFactory().getCurrentSession().createCriteria(entityClazz)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
	                .list();
	    return list;
	}
}
