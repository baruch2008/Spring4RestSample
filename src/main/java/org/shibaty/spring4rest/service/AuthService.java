/**
 *
 */
package org.shibaty.spring4rest.service;

import org.shibaty.spring4rest.resource.Auth;
import org.springframework.stereotype.Service;

/**
 * @author Yasutaka
 *
 */
@Service
public class AuthService {

  /**
   *
   * @param auth
   * @return
   */
  public Auth login(Auth auth) {
    auth.setAuthenticationToken("abc");
    return auth;
  }

  /**
   *
   * @param auth
   * @return
   */
  public Auth logout(Auth auth) {
    return auth;
  }

}
