package com.chaoyuan.database.type;

/**
 * Created by yc on 2016/7/24.
 */
public abstract class BaseDB {

    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
