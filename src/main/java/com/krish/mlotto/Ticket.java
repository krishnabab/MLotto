package com.krish.mlotto;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Ticket {

public Ticket(List<String> songlslist) {
		this.ticktID = getTicktID();
		this.song11 = getRandomSong(songlslist);
		this.song12 = getRandomSong(songlslist);
		this.song13 = getRandomSong(songlslist);
		this.song14 = getRandomSong(songlslist);
		this.song15 = getRandomSong(songlslist);
		this.song21 = getRandomSong(songlslist);
		this.song22 = getRandomSong(songlslist);
		this.song23 = getRandomSong(songlslist);
		this.song24 = getRandomSong(songlslist);
		this.song25 = getRandomSong(songlslist);
		this.song31 = getRandomSong(songlslist);
		this.song32 = getRandomSong(songlslist);
		this.song33 = getRandomSong(songlslist);
		this.song34 = getRandomSong(songlslist);
		this.song35 = getRandomSong(songlslist);
	}
private String getRandomSong(List<String> songlslist) {
	Collections.shuffle(songlslist);
	String song = songlslist.get(0);
	songlslist.remove(0);
	Collections.shuffle(songlslist);
	return song;
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
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	return  dateFormat.format(new Date());
}

}
