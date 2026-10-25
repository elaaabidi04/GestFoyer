package esprim.tn.gestfoyer.entities;
import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String idReservation ;
    private Date anneUniversitaire ;
    private boolean estValide ;
}

