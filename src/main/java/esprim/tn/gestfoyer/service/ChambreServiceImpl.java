package esprim.tn.gestfoyer.service;

import esprim.tn.gestfoyer.entities.Chambre;
import esprim.tn.gestfoyer.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ChambreServiceImpl implements IChambreService {
    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return List.of();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return null;
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return null;
    }

    @Override
    public void removeChambre(Long chambreId) {

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return null;
    }
}
