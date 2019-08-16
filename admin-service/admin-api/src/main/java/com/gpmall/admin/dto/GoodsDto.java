package com.gpmall.admin.dto;


import lombok.Data;

import java.io.Serializable;

/**
 *  商品类
 */
@Data
public class GoodsDto implements Serializable {

    private static final long serialVersionUID = -7540946801200458995L;
    private String goodsID;//商品ID
    private String status;//商品状态
}
