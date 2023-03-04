package com.demo.hyx.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.hyx.mapper.UserMapper;
import com.demo.hyx.pojo.User;
import com.demo.hyx.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.demo.hyx.service.serviceImpl
 * Description:
 *
 * @Author: hyx
 * @Create: 2023/3/4 12:55
 * @Version: v1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
