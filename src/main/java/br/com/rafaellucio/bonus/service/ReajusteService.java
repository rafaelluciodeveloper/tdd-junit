package br.com.rafaellucio.bonus.service;

import br.com.rafaellucio.bonus.model.Desempenho;
import br.com.rafaellucio.bonus.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal novoSalario = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.setReajusteSalario(novoSalario);
    }
}
