package AuthImage.service;

import AuthImage.domain.Sys_user;

public interface SysUserService {
    Sys_user findByUsername(String username);
}
