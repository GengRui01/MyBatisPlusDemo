package com.gengrui.myBatisPlusDemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gengrui.myBatisPlusDemo.entity.User;

/**
 * Description:
 *
 * @InterfaceName: UserService
 * @Author: GengRui
 * @Date: 2019/8/12 10:01
 */
public interface UserService extends IService<User> {
    IPage<User> selectUserPage();
}
