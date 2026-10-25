package esprim.tn.gestfoyer.controller;

import esprim.tn.gestfoyer.service.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/universite")
public class UniversiteRestController {
    @Autowired
    private IUniversiteService universiteService;
}
