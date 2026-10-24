package esprim.tn.gestfoyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
}