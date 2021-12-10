package tryingToCorrectThese;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectPackages({"test.java.TestEmpListSize"
        ,"test.java.TestEmpShuffle"})

@Suite
public class JunitTestSuite {


}
