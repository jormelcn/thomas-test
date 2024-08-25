package com.jorge.thomas.test.app.product.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class ImposibleDeleteProduct extends RuntimeException {

}