package com.chaoyuan.database.mapper;

import com.chaoyuan.database.type.ParticipantDB;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chaoyuan on 02/23/2016.
 */
public interface ParticipantMapper extends BaseMapper<ParticipantDB> {
    public List<ParticipantDB> getByIDNumber(@Param("entity") ParticipantDB participant);
}
