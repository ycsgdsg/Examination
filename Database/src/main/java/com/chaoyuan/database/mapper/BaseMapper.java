package com.chaoyuan.database.mapper;

import com.chaoyuan.database.type.BaseDB;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yc on 2016/7/23.
 */
public interface BaseMapper<T extends BaseDB> {
    public T get(@Param("id")long id);
    public void save(@Param("entity") T t);
    public void update(@Param("entity") T t);
    public void delete(@Param("id") long id);
}
