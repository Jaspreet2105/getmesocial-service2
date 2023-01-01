package com.spring22.Consult;

import com.spring22.Consult.model.Inquiry;
import com.spring22.Consult.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

@Autowired
    private HomeService homeService;

    //@GetMapping("/")
    //public String index(Model model){

        //model.addAttribute("inquiry", new Inquiry());

        //return "index.html";

    //}

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("inquiry", new Inquiry());

        return "index.html";

    }

    @GetMapping("/index.html")
    public String index(Model model){

        model.addAttribute("inquiry", new Inquiry());

        return "index.html";

    }

    //@GetMapping("/index.html")
    //public String home(){

        //return "index.html";

    //}

    @GetMapping("/about.html")
    public String about(Model model){


        model.addAttribute("teammembers",homeService.getTeamMembers());

        return "about.html";

    }

    @GetMapping("/service.html")
    public String service(){

        return "service.html";

    }
    @GetMapping("/contact.html")
    public String contact(){

        return "contact.html";

    }


    @PostMapping("/about.html")
    public String searchTeamMember(Model model, @ModelAttribute Inquiry inquiry){

        //System.out.println(inquiry.getSearchString());
        String teamMemberName  = inquiry.getSearchString();
        model.addAttribute("teammembers",homeService.searchedTeamMembers(teamMemberName));

        return "about.html";

    }
}
