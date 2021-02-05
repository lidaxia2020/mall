package com.mall.oauth.service;

import com.mall.oauth.util.AuthToken;

public interface AuthService {

    /**
     * 授权认证方法
     *
     * @param username
     * @param password
     * @param clientId
     * @param clientSecret
     * @return
     */
    AuthToken login(String username, String password, String clientId, String clientSecret);
}
