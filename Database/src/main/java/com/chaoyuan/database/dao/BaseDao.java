package com.chaoyuan.database.dao;

import com.chaoyuan.database.mapper.BaseMapper;
import com.chaoyuan.database.type.BaseDB;

/**
 * Created by yc on 2016/7/23.
 */
public abstract class BaseDao<T extends BaseDB> {

    protected BaseMapper<T> mapper;

    public T get(long id) {
        return mapper.get(id);
    }
    public long save(T t) {
        mapper.save(t);
        return t.getId();
    }
    public void update(T t) {
        mapper.update(t);
    }
    public void delete(long id) {
        mapper.delete(id);
    }
}
