package com.chaoyuan.database.dao;

import com.chaoyuan.database.mapper.QuestionMapper;
import com.chaoyuan.database.type.QuestionDB;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by yc on 2016/7/23.
 */
public abstract class QuestionDao extends BaseDao<QuestionDB> {

    @Required
    public void setMapper(QuestionMapper mapper) {
        this.mapper = mapper;
    }

    public QuestionMapper getMapper() { return (QuestionMapper)this.mapper; }
}
