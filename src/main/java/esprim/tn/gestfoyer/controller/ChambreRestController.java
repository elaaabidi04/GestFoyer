package esprim.tn.gestfoyer.controller;

import esprim.tn.gestfoyer.service.IChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChambreRestController {
    @Autowired
    private IChambreService chambreService;
}
