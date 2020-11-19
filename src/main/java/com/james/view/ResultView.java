package com.james.view;

import lombok.Data;

/**
 * @version 1.8
 * @ClassName ResultView
 * @Description 封装返回前端的数据
 * @Author James
 * @date 2020/10/25 18:57
 */
@Data
public class ResultView<T> {
    private String code;
    private String message;
    private T data;

    /**
     * @Description: 若没有数据返回，默认状态码为0，提示信息为：操作成功
     * @Param: 
     * @return: 
     * @Author: James
     * @Date: 2020/10/25 19:03
     */
    public ResultView() {
        code = "0";
        message = "操作成功";
    }

    /**
     * @Description: 若没有数据返回，可以人为指定状态码和提示信息
     * @Param: 
     * @return: 
     * @Author: James
     * @Date: 2020/10/25 19:07
     */
    public ResultView(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @Description: 有数据返回时，状态码为0，默认提示信息为：操作成功
     * @Param:
     * @return:
     * @Author: James
     * @Date: 2020/10/25 19:14
     */
    public ResultView(T data) {
        this.code = "0";
        this.message = "操作成功";
        this.data = data;
    }

    /**
     * @Description: 有数据返回时，可以人为指定状态码和提示信息
     * @Param: 
     * @return: 
     * @Author: James
     * @Date: 2020/10/25 19:15
     */
    public ResultView(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
