package com.hcling.gr.hackathon.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcling.gr.hackathon.model.CustomerProduct;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerProductControllerTest {

    @LocalServerPort
    private int port;
    
    TestRestTemplate restTemplate = new TestRestTemplate();
    
	@Test
	void shouldCallEndpoint() {
		
		  ResponseEntity<CustomerProduct> response = restTemplate.getForEntity
	        		(createURLWithPort("/customers") + "?searchString=friends", CustomerProduct.class);

	       // assertThat(response.getBody().getTotalItems() == 10, Matchers.is(true));
	}
	

  

    private String createURLWithPort(String uri) {

        return "http://localhost:" + port + uri;

    }
}
