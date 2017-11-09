package com.chwl.selectcoupondemo;

import java.io.Serializable;

/**
 * Created by 小智
 * on 2017/11/9
 * 描述：
 */

public class TestBean implements Serializable {

    private String name;
    private boolean isSelected;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
