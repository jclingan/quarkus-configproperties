package org.acme;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/property")
public class PropertyResource {

    @Inject
    MyPropertyConfiguration config;

    @Inject
    InterfaceConfiguration ifc;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Map<String,Object> hello() {
        HashMap<String,Object> map = new HashMap<String,Object>();

        map.put("name", config.getName());
        map.put("student", config.isStudent());

        map.put("age", ifc.age());
        map.put("gpa", ifc.getGpa().orElse(4.0f));
        map.put("grades", ifc.getGrades());

        return map;
    }
}