package esprim.tn.gestfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ChambreServicelmpl implements IChambreService {
    @Autowired
    private ChambreRepository chambreRepository;
}
