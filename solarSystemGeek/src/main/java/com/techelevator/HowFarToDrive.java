package com.techelevator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HowFarToDrive extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		double age = Integer.parseInt(request.getParameter("userAge"));
		String planet = request.getParameter("planetMultiplier");
		String transportMode = request.getParameter("modeOfTransportation");
		double transportMPH = 0;
		if (transportMode.equals("walking")){
			transportMPH = 3;
		}
		if (transportMode.equals("car")){
			transportMPH = 100;
		}
		if (transportMode.equals("bullet")){
			transportMPH = 200;
		}
		if (transportMode.equals("plane")){
			transportMPH = 570;
		}
		if (transportMode.equals("superPlane")){
			transportMPH = 1350;
		}

		if (planet.equals("null") && transportMode == "null") {
			response.getWriter().println("Hey wise guy choose a mode of transportation and a planet");
		} 
		else if (transportMode == "null") {
			response.getWriter().println("Hey wise guy choose a mode of transportation");
		}
		
		else if (planet.equals("null")) {
			response.getWriter().println("Choose a planet");
		}
		

		else if (planet.equals("Mercury")) {
			long timeToPlanet = (long) (56974146/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));
			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);


		}
		else if (planet.equals("Venus")) {
			long timeToPlanet = (long) (25724767/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));
			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);

		}
		
		else if (planet.equals("Mars")) {
			double timeToPlanet =  (48678219/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));

			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);
		}
		else if (planet.equals("Jupiter")) {
			double timeToPlanet =  (390674710/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));
			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);

		}
		else if (planet.equals("Saturn")) {
			double timeToPlanet =  (792248270/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));
			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);

		}
		else if (planet.equals("Uranus")) {
			double timeToPlanet =  (1692662530/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));
			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);

		}
		else if (planet.equals("Neptune")) {
			double timeToPlanet =  (2703959960l/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));
			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);

		}
		else if (planet.equals("Pluto")) {
			double timeToPlanet = (4600000000l/transportMPH);
			long ageAfterTravel = (long) (age+((timeToPlanet/8760)));
			response.getWriter().println("It would take you " + timeToPlanet + " hours to travel to "+planet+" by "+transportMode+". Your age would be "+ageAfterTravel);

		}		
		
	}
}
