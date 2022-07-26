package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.service.UserService;
import com.example.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author linjun
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-17 18:29:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




