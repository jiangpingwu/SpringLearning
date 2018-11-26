package com.alan.demo;

/**
 * 推送对象(1.所有用户 2.关注用户 3.城市用户 4.特定用户)
 *
 * @Author panjianping
 * @Email ipanjianping@qq.com
 * @Date 2018/9/20
 */
public enum PushObjectEnum {
    /**
     * 推送对象
     */
    AllUser(1, "所有用户"),
    StarUser(2, "关注用户"),
    CityUser(3, "城市用户"),
    SpecialUser(4, "特定用户"),
    CustomUser(5, "自定义用户"),
    ;

    /**
     * 编码值
     */
    private Integer value;

    /**
     * 编码描述
     */
    private String desc;

    PushObjectEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer value() {
        return value;
    }

    public String desc() {
        return desc;
    }

    /**
     * 根据字符串值获取格式类型
     *
     * @param value
     * @return
     */
    public static PushObjectEnum toEnum(Integer value) {
        if (value == null) {
            return null;
        }

        for (PushObjectEnum type : PushObjectEnum.values()) {
            if (type.value() == value.intValue()) {
                return type;
            }
        }

        return null;
    }
}
