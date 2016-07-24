package com.chaoyuan.database.dao;

import com.chaoyuan.database.mapper.ParticipantMapper;
import com.chaoyuan.database.type.ParticipantDB;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * Created by yc on 2016/1/30.
 */
public abstract class ParticipantDao extends BaseDao<ParticipantDB> {

    @Required
    public void setMapper(ParticipantMapper mapper) {
        this.mapper = mapper;
    }

    public ParticipantMapper getMapper() { return (ParticipantMapper)this.mapper; }

    abstract public List<ParticipantDB> getByIDNumber(ParticipantDB user);
}
