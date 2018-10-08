package com.xulihuazj.mgsubtest.repository.user;

import com.mongodb.WriteResult;
import com.xulihuazj.mgsubtest.repository.BaseRepositoryImpl;
import com.xulihuazj.mgsubtest.repository.room.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import com.xulihuazj.mgsubtest.data.User;


@Repository
public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }


//    @Override
//    public void saveUser(User user) {
//        mongoTemplate.save(user);
//    }

    @Override
    public User findUserByUserName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }

    @Override
    public int updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getUserId()));
        Update update = new Update().set("userName", user.getUserName()).set("userPhone", user.getUserPhone());
        // 更新查询返回结果集的第一条
        WriteResult result = mongoTemplate.updateFirst(query, update, User.class);
        // 更新查询返回的结果集的所有
//        mongoTemplate.updateMulti(query, update, User.class);
        return null != result ? result.getN() : 0;
    }

    @Override
    public void deleteUserById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, User.class);
    }

}
