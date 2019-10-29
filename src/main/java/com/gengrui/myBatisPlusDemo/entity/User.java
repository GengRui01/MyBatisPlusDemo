package com.gengrui.myBatisPlusDemo.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.gengrui.myBatisPlusDemo.enums.GradeEnum;
import lombok.Data;

/**
 * Description:
 *
 * @ClassName: User
 * @Author: GengRui
 * @Date: 2019/8/5 16:51
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private GradeEnum grade;
    private String email;
    @TableLogic
    private Integer deleted;
    @Version
    private int version;
}
