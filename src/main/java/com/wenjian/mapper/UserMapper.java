package com.wenjian.mapper;

import com.wenjian.entityclass.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryUserList();

}
