package com.demo.hyx.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Package: com.demo.hyx.pojo
 * Description:
 *
 * @Author: hyx
 * @Create: 2023/3/4 13:07
 * @Version: v1.0
 */
@Data // set get toString
@AllArgsConstructor // 全参构造器
@NoArgsConstructor // 无参构造器
@TableName("t_user") // 数据库表映射
public class User {
    @TableId(value = "id", type = IdType.AUTO) // 主键映射 id自增
    private Integer id;
    @TableField("uid")
    private String uid;
    @TableField("pwd")
    private String pwd;
    @TableLogic
    private int isDeleted;
}
