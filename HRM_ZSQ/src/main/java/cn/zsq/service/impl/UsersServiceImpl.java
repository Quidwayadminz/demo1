package cn.zsq.service.impl;

import cn.zsq.dao.UsersDao;
import cn.zsq.model.Users;
import cn.zsq.service.UsersService;
import cn.zsq.util.CodeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;


    @Override
    public String registerUsers(Users users) {
        if(users == null) return null;
        List<Users> list = usersDao.getUsers();
        String ph = users.getuPhone().substring(users.getuPhone().length()-2);
        //生成账号并去重
        String account;
        while (true){
            boolean sign = true;
            account = CodeUtil.getAccount(ph);
            for (Users users1 : list) {
                if(users1.getuAccount() == account)sign = false;
            }
            if(sign)break;
        }
        users.setuAccount(account);
        users.setuType(1);
        if(usersDao.addUser(users)) return account;
        return null;
    }

    @Override
    public Users loginUsers(Users users) {
        if(users.getuPass()==null||users.getuAccount()==null)return null;
        Users users1 = usersDao.getUsersPassAndUAccount(users);
        if(users1!=null) return users1;
        return  null;
    }

    @Override
    public Users getUphoneExistServie(String uPhone) {
        if(uPhone==null)return null;
        Users users = new Users();
        users.setuPhone(uPhone);
        return  usersDao.getUserByAll(users).get(0).getuPhone().equals(uPhone)?new Users():null;
    }

    @Override
    public boolean getUserByUphone(String uPhone) {
        if(uPhone==null)return true;
        Users users = new Users();
        users.setuPhone(uPhone);
        if(usersDao.getUserByUphone(users)!=null){
            return true;
        }
        return false;
    }
}
