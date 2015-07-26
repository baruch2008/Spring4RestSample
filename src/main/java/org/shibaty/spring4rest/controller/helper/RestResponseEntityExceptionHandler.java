/**
 *
 */

package org.shibaty.spring4rest.controller.helper;

import org.shibaty.spring4rest.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 例外発生時レスポンス処理クラス.<br>
 * @author Yasutaka
 */
@ControllerAdvice(annotations = RestController.class)
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  /**
   * ユーザが見つからないときのレスポンス.<br>
   * @param ex
   */
  @ExceptionHandler(UserNotFoundException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public void handleUserNotFoundException(UserNotFoundException ex) {
  }

}
