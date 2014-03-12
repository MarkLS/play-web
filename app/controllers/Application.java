package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Welcome to this webshop"));
	}

	public static Result products() {
		return ok(views.html.products.render("These are my products"));
	}

	public static Result category() {
		return ok(category.render("These are my categories"));
	}

	public static Result user() {
		return ok(user.render("We welcome you as the new user"));
	}

	public static Result shoppingbasket() {
		return ok(shoppingbasket.render("Your shoppingbasket is empty"));
	}

	public static Result login() {
		return ok(login.render("Please login"));

	}
}
