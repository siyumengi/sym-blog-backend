package com.sym.bolgbackend.model.dto.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 思与梦
 * @date 2023/8/27
 */
@Data
public class UserRegister implements Serializable {


    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;


    /**
     * 检查密码
     */
    private String checkPassword;


    private static final long serialVersionUID = 1L;
}
