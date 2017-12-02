package com.krish.mlotto.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		// http://localhost:9080/service/gettickets
		@RequestMapping(value="/gettickets/{noOfTkts}",method= {RequestMethod.GET})
		public List<Ticket> getTickets(@PathVariable("noOfTkts")int noOfTkts) throws Exception {
			List<Ticket> tickets = new ArrayList<Ticket>();
			for(int i=0;i<noOfTkts;i++) {
				tickets.add(new Ticket(songslist));
			}
		return tickets;
		}
		
}
