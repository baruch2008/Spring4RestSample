/**
 *
 */
package org.shibaty.spring4rest.exception;

/**
 * 例外クラス（指定されたユーザが見つからない）.<br>
 * @author Yasutaka
 *
 */
public class UserNotFoundException extends RuntimeException {

  /**
   *
   */
  public UserNotFoundException() {
    super("User not found.");
  }

  /**
   * @param message
   */
  public UserNotFoundException(String message) {
    super(message);
  }
}
