package io.github.mxkgf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.mxkgf.entity.dto.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends IService<Account>, UserDetailsService {
    Account findAccountByUsernameOrEmail(String text);
}
