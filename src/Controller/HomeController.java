package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Burak Köken on 19.1.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/person/{personId}")
    public ModelAndView showPersonInfo(@PathVariable String personId){
        ModelAndView modelAndView = new ModelAndView("PersonInfo");
        modelAndView.addObject("personId", personId);

        return  modelAndView;
    }

    @RequestMapping("/person/{personId}/{personName}")
    public ModelAndView showPerson(@PathVariable Map<String, String> pathVariables){
        ModelAndView modelAndView = new ModelAndView("Person");

        String id = pathVariables.get("personId");
        String name = pathVariables.get("personName");

        modelAndView.addObject("personId", id);
        modelAndView.addObject("personName", name);

        return modelAndView;
    }


}
