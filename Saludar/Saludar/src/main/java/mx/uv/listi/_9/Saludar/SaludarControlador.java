// Paquete del proyecto
package mx.uv.listi._9.saludar;

// Importaciones
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;



// Clase controlador 
@CrossOrigin(origin = "*")
@RestController
public class SaludarControlador {

    // EndPoint para altas, bajas, cambios y consultas
    @RequestMapping("/")
    public String home(){
        return "<ul><li><a href='/altas'>Altas</a></li> <li><a href='/bajas'>Bajas</a></li> <li><a href='/cambios'>Cambios</a></li> <li><a href='/consultas'>Consultas</a></li></ul>";
    }

    @RequestMapping(value = "/altas", method = RequestMethod.POST)
    public String altas(){
        return "altas";
    }

    @RequestMapping(value = "/bajas", method = RequestMethod.DELETE)
    public String bajas(){
        return "bajas";
    }
    
    @RequestMapping(value = "/cambios", method = RequestMethod.PUT)
    public String cambios(){
        return "cambios";
    }

    @RequestMapping(value = "/consultas", method = RequestMethod.GET)
    public String consultas(){
        return "consultas";
    }
    
    //Endpoints para saludar
    @RequestMapping(value = "/saludar/{nombre}", method = RequestMethod.GET)
    public Saludador saludarPath1(@PathVariable String nombre){
        return new Saludador(nombre);
    }

    // --recepcion de parametros query string
    @GetMapping("/query")
    public void SaludarQuery(@RequestParam String nombre){
           System.out.println("nombre");
    }

    @GetMapping("/obtener saludo")
    public Saludador saludarObtener(){
        return S();
    }


    @PostMapping("crearSaludo")
    public String saludoCrear(@RequestBody Saludador parametro){
        Saludador saludador = new Saludador(parametro.getNombre());
        return "exito";
    }
}