package controllers;

import play.Logger;
import play.mvc.Controller;
//test2
public class Dashboard extends Controller
{
  public static void index() {
    Logger.info("Rendering Dashboard");
    render ("dashboard.html");
  }
}
