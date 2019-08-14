package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user where code = #{code}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "code", column = "code"),
            @Result(property = "name", column = "name")
    })
    List<User> getAll(String code);


    @Insert("INSERT INTO user(code,name) VALUES(#{code},#{name})")
    void insert(User user);

    @Update("UPDATE user SET name = #{name} WHERE id = #{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(Long id);


}
