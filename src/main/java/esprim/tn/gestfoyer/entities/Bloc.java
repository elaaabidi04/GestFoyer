package esprim.tn.gestfoyer.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bloc {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idBloc ;
    private String nomBloc ;
    private long capaciteBloc ;
}
