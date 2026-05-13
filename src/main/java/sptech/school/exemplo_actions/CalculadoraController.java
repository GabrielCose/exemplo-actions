package sptech.school.exemplo_actions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/soma/{a}/{b}")
    public ResponseEntity<Double> somar(@PathVariable double a, @PathVariable double b) {
        return ResponseEntity.ok(calculadoraService.somar(a, b));
    }

    @PostMapping("/subtracao/{a}/{b}")
    public ResponseEntity<Double> subtrair(@PathVariable double a, @PathVariable double b) {
        return ResponseEntity.ok(calculadoraService.subtrair(a, b));
    }

    @PostMapping("/multiplicacao/{a}/{b}")
    public ResponseEntity<Double> multiplicar(@PathVariable double a, @PathVariable double b) {
        return ResponseEntity.ok(calculadoraService.multiplicar(a, b));
    }

    @PostMapping("/divisao/{a}/{b}")
    public ResponseEntity<Double> dividir(@PathVariable double a, @PathVariable double b) {
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }
}
