package com.packt.webstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Brak produktów we wskazanej kategorii")
public class NoProductsFoundUnderCategoryException extends RuntimeException {
	private static final long serialVersionUID = 1554251630974234515L;

}
