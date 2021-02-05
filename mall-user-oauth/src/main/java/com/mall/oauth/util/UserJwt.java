package com.mall.oauth.util;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;


@Data
public class UserJwt extends User {

    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名字
     */
    private String name;

    /**
     * 设置公司
     */
    private String comny;

    public UserJwt(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

}
