package com.chaoyuan.controller.service;

import com.chaoyuan.database.dao.ParticipantDao;
import com.chaoyuan.database.type.ParticipantDB;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * Created by chaoyuan on 08/09/2016.
 */
public abstract class ParticipantService extends BaseService<ParticipantDB> {

    @Required
    public void setDao(ParticipantDao dao) {
        this.dao = dao;
    }

    public ParticipantDao getDao() { return (ParticipantDao)this.dao; }

    public abstract List<ParticipantDB> getByIDNumber(ParticipantDB participant);
}
