package com.sym.bolgbackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 思与梦
 * @date 2023/8/28
 */
@Data
public class UserLogin implements Serializable{


    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;


    /**
     * 校验码
     */
    private String code;



    private static final long serialVersionUID = 1L;


}
