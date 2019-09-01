package cn.zsq.service;

import cn.zsq.model.Users;

import java.util.List;

public interface UsersService {
      String registerUsers(Users users);
      Users loginUsers(Users users);
      Users getUphoneExistServie(String uPhone);
      boolean getUserByUphone(String uPhone);
}
