package tn.esprit.spring.control;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestControlImpl {

    // Exemple pédagogique : variable vulnérable volontairement
    private static final String DEMO_SECRET = "S3cr3tPassw0rd!"; // Sonar devrait le signaler

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Mise en place d’une plateforme de développement décentralisée sécurisée (mode SaaS) sur un cloud privé. "
             + " (Secret utilisé : " + DEMO_SECRET + ")";
    }
}
