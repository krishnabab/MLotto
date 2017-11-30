package com.krish.mlotto;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MLottoConfig {
	@Value("${songsFolderPath}")
	String songsDir;
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public List<String> songsList() {
		List<String> songsList = new LinkedList<String>();
		File file = new File(songsDir);
		String[] fileList = file.list();
		for (String name : fileList) {
			//System.out.println(name);
			name = name.replace(".mp3", " ");
			songsList.add(name);
		}
		Collections.shuffle(songsList);	
		return songsList;
	}
}
