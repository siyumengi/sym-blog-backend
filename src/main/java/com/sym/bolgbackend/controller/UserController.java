package com.sym.bolgbackend.controller;

import com.sym.bolgbackend.common.BaseResponse;
import com.sym.bolgbackend.common.ErrorCode;
import com.sym.bolgbackend.common.ResultUtils;
import com.sym.bolgbackend.exception.BusinessException;
import com.sym.bolgbackend.mapper.UserMapper;
import com.sym.bolgbackend.model.dto.user.UserLogin;
import com.sym.bolgbackend.model.dto.user.UserRegister;
import com.sym.bolgbackend.model.vo.UserVo;
import com.sym.bolgbackend.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author 思与梦
 * @date 2023/8/27
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用户注册
     *
     * @param userRegister
     * @return
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegister userRegister) {
        if (userRegister == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String userAccount = userRegister.getUserAccount();
        String userPassword = userRegister.getUserPassword();
        String checkPassword = userRegister.getCheckPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword, checkPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long res = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(res);
    }

    /**
     * 用户登录
     * @param userLogin
     * @return
     */
    @PostMapping("/login")
    public BaseResponse<UserVo> userLogin(@RequestBody UserLogin userLogin , HttpServletRequest request) {

        if (userLogin == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String userAccount = userLogin.getUserAccount();
        String userPassword = userLogin.getUserPassword();
//        String code = userLogin.getCode();
        if (StringUtils.isAnyBlank(userAccount, userPassword)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR , "用户账号或密码不能为空");
        }
        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        UserVo res = userService.userLogin(userAccount, userPassword ,request);
        return ResultUtils.success(res);
    }
}
