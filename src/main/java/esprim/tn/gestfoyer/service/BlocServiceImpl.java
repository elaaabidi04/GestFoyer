package esprim.tn.gestfoyer.service;

import esprim.tn.gestfoyer.entities.Bloc;
import esprim.tn.gestfoyer.repositories.BlocRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    private BlocRepesitory blocRepesitory;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepesitory.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return blocRepesitory.findById(blocId).orElse(null);
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepesitory.save(b);
    }

    @Override
    public void removeBloc(Long blocId) {
        blocRepesitory.deleteById(blocId);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepesitory.save(bloc);
    }
}
