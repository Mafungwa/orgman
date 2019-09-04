package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

      Role objRole;
    @Test
    public  void buildRole() {


        objRole =  RoleFactory.buildRole("Leader");
        assertNotNull(objRole.getRoleId());
        System.out.println(objRole);


    }
}