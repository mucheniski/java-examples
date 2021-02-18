package treinamento2.dia2.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Parcela {
	
	private Integer numero;
	private BigDecimal valor;
	private LocalDate vencimento;	
	
	public Parcela(Integer numero, BigDecimal valor, LocalDate vencimento) {		
		this.numero = numero;
		this.valor = valor;
		this.vencimento = vencimento;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public LocalDate getVencimento() {
		return vencimento;
	}
	
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		result = prime * result + ((vencimento == null) ? 0 : vencimento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parcela other = (Parcela) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		if (vencimento == null) {
			if (other.vencimento != null)
				return false;
		} else if (!vencimento.equals(other.vencimento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parcela [numero=" + numero + ", valor=" + valor + ", vencimento=" + vencimento + "]";
	}

}
