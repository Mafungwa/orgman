package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class GenderFactoryTest {


    Gender objGender;

    @Test
    public void buildGender() {


        objGender =  GenderFactory.buildGender("Male");
        System.out.println(objGender);
        assertNotNull(objGender.getGenderId(), "objGender");


    }
}