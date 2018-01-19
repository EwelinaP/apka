package pl.apka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.apka.data.PersonRepository;
import pl.apka.model.Person;

import java.util.List;

@Controller
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonController()
    {

    }

    @PostMapping("/save")
    public String success(@ModelAttribute Person person) {

        if (check(person)) {
            personRepository.save(person);
            return "redirect:success";
        }
        else {
            return "redirect:error";
        }
    }


    @GetMapping("/success")
    public String succces() {
        return "success";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/wyszukaj")
    public String get() {
        return "wyszukiwanie";
    }


    @PostMapping("/search")
    public String wyszkaj(@RequestParam String imie, Model model) {
        List<Person> list = personRepository.findAllByImie(imie);
        System.out.println(list);
        model.addAttribute("osoby", list);

        return "wyszukiwanie";
    }


  public boolean check(Person person) {


        return (person.getDataSmierci() != null && person.getDataSmierci().length() > 0 &&
                person.getDataUrodzenia() != null && person.getDataUrodzenia().length() > 0 &&
                person.getImie() != null && person.getImie().length() > 0 &&
                person.getMiejsceObrony() != null && person.getMiejsceObrony().length() > 0 &&
                person.getMiejsceSmierci() != null && person.getMiejsceSmierci().length() > 0 &&
                person.getNazwisko() != null && person.getNazwisko().length() > 0 &&
                person.getMiejsceUrodzenia() != null && person.getMiejsceUrodzenia().length() > 0 &&
                person.getDataSmierci() != null && person.getDataSmierci().length() > 0 &&
                person.getRok_obrony() != 0);


    }

}
