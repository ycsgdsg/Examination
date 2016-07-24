package com.chaoyuan.database.dao.impl;

import com.chaoyuan.database.dao.ParticipantDao;
import com.chaoyuan.database.mapper.ParticipantMapper;
import com.chaoyuan.database.type.ParticipantDB;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * Created by yc on 2016/7/16.
 */
public class ParticipantDaoMysqlImpl extends ParticipantDao {

    public List<ParticipantDB> getByIDNumber(ParticipantDB user) {
        return getMapper().getByIDNumber(user);
    }
}
