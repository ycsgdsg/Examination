package com.chaoyuan.controller.service.impl;

import com.chaoyuan.controller.service.ParticipantService;
import com.chaoyuan.database.type.ParticipantDB;

import java.util.List;

/**
 * Created by chaoyuan on 08/09/2016.
 */
public class ParticipantServiceImpl extends ParticipantService {

    @Override
    public List<ParticipantDB> getByIDNumber(ParticipantDB participant) {
        return getDao().getByIDNumber(participant);
    }
}
