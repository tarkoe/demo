package com.demo.hyx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.hyx.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * ClassName: UserMapper
 * Package: com.demo.hyx.mapper
 * Description:
 *
 * @Author: hyx
 * @Create: 2023/3/4 13:07
 * @Version: v1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
