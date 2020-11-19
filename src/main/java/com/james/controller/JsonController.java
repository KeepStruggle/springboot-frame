package com.james.controller;

import com.james.bean.User;
import com.james.util.ResultUtil;
import com.james.view.ResultEnum;
import com.james.view.ResultView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.8
 * @ClassName JsonController
 * @Description SpringBoot默认的是json数据解析技术框架是jackson，包含在spring-boot-starter-web依赖中
 * @Author James
 * @date 2020/10/25 17:34
 */
@RestController
@RequestMapping("/json")
@Api(value = "Swagger2 在线接口文档")
public class JsonController {

    /**
     * @Description: 返回一个User对象
     * @Param:
     * @return:
     * @Author: James
     * @Date: 2020/10/25 18:02
     */
    @RequestMapping("/user/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public ResultView<User> getUser(@PathVariable @ApiParam(value = "用户唯一标识") Integer id){

        User user = new User( 1,"郑弘湛","123456");
        ResultEnum resultEnum = ResultEnum.SUCCESS;
        return ResultUtil.getInstanceViewOfData(ResultEnum.SUCCESS, user);

    }

    /**
     * @Description: 返回一个User对象集合
     * @Param:
     * @return:
     * @Author: James
     * @Date: 2020/10/25 18:02
     */
    @RequestMapping("/userList")
    @ApiOperation(value = "返回一个User对象集合")
    public ResultView<List> getUserList(){
        List<User> userList = new ArrayList<>();
        User user1 = new User(1,"郑弘湛","123456");
        User user2 = new User(2,"郑弘湛","123456");
        userList.add(user1);
        userList.add(user2);
        return ResultUtil.getInstanceViewOfData(ResultEnum.SUCCESS, userList);
    }

    /**
     * @Description: 返回一个map集合
     * @Param: 
     * @return: 
     * @Author: James
     * @Date: 2020/10/25 18:16
     */
    @RequestMapping("/userMap")
    @ApiOperation(value = "返回一个map集合")
    public ResultView<Map> getMap(){
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1,"郑弘湛","123456");
        map.put("作者信息", user);
        map.put("博客地址", "https://message.bilibili.com/#/whisper/mid37090048");
        map.put("粉丝数量", null);
        return ResultUtil.getInstanceViewOfData(ResultEnum.SUCCESS, map);

    }


}
