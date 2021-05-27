package com.oxygen.controller;


import com.oxygen.common.CommonResult;
import com.oxygen.dto.LoginDto;
import com.oxygen.dto.RegisterDto;
import com.oxygen.entity.User;
import com.oxygen.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author oxygen
 * @since 2021-05-24
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 用户注册
     */
    @PostMapping("/register")//@Validated
    public CommonResult register( @RequestBody RegisterDto registerDto){
        log.info(registerDto.toString());

        String obj = userService.register(registerDto);
        if(obj.equals("注册成功")){
            return CommonResult.success(obj);
        }else{
            return CommonResult.failed(obj);
        }

    }

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public CommonResult login(@RequestBody LoginDto loginDto){
        log.info(loginDto.toString());

        String ans = userService.login(loginDto);
        if(ans.equals("用户名密码正确")){
            return CommonResult.success(ans);
        }
        return CommonResult.failed(ans);
    }
}

