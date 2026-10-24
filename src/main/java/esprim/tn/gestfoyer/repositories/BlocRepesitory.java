package esprim.tn.gestfoyer.repositories

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BlocRepesitory extends JpaRepository<Bloc,long>{
}