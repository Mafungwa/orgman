package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {
        User objUser = UserFactory.buildUser("pule@cput.ac.za","Podoskie","Mafu");
        System.out.println(objUser);
        Assert.assertNotSame(objUser.getUserEmail(),objUser.getFirstName(),objUser.getLastName());
    }
}