package login.service;

import login.domain.*;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AccountLoginRegisterService {

    LoginResult login(LoginInfo li,String YsbCaptcha,  HttpServletResponse response);

    LogoutResult logout(LogoutInfo li,HttpServletRequest request, HttpServletResponse response);

    RegisterResult create(RegisterInfo ri, String YsbCaptcha);
}
