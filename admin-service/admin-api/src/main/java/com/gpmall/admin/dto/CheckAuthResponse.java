package com.gpmall.admin.dto;

import com.gpmall.commons.result.AbstractResponse;
import lombok.Data;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2019/7/22-13:12
 */
@Data
public class CheckAuthResponse extends AbstractResponse {

    private String userinfo;
}