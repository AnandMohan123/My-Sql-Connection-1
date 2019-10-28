package com.mySqlConn.mybatis.springbootmybatis.resource;

import com.mySqlConn.mybatis.springbootmybatis.mapper.UsersMapper;
import com.mySqlConn.mybatis.springbootmybatis.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }


    @GetMapping("/all")
    public List<Users> getAll() {
        return usersMapper.findAll();
    }

    @GetMapping("/update")
    private List<Users> update() {

        Users users = new Users();
        users.setEmployee_Name("CC");
        users.setEmployee_Salary(2333);

        usersMapper.insert(users);

        return usersMapper.findAll();
    }

    @GetMapping("/updateUsers")
    private List<Users> updateUsers() {

        Users users = new Users();
        users.setEmployee_Name("CC");
        users.setEmployee_Salary(555);

        usersMapper.update(users);
        return usersMapper.findAll();

    }

    @GetMapping("/delete")
    private List<Users> delete() {

        Users users = new Users();
        users.setEmployee_Name("CC");

        usersMapper.delete(users);
        return usersMapper.findAll();

    }
    
}
