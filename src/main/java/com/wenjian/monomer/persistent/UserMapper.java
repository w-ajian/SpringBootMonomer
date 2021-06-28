package com.wenjian.monomer.persistent;

import com.wenjian.monomer.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryUserList();

}
