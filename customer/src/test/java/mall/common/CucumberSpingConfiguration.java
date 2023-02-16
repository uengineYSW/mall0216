package mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.CustomerApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerApplication.class })
public class CucumberSpingConfiguration {}
