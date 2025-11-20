package com.yupi.usercenter.mapper;

import com.yupi.usercenter.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ASUS
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2025-11-14 17:09:58
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




