package com.maveric.accountservice.conroller;

import com.maveric.accountservice.dto.ErrorDto;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import static com.maveric.accountservice.constants.Constants.INCORRECT_URL_CODE;
import static com.maveric.accountservice.constants.Constants.INCORRECT_URL_MESSAGE;

@Controller
public class AccountErrorController implements ErrorController {

    @GetMapping("/error")
    public ResponseEntity<ErrorDto> errorHandler(HttpServletRequest req) {
        ErrorDto error = new ErrorDto();
        error.setCode(INCORRECT_URL_CODE);
        error.setMessage(INCORRECT_URL_MESSAGE);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}