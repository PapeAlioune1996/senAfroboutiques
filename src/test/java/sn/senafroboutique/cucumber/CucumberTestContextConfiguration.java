package sn.senafroboutique.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import sn.senafroboutique.SenAfroboutiquesApp;

@CucumberContextConfiguration
@SpringBootTest(classes = SenAfroboutiquesApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
