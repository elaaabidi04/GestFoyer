package esprim.tn.gestfoyer.controller;

import esprim.tn.gestfoyer.repositories.BlocRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlocRestController {
    @Autowired
        private BlocRepesitory blocRepesitory;
}
