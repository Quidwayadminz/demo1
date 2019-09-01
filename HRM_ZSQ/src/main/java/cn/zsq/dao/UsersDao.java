package cn.zsq.dao;

import cn.zsq.model.Users;

import java.util.List;

public interface UsersDao {
     List<Users> getUsers();
     boolean addUser(Users users);
     Users getUsersPassAndUAccount(Users users);
     List<Users> getUserByAll(Users users);
     Users getUserByUphone(Users users);
}
