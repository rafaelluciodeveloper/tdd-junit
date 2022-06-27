package br.com.rafaellucio.bonus.model;

import java.math.BigDecimal;

public enum Desempenho {

    RUIM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.10");
        }
    },
    OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
