package com.chaoyuan.database.type;

/**
 * Created by yc on 2016/7/17.
 */
public class QuestionDB extends BaseDB {
    private String description;
    private String answerTemplate;
    private String method;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswerTemplate() {
        return answerTemplate;
    }

    public void setAnswerTemplate(String answerTemplate) {
        this.answerTemplate = answerTemplate;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
