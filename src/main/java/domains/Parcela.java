package domains;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Parcela {

    private Integer numero;
    private LocalDate vencimento;
    private BigDecimal valor;

}
