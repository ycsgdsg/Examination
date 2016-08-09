package com.chaoyuan.controller.service;

import com.chaoyuan.database.dao.AnswerDao;
import com.chaoyuan.database.type.AnswerDB;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by chaoyuan on 08/09/2016.
 */
public class AnswerService extends BaseService<AnswerDB> {
    @Required
    public void setDao(AnswerDao dao) {
        this.dao = dao;
    }

    public AnswerDao getDao() { return (AnswerDao)this.dao; }
}
