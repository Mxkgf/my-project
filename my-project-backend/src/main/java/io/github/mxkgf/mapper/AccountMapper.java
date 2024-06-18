package io.github.mxkgf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.mxkgf.entity.dto.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
