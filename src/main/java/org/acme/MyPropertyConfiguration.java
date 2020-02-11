package org.acme;

import io.quarkus.arc.config.ConfigProperties;

// Using convention over configuration, the default
// prefix is "property" because "Configuration" is dropped
// and the resulting "Property" is shifted to lowercase.
// 
// However, this class is named MyPropertyConfiguration.
// The convention is similar in that the prefix drops
// "Configuration". However, the resulting camel-case
// MyProperty becomes "my-property".

@ConfigProperties //(prefix = "property")
public class MyPropertyConfiguration {

	// "Java" is a default value that can be overriden
	// by defining a property
    String  name = "Java";
    boolean student;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
}