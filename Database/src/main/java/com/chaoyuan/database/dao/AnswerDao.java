package com.chaoyuan.database.dao;

import com.chaoyuan.database.mapper.AnswerMapper;
import com.chaoyuan.database.type.AnswerDB;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by yc on 2016/7/24.
 */
public abstract class AnswerDao extends BaseDao<AnswerDB> {

    @Required
    public void setMapper(AnswerMapper mapper) {
        this.mapper = mapper;
    }

    public AnswerMapper getMapper() { return (AnswerMapper)this.mapper; }
}
