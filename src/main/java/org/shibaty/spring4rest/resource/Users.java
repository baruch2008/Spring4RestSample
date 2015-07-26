/**
 *
 */
package org.shibaty.spring4rest.resource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yasutaka
 *
 */
@XmlRootElement
public class Users implements Serializable {

  /**
   *
   */
  List<User> users;

  /**
   *
   */
  public Users() {
    this.users = new ArrayList<User>();
  }

  /**
   * @param users
   */
  public Users(List<User> users) {
    this.users = users;
  }

  /**
   * @return users
   */
  @XmlElementRef
  public List<User> getUsers() {
    return users;
  }

  /**
   * @param users セットする users
   */
  public void setUsers(List<User> users) {
    this.users = users;
  }

  /* (非 Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Users [users=" + users + "]";
  }

}
