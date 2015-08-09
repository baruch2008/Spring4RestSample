/**
 *
 */
package org.shibaty.spring4rest.authentication;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author Yasutaka
 *
 */
@Component
public class UserDetailServiceImpl implements UserDetailsService {

  /* (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
   */
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    UserDetailsImpl user = new UserDetailsImpl();

    // TODO authentication

    return user;
  }

}
