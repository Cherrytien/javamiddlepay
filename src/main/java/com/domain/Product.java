package com.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_product")
public class Product extends com.domain.BaseEntity {

    private String title; //商品名称

    private Integer price; //价格（分）
}
