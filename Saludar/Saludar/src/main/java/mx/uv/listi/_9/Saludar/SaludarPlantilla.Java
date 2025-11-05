package mx.uv.listi._9.saludar;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludarPlantilla {

    @GetMapping("/plantilla")
        public String plantilla(Model m) {
            m.addAttribute("persona", "Ningun nombre");
            return "xxx";
        }

    @GetMapping("/plantilla/{nombre}")
        public String plantilla2(Model m) {
            m.addAttribute("persona", "John doe");
            return "xxx";
        }    
    }

