package com.lemonpi.web.common.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 通用Dao接口
 *
 * @param <T>
 */
public interface BaseDao<T> {
	/** 根据ID加载实体 */
	T get(Class<T> entityClazz, Serializable id);
	/** 保存实体 */
	Serializable save(T entity);
	/** 查询所有实体 */
	List<T> list(Class<T> entityClazz);
}
