package infosec.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 声明用的是Spring的测试类 **/
@RunWith(SpringJUnit4ClassRunner.class)

/** 声明spring主配置文件位置，注意：以当前测试类的位置为基�?有多个配置文件以字符数组声明 **/
@ContextConfiguration(locations={"../../../configs/spring/spring-context.xml"})


public class TestLoginFunction {
}
