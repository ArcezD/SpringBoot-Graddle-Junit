package cr.arce.core.controllers;

import static org.assertj.core.api.Assertions.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.web.client.*;
import org.springframework.test.context.junit4.*;

/** 
 * <H1>Test | Main RestController</H1>
 * 
 * AzD-Core [ArcezD]
 * 
 * @author Diego Arce E.
 * @version 1.0
 * 
 * Copyright 2016 ArcezD.
 * 
 */

@RunWith(SpringRunner.class) 
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT) 
public class MainControllerTest {
	
	@Autowired
    private TestRestTemplate restTemplate;
	
	@Test
    public void indexTest() {
		String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("AzD-Core. Desarrollado por: <a href='http://diego.arce.cr'>Diego Arce</a>");
    }

}
