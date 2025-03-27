package Controller;

import Model.Fatura;
import Repository.FaturaRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {

    private final FaturaRepository faturaRepository;

    public FaturaController(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    @GetMapping
    public List<Fatura> listarFaturas() {
        return faturaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Fatura> cadastrarFatura(@Valid @RequestBody Fatura fatura) {
        Fatura novaFatura = faturaRepository.save(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}
