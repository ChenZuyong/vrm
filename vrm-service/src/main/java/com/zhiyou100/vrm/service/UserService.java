package com.zhiyou100.vrm.service;

import java.util.List;

import com.zhiyou100.vrm.pojo.User;

public interface UserService {
    void  insertUser(User user);
   List<User> findUserByMail(User user);
   List<User> findUserByMailAndPwd(User user);
   void  insertRandomByMail(User user);
   List<User> findUserByMailAndRand(User user);
   void updatePwd(User user);
    void insertProFile(User user);
}
