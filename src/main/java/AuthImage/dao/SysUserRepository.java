package AuthImage.dao;

import AuthImage.domain.Sys_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends JpaRepository<Sys_user,Integer> {

    Sys_user findByUsername(String username);
}
