package jelsyn.holamundospringboot;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HolaMundoSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(HolaMundoSpringBoot.class, args);
    }
}

@RestController
class HelloController {
    // Inicialización de RestTemplate
    private final Random random = new Random();
    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        int delay = random.nextInt(10001); // 10001 es exclusivo, por lo que el valor máximo es 10000
        Thread.sleep(delay); // Pausa la ejecución por el tiempo generado
        
        return delay + "ms";
    }
}

@RestController
class BayController {
    private final Random random = new Random();
    @GetMapping("/bye")
    public String bye() throws InterruptedException {
        // Genera un retardo aleatorio entre 0 y 10000 milisegundos (0 y 10 segundos)
        int delay = random.nextInt(10001); // 10001 es exclusivo, por lo que el valor máximo es 10000
        Thread.sleep(delay); // Pausa la ejecución por el tiempo generado
        
        return delay + "ms";
    }
  
}

@RestController
class CicloController {
    private final Random random = new Random();
    @GetMapping("/ciclo")
    public String hello() throws InterruptedException {
        int delay = random.nextInt(10001); // 10001 es exclusivo, por lo que el valor máximo es 10000
        Thread.sleep(delay); // Pausa la ejecución por el tiempo generado
        
        return delay + "ms";
    }

}