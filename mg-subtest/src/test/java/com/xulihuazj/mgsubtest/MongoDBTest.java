package com.xulihuazj.mgsubtest;

import com.xulihuazj.mgsubtest.data.User;
import com.xulihuazj.mgsubtest.repository.user.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDBTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User();
        user.setUserId(4L);
        user.setUserName("成秀秀4");
        user.setUserPhone("18456463651");
        user.setNickName("秀秀");
        user.setEmail("chenxiuxiu@52mamahome.com");
        user.setUserSex("FALE");
        user.setUserStatus("EFFECTIVE");
        user.setUserType("PROD");
        userRepository.save(user);
    }

    @Test
    public void testFindUserByUserName() {
        User user = userRepository.findUserByUserName("周家壕");
        System.out.println(user.toString());
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setUserId(3L);
        user.setUserName("周家壕");
        user.setUserPhone("13111112222");
//        userRepository.updateUser(user);
        userRepository.update(user);
    }

    @Test
    public void testDeleteUser(){
        userRepository.deleteUserById(3L);
    }
}
