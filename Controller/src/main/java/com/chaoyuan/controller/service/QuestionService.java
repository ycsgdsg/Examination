package com.chaoyuan.controller.service;

import com.chaoyuan.database.dao.QuestionDao;
import com.chaoyuan.database.type.QuestionDB;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by chaoyuan on 08/09/2016.
 */
public class QuestionService extends BaseService<QuestionDB> {
    @Required
    public void setDao(QuestionDao dao) {
        this.dao = dao;
    }

    public QuestionDao getDao() { return (QuestionDao)this.dao; }
}
