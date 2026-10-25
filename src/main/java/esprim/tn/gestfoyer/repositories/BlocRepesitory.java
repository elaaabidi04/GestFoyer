package esprim.tn.gestfoyer.repositories;

import esprim.tn.gestfoyer.entities.Bloc;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BlocRepesitory extends JpaRepository<Bloc, Long>{
}