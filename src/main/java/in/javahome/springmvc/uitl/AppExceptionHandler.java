package in.javahome.springmvc.uitl;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(value=SQLException.class)
	public String handelException(SQLException e) {
		e.printStackTrace();
		return "sqlerror";
	}
	@ExceptionHandler(value={RuntimeException.class,RuntimeException.class})
	public String handelException(RuntimeException e) {
		e.printStackTrace();
		return "runerror";
	}
}
