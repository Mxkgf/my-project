package io.github.mxkgf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.mxkgf.entity.dto.Account;
import io.github.mxkgf.entity.vo.request.EmailRegisterVO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends IService<Account>, UserDetailsService {
    Account findAccountByUsernameOrEmail(String text);
    String registerEmailVerifyCode(String type, String email, String ip);
    String registerEmailAccount(EmailRegisterVO vo);
}
