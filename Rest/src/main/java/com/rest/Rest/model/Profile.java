package com.rest.Rest.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
 private long id;
 private String profilrname;
 private String firstName;
 private String lastName;
 private Date created;
 
 public Profile() {
	 
 }

public Profile(long id, String profilrname, String firstName, String lastName, Date created) {
	super();
	this.id = id;
	this.profilrname = profilrname;
	this.firstName = firstName;
	this.lastName = lastName;
	this.created = created;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getProfilrname() {
	return profilrname;
}

public void setProfilrname(String profilrname) {
	this.profilrname = profilrname;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Date getCreated() {
	return created;
}

public void setCreated(Date created) {
	this.created = created;
}


}
