package com.james.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.8
 * @ClassName User
 * @Description TODO
 * @Author James
 * @date 2020/10/25 17:35
 */
@Data
@ApiModel(value = "用户实体类")
public class User implements Serializable {

    @ApiModelProperty(value = "用户唯一标识")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户密码")
    private String password;

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
