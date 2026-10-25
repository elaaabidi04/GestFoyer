package esprim.tn.gestfoyer.controller;

import esprim.tn.gestfoyer.service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantRestController {
    @Autowired
    private IEtudiantService etudiantService ;
}
