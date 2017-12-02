package com.krish.mlotto;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Ticket {

private static AtomicLong atomicCounter = new AtomicLong();

public Ticket(List<String> songlslist) {
		this.ticktID = getTicktID();
		String[] ticketSongs = get15RandomSongs(songlslist);
		this.song11 = ticketSongs[0];
		this.song12 = ticketSongs[1];;
		this.song13 = ticketSongs[2];;
		this.song14 = ticketSongs[3];;
		this.song15 = ticketSongs[4];
		this.song21 = ticketSongs[5];
		this.song22 = ticketSongs[6];
		this.song23 = ticketSongs[7];
		this.song24 = ticketSongs[8];
		this.song25 = ticketSongs[9];
		this.song31 = ticketSongs[10];
		this.song32 = ticketSongs[11];
		this.song33 = ticketSongs[12];
		this.song34 = ticketSongs[13];
		this.song35 = ticketSongs[14];
	}
private String[] get15RandomSongs(List<String> songlslist) {
	Collections.shuffle(songlslist);
	String[] ticketSongs = new String[15];
	for(int i=0;i<15;i++) ticketSongs[i] = songlslist.get(i);
	Collections.shuffle(songlslist);
	Arrays.sort(ticketSongs);
	return ticketSongs;
}
@Override
	public String toString() {
		return "Ticket [ticktID=" + ticktID + ", song11=" + song11 + ", song12=" + song12 + ", song13=" + song13
				+ ", song14=" + song14 + ", song15=" + song15 + ", song21=" + song21 + ", song22=" + song22
				+ ", song23=" + song23 + ", song24=" + song24 + ", song25=" + song25 + ", song31=" + song31
				+ ", song32=" + song32 + ", song33=" + song33 + ", song34=" + song34 + ", song35=" + song35 + "]";
	}
public String ticktID;

public String song11;
public String song12;
public String song13;
public String song14;
public String song15;

public String song21;
public String song22;
public String song23;
public String song24;
public String song25;

public String song31;
public String song32;
public String song33;
public String song34;
public String song35;

public String getTicktID() {
	//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	//return  dateFormat.format(new Date());
	//String tickeID = UUID.randomUUID().toString();
	//return tickeID;
	return String.valueOf(atomicCounter.getAndIncrement());
	
}

}
