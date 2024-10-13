package de.wsc.advertisements;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping({"/{page}", "/"})
    public String app(Model model, @PathVariable(required = false) String page) {
        if (page != null) {

            model.addAttribute("page", page);
            switch (page) {
                case "templates" -> {

                }
            }
        }
        return "app";
    }
}
