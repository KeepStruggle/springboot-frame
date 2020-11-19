package com.james.util;

import com.james.view.ResultEnum;
import com.james.view.ResultView;

/**
 * @version 1.8
 * @ClassName ResultUtil
 * @Description 返回前端数据的封装工具类
 * @Author James
 * @date 2020/10/25 19:37
 */
public class ResultUtil {

    /**
     * 若没有返回数据，则人为指定返回状态码和提示信息
     * @param resultEnum
     * @return
     */
    public static ResultView getInstanceViewOfNotData(ResultEnum resultEnum){
        return new ResultView(resultEnum.getCode(), resultEnum.getMessage());
    }

    /**
     * 有返回数据，并且人为指定返回状态码以及信息
     * @param resultEnum
     * @param obj
     * @return
     */
    public static ResultView getInstanceViewOfData(ResultEnum resultEnum, Object obj){
        ResultView resultView = new ResultView(resultEnum.getCode(), resultEnum.getMessage());
        resultView.setData(obj);
        return resultView;
    }
}
