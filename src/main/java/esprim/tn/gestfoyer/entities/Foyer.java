package esprim.tn.gestfoyer.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Foyer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idFoyer ;
    private String nomFoyer ;
    private long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;


}
