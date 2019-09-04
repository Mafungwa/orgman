package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    private String bfrTest;
            @Before
            public void setBfrTest(){
            this.bfrTest="Black";
            }
            @Test
    public void buildRace() {
        Race raceFTest = RaceFactory.buildRace(bfrTest);
        Assert.assertNotNull(raceFTest.getRaceId());
        Assert.assertEquals(bfrTest,raceFTest.getRaceDescription());

    }
}