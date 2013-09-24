package controllers;

import models.flixster_user;

import org.codehaus.jackson.JsonNode;

import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
  
    public static Result index() {
        return ok("hello world");
    }
    
    @Transactional(readOnly=true)
    public static Result printUser(Long userId) {
        flixster_user user = flixster_user.findById(userId);
        JsonNode output = Json.toJson(user);
        return ok(output);
    }
  
}
