package com.techelevator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WeightOnPlanets extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer weight = Integer.parseInt(request.getParameter(("userWeight")));
		String planet = request.getParameter("planetMultiplier");

		if (planet.equals("null") && weight.equals(0)) {
			response.getWriter().println("Hey wise guy enter your weight and choose a planet");
		} 
		else if (weight.equals(0)) {
			response.getWriter().println("Hey wise guy enter your weight");
		}
		else if (planet.equals("null")) {
			response.getWriter().println("Choose a planet");
		}
		

		else if (planet.equals("Mercury")) {
			double weightOnPlanet = weight * 0.37;
			response.getWriter().println("Your weight on Mercury would be " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Venus")) {
			double weightOnPlanet = weight * 0.90;
			response.getWriter().println("Your weight on Venus would be " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Earth")) {
			int weightOnPlanet = weight;
			response.getWriter().println("Your weight on Earth is " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Mars")) {
			double weightOnPlanet = weight * 0.38;
			response.getWriter().println("Your weight on Mars would be " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Jupiter")) {
			double weightOnPlanet = weight * 2.65;
			response.getWriter().println("Your weight on Jupiter would be " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Saturn")) {
			double weightOnPlanet = weight * 1.13;
			response.getWriter().println("Your weight on Saturn would be " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Uranus")) {
			double weightOnPlanet = weight * 1.09;
			response.getWriter().println("Your weight on Uranus would be " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Neptune")) {
			double weightOnPlanet = weight * 1.43;
			response.getWriter().println("Your weight on Neptune would be " + weightOnPlanet + " Lbs");

		}
		else if (planet.equals("Pluto")) {
			double weightOnPlanet = weight * 0.04;
			response.getWriter().println("Pluto is no longer a planet but you would weigh " + weightOnPlanet + " Lbs");

		}

	}
}