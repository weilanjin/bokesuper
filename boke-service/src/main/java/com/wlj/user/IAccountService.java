package com.wlj.user;

public interface IAccountService {
    /**
     * 账号注册
     * @param vo
     * @return
     * @throws Exception
     */
    Register register(Register vo) throws Exception;
}
