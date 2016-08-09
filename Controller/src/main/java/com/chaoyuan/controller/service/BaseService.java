package com.chaoyuan.controller.service;

import com.chaoyuan.database.dao.BaseDao;
import com.chaoyuan.database.type.BaseDB;

/**
 * Created by chaoyuan on 08/09/2016.
 */
public abstract class BaseService<T extends BaseDB> {
    protected BaseDao<T> dao;
    public T get(long id) {
        return dao.get(id);
    }
    public void save(T t) {
        dao.save(t);
    }
    public void update(T t) {
        dao.update(t);
    }
    public void delete(long id) {
        dao.delete(id);
    }
}
