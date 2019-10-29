package com.gengrui.myBatisPlusDemo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gengrui.myBatisPlusDemo.entity.User;
import com.gengrui.myBatisPlusDemo.mapper.UserMapper;
import com.gengrui.myBatisPlusDemo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description: 测试类
 *
 * @ClassName: UserTest
 * @Author: GengRui
 * @Date: 2019/8/5 16:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void testSelect() {
        System.out.println("------ selectList method test ------");
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(4, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testList() {
        System.out.println("------ list method test ------");
        List<User> userList = userService.list();
//        Assert.assertEquals(4, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testPage() {
        System.out.println("------ page method test ------");
//        IPage<User> userIPage = userService.selectUserPage();
        IPage<User> userIPage = userService.page(new Page<User>().addOrder(new OrderItem().setColumn("age").setAsc(false)), null);
        userIPage.getRecords().forEach(System.out::println);
    }

    @Test
    public void testVersion() {
        Long id = 1L;
        int version = 2;

        User user = new User();
        user.setId(id);
        user.setVersion(version);
        user.setAge(16);

        if (userService.updateById(user)) {
            System.out.println("Update successfully");
        } else {
            System.out.println("Update failed due to modified by others");
        }
    }
}