
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) ->{

            return new ModelAndView(new HashMap(), "hello.hbs");

        }, new HandlebarsTemplateEngine());

    }
}