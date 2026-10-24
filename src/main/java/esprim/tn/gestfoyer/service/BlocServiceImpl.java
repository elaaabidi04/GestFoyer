package esprim.tn.gestfoyer.service;

import esprim.tn.gestfoyer.repositories.BlocRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class BlocServicelmpl implements IBlocService {
    @Autowired
    private BlocRepesitory blocRepesitory ;
}
