package com.informatorio.pubs;

import com.informatorio.pubs.model.domain.*;
import com.informatorio.pubs.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootApplication
public class PubsApplication implements CommandLineRunner {
	@Autowired
	private ArtPedRepo artPedRepo;
	@Autowired
	private ArtRepo artRepo;
	@Autowired
	private inventRepo inventarioRepo;
	@Autowired
	private PedRepo pedRepo;
	@Autowired
	private PersRepo persRepo;
	@Autowired
	private ProvRepo provRepo;
	@Autowired
	private PubsRepo pubsRepo;
	@Autowired
	private RecRepo recRepo;
	@Autowired
	private TrabRepo trabRepo;



	public static void main(String[] args) {
		SpringApplication.run(PubsApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... strings) throws Exception {


	}
}
