package designpatterns.strategy;

import java.math.BigDecimal;

public interface Discounter {

	default BigDecimal applyDiscount(BigDecimal amount) {
		return amount;
	};

}
