package com.gengrui.myBatisPlusDemo.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Description:
 *
 * @EnumName: GradeEnum
 * @Author: GengRui
 * @Date: 2019/8/19 13:38
 */
public enum GradeEnum implements IEnum<Integer> {

    PRIMARY(1, "小学"),
    SECONDORY(2, "中学"),
    HIGH(3, "高中");

    private int value;
    private String code;

    GradeEnum(int value, String code) {
        this.value = value;
        this.code = code;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return code;
    }
}
