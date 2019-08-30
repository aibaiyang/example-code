package com.aibaiyang.idemo.enums;

/**
 * 策略模式枚举类型
 */
public enum StrategyEnum {

    ONE(1,"正常收费"),
    TWO(2,"打8折收费"),
    THREE(3,"满300返100收费");

    private Integer type;

    private String description;

    StrategyEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
