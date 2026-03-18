package hospital.management.system;


@RestController
@CrossOrigin
public class HelloController {





        @GetMapping("/api/hello")
        public String hello() {
            return "Hello from Java Backend";
        }
    }


