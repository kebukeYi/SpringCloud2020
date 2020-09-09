package com.yy.cloud.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : mmy
 * @Creat Time : 2020/8/29  下午 7:32
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer status;
    private String Message;
    private T data;


    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }


}
