/**
 *
 */
package org.shibaty.spring4rest.controller;

import org.shibaty.spring4rest.Constants;
import org.shibaty.spring4rest.resource.Auth;
import org.shibaty.spring4rest.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yasutaka
 *
 */
@RestController
@RequestMapping(value =Constants.PATH_AUTH, produces = MediaType.APPLICATION_XML_VALUE)
public class AuthController {

  /**
   *
   */
  @Autowired
  private AuthService service;

  /**
   *
   * @param auth
   * @return
   */
  @RequestMapping(method = RequestMethod.POST)
  public Auth login(@ModelAttribute Auth auth) {
    return service.login(auth);
  }

  /**
   *
   * @param auth
   * @return
   */
  @RequestMapping(method = RequestMethod.DELETE)
  public Auth logout(@ModelAttribute Auth auth) {
    return service.logout(auth);
  }
}
