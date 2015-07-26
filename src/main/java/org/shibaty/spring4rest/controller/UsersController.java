
package org.shibaty.spring4rest.controller;

import org.shibaty.spring4rest.Constants;
import org.shibaty.spring4rest.resource.User;
import org.shibaty.spring4rest.resource.Users;
import org.shibaty.spring4rest.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yasutaka
 */
@RestController
@RequestMapping(value =Constants.PATH_USERS, produces = MediaType.APPLICATION_XML_VALUE)
public class UsersController {

  /**
   * ロガー.<br>
   */
  private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

  /**
   * Service.<br>
   */
  @Autowired
  private UsersService service;

  /**
   * ユーザ一覧取得.
   *
   * @return
   */
  @RequestMapping(value = Constants.PATH_RELATIVE_GET_USERS, method = RequestMethod.GET)
  public Users getUsers() {
    logger.info("Controller:" + this.getClass().getName());
    return service.getUsers();
  }

  /**
   * ユーザ一覧取得.
   *
   * @return
   */
  @RequestMapping(value = Constants.PATH_RELATIVE_GET_USER, method = RequestMethod.GET)
  public User getUser(@PathVariable int id) {
    logger.info("Controller:" + this.getClass().getName());
    return service.getUser(id);
  }

}
