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

@Autowired
SongsList songslistObj;

public Ticket() {
		this.ticktID = getTicktID();
		this.song11 = getRandomSong();
		this.song12 = getRandomSong();
		this.song13 = getRandomSong();
		this.song14 = getRandomSong();
		this.song15 = getRandomSong();
		this.song21 = getRandomSong();
		this.song22 = getRandomSong();
		this.song23 = getRandomSong();
		this.song24 = getRandomSong();
		this.song25 = getRandomSong();
		this.song31 = getRandomSong();
		this.song32 = getRandomSong();
		this.song33 = getRandomSong();
		this.song34 = getRandomSong();
		this.song35 = getRandomSong();
	}
private String getRandomSong() {
	String song = "temp";
/*	String song = songslistObj.songsList.get(0);
	songslistObj.songsList.remove(0);
	Collections.shuffle(songslistObj.songsList);*/
	
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
public void setTicktID(String ticktID) {
	this.ticktID = ticktID;
}
public String getSong11() {
	return song11;
}
public void setSong11(String song11) {
	this.song11 = song11;
}
public String getSong12() {
	return song12;
}
public void setSong12(String song12) {
	this.song12 = song12;
}
public String getSong13() {
	return song13;
}
public void setSong13(String song13) {
	this.song13 = song13;
}
public String getSong14() {
	return song14;
}
public void setSong14(String song14) {
	this.song14 = song14;
}
public String getSong15() {
	return song15;
}
public void setSong15(String song15) {
	this.song15 = song15;
}
public String getSong21() {
	return song21;
}
public void setSong21(String song21) {
	this.song21 = song21;
}
public String getSong22() {
	return song22;
}
public void setSong22(String song22) {
	this.song22 = song22;
}
public String getSong23() {
	return song23;
}
public void setSong23(String song23) {
	this.song23 = song23;
}
public String getSong24() {
	return song24;
}
public void setSong24(String song24) {
	this.song24 = song24;
}
public String getSong25() {
	return song25;
}
public void setSong25(String song25) {
	this.song25 = song25;
}
public String getSong31() {
	return song31;
}
public void setSong31(String song31) {
	this.song31 = song31;
}
public String getSong32() {
	return song32;
}
public void setSong32(String song32) {
	this.song32 = song32;
}
public String getSong33() {
	return song33;
}
public void setSong33(String song33) {
	this.song33 = song33;
}
public String getSong34() {
	return song34;
}
public void setSong34(String song34) {
	this.song34 = song34;
}
public String getSong35() {
	return song35;
}
public void setSong35(String song35) {
	this.song35 = song35;
}

}
