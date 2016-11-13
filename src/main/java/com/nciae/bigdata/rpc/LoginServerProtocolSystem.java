package com.nciae.bigdata.rpc;

/**
 * Created by Rainbow on 2016/11/13.
 */
public class LoginServerProtocolSystem implements LoginServerProtocolInterface {
    @Override
    public boolean login(String username, String password) {
        if (username.equals("xiaozhang") && password.equals("123456")) {
            return true;
        }

        return false;
    }
}
