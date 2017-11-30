package com.krish.mlotto.rest;

import java.util.List;

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
		List<String> songslist;
		
		// http://localhost:9080/service/getticket
		@RequestMapping(value="/getticket",method= {RequestMethod.GET})
		public Ticket getTicket() throws Exception {
			Ticket ticket = new Ticket(songslist);
			return ticket;
		}
		
}
