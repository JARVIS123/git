package controllers;
import models.PrintDao;
import play.*;
import play.mvc.*;

import views.html.*;

public class Print extends Controller {
    public Result printing() {
        PrintDao obj = new PrintDao();
        int y = obj.testingModel();
        return ok(print.render(y));
    }
}