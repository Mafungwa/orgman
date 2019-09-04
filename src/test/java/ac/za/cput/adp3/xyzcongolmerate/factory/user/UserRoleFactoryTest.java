package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {

        UserRole objUserRole = UserRoleFactory.buildUserRole("#123","pule@cput.ac.za","Tester");
        Assert.assertNotNull(objUserRole.getRoleId());
        Assert.assertNotSame(objUserRole.getOrgCode(),objUserRole.getRoleId(),objUserRole.getUserEmail());

    }
}