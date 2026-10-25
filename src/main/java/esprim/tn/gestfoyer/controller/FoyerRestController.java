package esprim.tn.gestfoyer.controller;

import esprim.tn.gestfoyer.service.IFoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foyer")
public class FoyerRestController {
    @Autowired
    private IFoyerService foyerService;
}
