/**
 *
 */

package org.shibaty.spring4rest.resource;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yasutaka
 */
@XmlRootElement
public class Auth implements Serializable {

  public String userId;

  public String password;

  public String AuthenticationToken;

  /**
   *
   */
  public Auth() {
    // nop
  }

  /**
   * @param userId
   * @param password
   * @param authenticationToken
   */
  public Auth(String userId, String password, String authenticationToken) {
    this.userId = userId;
    this.password = password;
    AuthenticationToken = authenticationToken;
  }

  /**
   * @return userId
   */
  @XmlElement(required=false)
  public String getUserId() {
    return userId;
  }

  /**
   * @param userId セットする userId
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * @return password
   */
  @XmlElement(required=false)
  public String getPassword() {
    return password;
  }

  /**
   * @param password セットする password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return authenticationToken
   */
  @XmlElement(required=false)
  public String getAuthenticationToken() {
    return AuthenticationToken;
  }

  /**
   * @param authenticationToken セットする authenticationToken
   */
  public void setAuthenticationToken(String authenticationToken) {
    AuthenticationToken = authenticationToken;
  }

  /*
   * (非 Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Auth [userId=" + userId + ", password=" + password + ", AuthenticationToken="
        + AuthenticationToken + "]";
  }

}
