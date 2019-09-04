package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {

        OrganisationUser objOrgUser = OrganisationUserFactory.buildOrganisationUser("123", "cput@cput.ac.za");
        Assert.assertEquals("cput@cput.ac.za", "123","123");
    }
}