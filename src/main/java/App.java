import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) ->
                "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>Hello Friend!</title>" +
                "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                "</head>" +
                "<body>" +
                "<h1>Hello From Afar</h1>" +
                "<p>Dear Friend,</p>" +
                "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in the Iceland while I learn programming! </p>" +
                "<p>Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
                "<p>But I like programming a lot, so I've got that going for me. </p>" +
                "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. </p>" +
                        "<p><a href='/favorite_photos' >P.S. Check this mama out.</a></p>" +
                "<p>Cheers,</p>" +
                "<p>Travel Enthusiast Jane</p>" +
                "</body>" +
                "</html>"
        );
        get("/favorite_photos", (request, response) ->
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "<title>Hello Friend!</title>" +
                        "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                        "</head>" +
                        "<body>" +
                        "<h1>Found the kind of women you like</h1>" +
                        "<ul>" +
                        "<li><img src='/images/BlackB.jpg' alt='Did you one better.'/></li>" + "</ul>" + "</body>" + "</html>"
        );
    }
}