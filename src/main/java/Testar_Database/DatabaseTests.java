package Testar_Database;

import projeto1.projeto1.DAO.SysUserDAO;
import projeto1.projeto1.SysUser;

import java.util.List;

public class DatabaseTests {

    public static void main(String[] args) {
        List<SysUser> example = SysUserDAO.findAll();

        SysUserDAO d = new SysUserDAO();
        SysUser tmp = SysUser.builder().
                name("Teste").
                email("teste@gmail.com").
                password("1234").build();
        SysUserDAO.save(tmp);

        for (SysUser user : example) {
            System.out.println(user);
        }
    }
}

