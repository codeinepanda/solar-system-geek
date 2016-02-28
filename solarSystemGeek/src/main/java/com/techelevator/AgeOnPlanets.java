package com.techelevator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
 
public class AgeOnPlanets extends HttpServlet {
    
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String planet = request.getParameter("planetMultiplier");
		Integer age = Integer.parseInt(request.getParameter(("userAge")));
		
		if (planet.equals("Mercury")) {
			double ageOnPlanet = age*4.15;
			response.getWriter().println("Your age on Mercury would be "+ageOnPlanet );

		}
		if (planet.equals("Venus")) {
			double ageOnPlanet = age*1.63;
			response.getWriter().println("Your age on Venus would be "+ageOnPlanet );

		}
		if (planet.equals("Earth")) {
			int ageOnPlanet = age;
			response.getWriter().println("Your age on Earth is "+ageOnPlanet );

		}
		if (planet.equals("Mars")) {
			double ageOnPlanet = age*0.53;
			response.getWriter().println("Your age on Mars would be "+ageOnPlanet );

		}
		if (planet.equals("Jupiter")) {
			double ageOnPlanet = age*0.08;
			response.getWriter().println("Your age on Jupiter would be "+ageOnPlanet );

		}
		if (planet.equals("Saturn")) {
			double ageOnPlanet = age*0.03;
			response.getWriter().println("Your age on Saturn would be "+ageOnPlanet );

		}
		if (planet.equals("Uranus")) {
			double ageOnPlanet = age*0.012;
			response.getWriter().println("Your age on Uranus would be "+ageOnPlanet );

		}
		if (planet.equals("Neptune")) {
			double ageOnPlanet = age*0.006;
			response.getWriter().println("Your age on Neptune would be "+ageOnPlanet );

		}
		if (planet.equals("Pluto")) {
			double ageOnPlanet = age*0.004;
			response.getWriter().println("Pluto is no longer a planet but you would weigh "+ageOnPlanet );

		}
		else if (planet == null ^ planet == "") {
			response.getWriter().println("Whatever");
		}
		
    }
}