package Services;



import projeto1.projeto1.DAO.SysUserDAO;
import projeto1.projeto1.SysUser;

import java.util.ArrayList;
import java.util.List;

public class SessionAuthenticator {
    static SysUserDAO DAO = new SysUserDAO();
    static List<SysUser> FetchedUserList = new ArrayList<SysUser>();

    public static SysUser authenticate(SysUser authenticateTarget) {
        FetchedUserList = SysUserDAO.findAll();
        if (FetchedUserList.contains(authenticateTarget)) {
            authenticateTarget = FetchedUserList.get(FetchedUserList.indexOf(authenticateTarget));
            //retorna index após autenticate
            return authenticateTarget;
        }
        return null;
    }
}
