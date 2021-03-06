package org.sid.cinema.dao.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Film {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String titre;
 private String description;
 private String realisateur;
 private Date dateSortie;
 private double duree;
 private String photo;
    @OneToMany(mappedBy = "film")
    private Collection<Projection> projections;
    @ManyToOne
    private Categorie categorie;
}
