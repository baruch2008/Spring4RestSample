/**
 *
 */

package org.shibaty.spring4rest.authentication;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Yasutaka
 */
public class UserDetailsImpl implements UserDetails {

  /*
   * (非 Javadoc)
   * @see
   * org.springframework.security.core.userdetails.UserDetails#getAuthorities()
   */
  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    // TODO 自動生成されたメソッド・スタブ
    return null;
  }

  /*
   * (非 Javadoc)
   * @see
   * org.springframework.security.core.userdetails.UserDetails#getPassword()
   */
  @Override
  public String getPassword() {
    // TODO 自動生成されたメソッド・スタブ
    return null;
  }

  /*
   * (非 Javadoc)
   * @see
   * org.springframework.security.core.userdetails.UserDetails#getUsername()
   */
  @Override
  public String getUsername() {
    // TODO 自動生成されたメソッド・スタブ
    return null;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#
   * isAccountNonExpired()
   */
  @Override
  public boolean isAccountNonExpired() {
    // TODO 自動生成されたメソッド・スタブ
    return false;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#
   * isAccountNonLocked()
   */
  @Override
  public boolean isAccountNonLocked() {
    // TODO 自動生成されたメソッド・スタブ
    return false;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#
   * isCredentialsNonExpired()
   */
  @Override
  public boolean isCredentialsNonExpired() {
    // TODO 自動生成されたメソッド・スタブ
    return false;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
   */
  @Override
  public boolean isEnabled() {
    // TODO 自動生成されたメソッド・スタブ
    return false;
  }

}
