package com.xulihuazj.mgsubtest;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBJDBC {

    public static void main(String[] args) {

        try {
            // 连接MongoDB服务
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            // 连接MongoDB数据库
            MongoDatabase database = mongoClient.getDatabase("test_dev1");
            System.out.println(database.getName());
            System.out.println("连接成功！");
        } catch (Exception ex) {
            System.out.println(ex.getClass().getName() + ":" + ex.getMessage());
        }
    }

}
