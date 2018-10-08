package com.xulihuazj.mgsubtest.repository.user;

import com.xulihuazj.mgsubtest.data.User;
import com.xulihuazj.mgsubtest.repository.BaseRepository;

public interface UserRepository extends BaseRepository<User> {

    /**
     * 创建对象
     *
     * @param user
     */
//    void saveUser(User user);

    /**
     * 查找对象
     *
     * @param userName
     * @return
     */
    User findUserByUserName(String userName);

    /**
     * 更新对象
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除对象
     *
     * @param id
     */
    void deleteUserById(Long id);

}
