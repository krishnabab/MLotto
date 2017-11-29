package com.krish.mlotto.rest;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krish.mlotto.Ticket;


@RestController
@RequestMapping("/service")
public class RestServiceController {
		
		@Autowired
		Ticket ticket;
		
		// http://localhost:9080/service/getticket
		@RequestMapping(value="/getticket",method= {RequestMethod.GET})
		public Ticket getTicket() throws Exception {
			return ticket;
		}
		
		@RequestMapping(value="/getsong",method= {RequestMethod.GET})
		public String sayHi() {
			return "Hello Buddy !";
		}
}
