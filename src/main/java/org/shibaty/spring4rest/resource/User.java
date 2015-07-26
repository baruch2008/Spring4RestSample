/**
 *
 */
package org.shibaty.spring4rest.resource;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yasutaka
 *
 */
@XmlRootElement
public class User implements Serializable {

  /**
   *
   */
  private int id;

  /**
   *
   */
  private String firstName;

  /**
   *
   */
  private String lastName;

  /**
   *
   */
  public User() {
    // nop
  }

  /**
   * @param id
   * @param firstName
   * @param lastName
   */
  public User(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return id
   */
  @XmlAttribute
  public int getId() {
    return id;
  }

  /**
   * @param id セットする id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return firstName
   */
  @XmlElement
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName セットする firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return lastName
   */
  @XmlElement
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName セットする lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /* (非 Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
  }

}
