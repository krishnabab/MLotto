package com.krish.mlotto;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MLottoConfig {

	@Bean
	public SongsList songslistObj() {
		return new SongsList();
	}

	@Bean
	public Ticket ticketObj() {
		return new Ticket();
	}

}
