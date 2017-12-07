package register.controller;

import register.domain.RegisterInfo;
import register.domain.RegisterResult;
import register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountRegisterController {

    @Autowired
    private RegisterService accountService;

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public RegisterResult createNewAccount(@RequestBody RegisterInfo ri,@CookieValue String YsbCaptcha){
        System.out.println("[Register Service][Register] Verification Code:" + ri.getVerificationCode() +
                " VerifyCookie:" + YsbCaptcha);
        return accountService.create(ri,YsbCaptcha);
    }
}
