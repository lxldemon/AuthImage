package AuthImage.service.impl;

import AuthImage.dao.SysUserRepository;
import AuthImage.domain.Sys_user;
import AuthImage.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public Sys_user findByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }
}
