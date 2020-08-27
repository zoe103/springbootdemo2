package com.msr.springgootdemo2;

import com.msr.springgootdemo2.domain.User;
import com.msr.springgootdemo2.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.springgootdemo2
 * @date 2020/8/26 16:24
 * @Copyright © 株式会社多言语系统研究所
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springgootdemo2Application.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }

}
