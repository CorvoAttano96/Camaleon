package com.informatorio.pubs.api;


import com.informatorio.pubs.model.domain.*;
import com.informatorio.pubs.model.repository.*;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class Controller {


        private final ArtPedRepo artPedRepo;
        private final ArtRepo artRepo;
        private final inventRepo inventarioRepo;
        private final PedRepo pedRepo;
        private final PersRepo persRepo;
        private final ProvRepo provRepo;
        private final PubsRepo pubsRepo;
        private final RecRepo recRepo;
        private final TrabRepo trabRepo;

        public Controller(ArtPedRepo artPedRepo, ArtRepo artRepo, inventRepo inventarioRepo, PedRepo pedRepo, PersRepo persRepo, ProvRepo provRepo, PubsRepo pubsRepo, RecRepo recRepo, TrabRepo trabRepo) {
            this.artPedRepo = artPedRepo;
            this.artRepo = artRepo;
            this.inventarioRepo = inventarioRepo;
            this.pedRepo = pedRepo;
            this.persRepo = persRepo;
            this.provRepo = provRepo;
            this.pubsRepo = pubsRepo;
            this.recRepo = recRepo;
            this.trabRepo = trabRepo;
        }


        @GetMapping("/personalxpub/{name}")
        Collection<Personal> getPersonal(@PathVariable String name) {
            ArrayList<Personal> personal = new ArrayList<Personal>();

            for (Pubs pubs : pubsRepo.findAll()){
                if (name.toLowerCase().equals( pubs.getNombre().toLowerCase())){
                    for (Trabajos pers : trabRepo.findAll()) {
                        if (pubs.getId() == pers.getPubs().getId() && pers.getPuesto().equals("camarero")){
                            personal.add(pers.getPersonal());
                        }
                    }
                }
            }


            return personal;
        }

        @GetMapping("/artxprov/{name}/{jugo}")
        Collection<Proveedores> getEvent(@PathVariable String name,@PathVariable String jugo) {
            List<Proveedores> prov = new ArrayList<Proveedores>();
            for (Pubs pubs : pubsRepo.findAll()) {
                if (name.toLowerCase().equals(pubs.getNombre().toLowerCase())) {
                    for (Inventarios invent : inventarioRepo.findAll()) {
                        if (invent.getArticulo().getNombre().equals(jugo) && invent.getPubs().getNombre().equals(pubsRepo.findOne(pubs.getId()).getNombre())) {
                            prov.add(invent.getProveedores());

                        }
                    }
                }
            }
            return prov;
        }

        @GetMapping("/recxmonto/{fecha}/{monto}")
        Collection<Pubs> getpub(@PathVariable String fecha,@PathVariable int monto) {
            ArrayList<Pubs> pubs = new ArrayList<Pubs>();
            for (Recaudaciones rec : recRepo.findAll()) {
                if (rec.getFecha().equals(fecha) && rec.getMonto() >= monto){
                    pubs.add(rec.getPubs());
                }
            }
            return pubs;
        }

        @PostMapping("/Trabajo")
        public ResponseEntity<Void> createTrabajo(@RequestBody Trabajos trabajo) {
            trabRepo.save(trabajo);
            return ResponseEntity.created(URI.create("/Trabajo")).build();
        }
}
