package barath.springframework.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/index", "/owners/index.htmlf"})
    public String listOwners(){
        return "owners/index";
    }
}
