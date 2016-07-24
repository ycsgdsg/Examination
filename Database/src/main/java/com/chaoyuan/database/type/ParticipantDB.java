package com.chaoyuan.database.type;

/**
 * Created by chaoyuan on 02/24/2016.
 */
public class ParticipantDB extends BaseDB {
    private String IDNumber;
    private String name;
    private long questionId;
    private long answerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswer(long answerId) {
        this.answerId = answerId;
    }
}
