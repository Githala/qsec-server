package pendzal.redbrotherhood;

import pendzal.redbrotherhood.Model.Person;

import java.util.regex.Pattern;
import com.google.gson.Gson;


import static spark.Spark.*;

public class Main {

  private static Gson gson = new Gson();

  public static void main(String[] args)
  {
    // set the server port to 8080
    port(8080);

    enableCORS("*", "*", "*");

    //get("/", (req, res) -> "Welcome to the qSec REST API.");



    get("/api/members", (req, res) -> Members.getMembers(), gson::toJson);
    get("/api/members/:id", (req, res) -> {

      String idString = req.params(":id");
      boolean isNumber = Pattern.matches("[0-9]+", idString);

      if (isNumber)
      {
        int id = Integer.parseInt(idString);
        Person person = Members.getMember(id);
        if (person != null) return person;
      }

      res.status(404);
      return null;
    }, gson::toJson);
  }

  // Enables CORS on requests. This method is an initialization method and should be called once.
  private static void enableCORS(final String origin, final String methods, final String headers) {

    options("/*", (request, response) -> {

      String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
      if (accessControlRequestHeaders != null) {
        response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
      }

      String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
      if (accessControlRequestMethod != null) {
        response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
      }

      return "OK";
    });

    before((request, response) -> {
      response.header("Access-Control-Allow-Origin", origin);
      response.header("Access-Control-Request-Method", methods);
      response.header("Access-Control-Allow-Headers", headers);
      // Note: this may or may not be necessary in your particular application
      response.type("application/json");
    });
  }
}
