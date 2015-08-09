/**
 *
 */

package org.shibaty.spring4rest.service;

import org.shibaty.spring4rest.exception.UserNotFoundException;
import org.shibaty.spring4rest.resource.User;
import org.shibaty.spring4rest.resource.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Yasutaka
 */
@Service
public class UsersService {

  /**
   * ロガー.<br>
   */
  private static final Logger logger = LoggerFactory.getLogger(UsersService.class);

  public Users getUsers() {
    logger.info("Controller:" + this.getClass().getName());

    Users users = new Users();
    for (int i = 0; i < 10; i++) {
      User user = new User(i, "taro" + i, "yamada" + i);
      users.getUser().add(user);
    }
    return users;
  }

  public User getUser(int id) {
    logger.info("Service:" + this.getClass().getName());

    if (id != 0) {
      throw new UserNotFoundException();
    }

    User user = new User(id, "hanako", "suzuki");
    return user;
  }

}
