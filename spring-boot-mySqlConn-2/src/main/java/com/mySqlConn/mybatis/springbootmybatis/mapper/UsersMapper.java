package com.mySqlConn.mybatis.springbootmybatis.mapper;

import com.mySqlConn.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> findAll();

    @Insert("insert into users(Employee_Age, Employee_Name, Employee_Salary) values(#{Employee_Age},#{Employee_Name},#{Employee_Salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "seq_no",
            before = false, resultType = Integer.class)
    void insert(Users users);

    @Update("update users set Employee_Salary=#{Employee_Salary} where Employee_Name=#{Employee_Name}")
    void update(Users users);

    @Delete("delete from users where Employee_Name=#{Employee_Name}")
    void delete(Users users);
}
