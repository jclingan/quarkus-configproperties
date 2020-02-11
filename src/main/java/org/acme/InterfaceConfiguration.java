package org.acme;

import java.util.List;
import java.util.Optional;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.arc.config.ConfigProperties;

// Inject ifc.age, ifc.gpa, and ifc.grades defined
// in application.properties

@ConfigProperties(prefix = "ifc")
public interface InterfaceConfiguration {
    // @ConfigProperty required since "age" does not follow
    // the 'getter' bean namenig convention.

    @ConfigProperty(name = "age")
    int age();

    Optional<Float> getGpa();

    // Use @ConfigProperty to assign default values
    @ConfigProperty(defaultValue = "B,B+,C,A-")
    List<String> getGrades();
}