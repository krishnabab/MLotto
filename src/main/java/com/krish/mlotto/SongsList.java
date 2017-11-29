package com.krish.mlotto;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class SongsList {
	
	@Value( "${songs.folder.path:temp}" )
	private String songsDir;	
	
	List<String> songsList;
	
	SongsList(){
		songsList = new LinkedList<String>();
		File file = new File("C:\\Krish\\Music\\AllTime");
		String[] fileList = file.list();
		for (String name : fileList) {
			System.out.println(name);
			name = name.replace(".mp3", " ");
			songsList.add(name);
		}
		Collections.shuffle(songsList);
	}
		
	
}
