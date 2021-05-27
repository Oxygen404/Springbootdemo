package com.oxygen.service;

import com.oxygen.dto.LoginDto;
import com.oxygen.dto.RegisterDto;
import com.oxygen.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author oxygen
 * @since 2021-05-24
 */
public interface UserService extends IService<User> {

    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
