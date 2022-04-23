package de.ronios.ToDoApp;

import de.ronios.ToDoApp.aufgabe.Aufgabe;
import de.ronios.ToDoApp.aufgabe.AufgabeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Instant;

@Controller
public class MainController {

    private final AufgabeRepository aufgabeRepository;

    @Autowired
    public MainController(AufgabeRepository aufgabeRepository){
        this.aufgabeRepository = aufgabeRepository;
    }


    @GetMapping("/")
    public String home(Model model){
        AufgabeDTO aufgabe = new AufgabeDTO("");
        model.addAttribute("aufgabeDTO", aufgabe);
        return "home";
    }

    @PostMapping("/result")
    public String showResult(@ModelAttribute AufgabeDTO aufgabeDTO, Model model){
        Aufgabe aufgabe = new Aufgabe(aufgabeDTO.getAufgabe());
        aufgabeRepository.save(aufgabe);
        model.addAttribute("aufgaben", aufgabeRepository.findAll());
        return "result";
    }
}
