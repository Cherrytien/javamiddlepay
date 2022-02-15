package com.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

@Data
@Accessors(chain = true)
public class R {

//    private Integer code; //响应码
    private Integer status; //响应码
//    private String message; //响应消息
    private String msg; //响应消息
    private Map<String, Object> data = new HashMap<>();

    public static R ok(){
        R r = new R();
        r.setStatus(0);
        r.setMsg("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setStatus(-1);
        r.setMsg("失败");
        return r;
    }

    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

}
