package com.gabriel.precotomate.controller;

import com.gabriel.precotomate.dto.PrecoRequest;
import com.gabriel.precotomate.dto.PrecoResponse;
import com.gabriel.precotomate.service.PrecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/preco")
public class PrecoController {

    @Autowired
    private PrecoService precoService;

    @PostMapping
    public PrecoResponse calcularPreco(@RequestBody PrecoRequest request) {
        double precoFinal = precoService.calcularPreco(request.getQuantidade());
        return new PrecoResponse(precoFinal);
    }
}
