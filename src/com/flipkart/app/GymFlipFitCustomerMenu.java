package com.flipkart.app;
import java.util.*;

import com.flipkart.bean.Gym;
import com.flipkart.bean.User;

public class GymFlipFitCustomerMenu {
	
    public void displayMenu(User user, Scanner in) {
    	List<Gym> gymList = new ArrayList<>();
    	gymList.add(new Gym("Gold's Gym","New York"));
    	gymList.add(new Gym("Planet Fitness","Los Angeles"));
    	gymList.add(new Gym("Anytime Fitness", "Chicago"));
    	gymList.add(new Gym("24 Hour Fitness", "Houston"));
    	// Add more gyms as needed

    	
        int menuOption = 1;
        do {
            System.out.println("\n\n ------ Customer Menu Options ------ ");
            System.out.println("1. View available gyms");
            System.out.println("2. Book a slot");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View my bookings");
            System.out.println("5. View Profile");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            menuOption = in.nextInt();
            in.nextLine(); // Consume newline

            switch (menuOption) {
                case 1:
                    System.out.println("GymID\tGymName\t\tLocation");
                    System.out.println("-----------------------------------------------------------");
                    gymList.forEach(gym -> System.out.println(gym.getGymID() + "\t" + gym.getGymName() + "\t" + gym.getLocation() + "\t\t" ));
                    break;
                case 2:
                    System.out.println("\n********************* Available Slots ****************\n");
                    System.out.println("Slot No.\tTimings(24hrs)\t\tGymID\n------------------------------------------------------");
                    System.out.println("1\t\t10:00-11:00\t\t1");
                    System.out.println("2\t\t11:00-12:00\t\t1");
                    System.out.println("Please enter the slot number you want to book: ");
                    int slotIndex = in.nextInt();
                    if (slotIndex > 0 && slotIndex <= 2) {
                        System.out.println("Slot booked successfully.");
                    } else {
                        System.out.println("Unknown Slot!");
                    }
                    break;
                case 3:
                    System.out.println("\n********************* Your Bookings ****************\n");
                    System.out.println("Booking No.\tTimings(24hrs)\t\tGymID\n------------------------------------------------------");
                    System.out.println("1\t\t10:00-11:00\t\t1");
                    System.out.println("\nPlease enter the booking number to be cancelled: ");
                    int bookingIndex = in.nextInt();
                    if (bookingIndex == 1) {
                        System.out.println("Booking cancelled successfully.");
                    } else {
                        System.out.println("No such booking number exists!");
                    }
                    break;
                case 4:
                    System.out.println("\n********************* Your Bookings ****************\n");
                    System.out.println("Booking No.\tTimings(24hrs)\t\tGymID\n------------------------------------------------------");
                    System.out.println("1\t\t10:00-11:00\t\t1");
                    break;
                case 5:
                    System.out.println("Profile details:");
                    System.out.println("Username: " + user.getUsername());
                    System.out.println("Role: " + user.getRole());
                    break;
                case 6:
                    System.out.println("You have exited the customer menu");
                    break;
                default:
                    System.out.println("You have selected an invalid option, please try again!!");
                    break;
            }
        } while (menuOption != 6);
    }
}
