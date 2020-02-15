package fr.nlco.biblioc.bibliocweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Classe controller de la Homepage
 */
@Controller
public class HomeController {

    /**
     * Affichage de la homepage
     *
     * @return homepage
     */
    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }
}
