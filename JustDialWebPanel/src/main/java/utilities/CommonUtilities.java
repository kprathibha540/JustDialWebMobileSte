package utilities;



import org.apache.commons.lang.RandomStringUtils;

import com.lifeco.generic.BaseTest;



public class CommonUtilities extends BaseTest {
    protected String getRandomNumber(int numberOfLength) {
        return RandomStringUtils.randomNumeric(numberOfLength);
    }
}
