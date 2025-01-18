package com.hmdp.dto;

import lombok.Data;

/**
 * 登录信息
 * @author 裴迪
 */
@Data
public class LoginFormDTO {
    private String phone;
    private String code;
    private String password;
}
