package com.flipkart.app;

import java.util.*;
import com.flipkart.bean.User;
import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;

public class GymFlipFitAdminMenu {

    public void displayMenu(User user, Scanner in) {
        int menuOption = 1;
        List<GymOwner> gymOwnerList = new ArrayList<>();
        List<Gym> gymList = new ArrayList<>();
        do {
            System.out.println("\n\n --------------- Admin Menu Options --------------- ");
            System.out.println("Gym Owner Options:");
            System.out.println("\tPress 1. View Pending Registration Request");
            System.out.println("\tPress 2. Approve/Reject Registration");
            System.out.println("\tPress 3. Approve ALL Pending Registration Requests");
            System.out.println("Gym Options:");
            System.out.println("\tPress 4. View Pending Gym Registration");
            System.out.println("\tPress 5. Approve/Reject Gym Registration");
            System.out.println("\tPress 6. Approve ALL Gym Registration Requests");
            System.out.println("Press 7. Quit");
            System.out.print("Enter your choice: ");
            menuOption = in.nextInt();
            in.nextLine(); // Consume newline

            switch (menuOption) {
                case 1:
                    gymOwnerList = getPendingGymOwnerApprovals();
                    System.out.println("UserID\tUsername\tName\tAadhar Card #\tGSTIN#\t\t\tPAN Card\tAddress\t\tPincode");
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    gymOwnerList.forEach(gymOwner -> System.out.println(gymOwner.getUserID() + "\t" + gymOwner.getUserName() + "\t\t"
                            + gymOwner.getName() + "\t" + gymOwner.getAadharCard() + "\t" + gymOwner.getGstIN()
                            + "\t\t" + gymOwner.getPanCard() + "\t" + gymOwner.getAddress()
                            + "\t" + gymOwner.getPINCode()));
                    break;
                case 2:
                    System.out.println("Enter gym owner user id");
                    int gymOwnerId = in.nextInt();
                    System.out.println("Press 1. Approve\nPress 2. Reject\n");
                    int newStatus = in.nextInt();
                    handleGymOwnerRequest(gymOwnerId, newStatus);
                    break;
                case 3:
                    approveAllGymOwners();
                    break;
                case 4:
                    gymList = getPendingGymRegistrationRequests();
                    System.out.println("GymID\tName\tLocation\t# of seats");
                    System.out.println("-----------------------------------------------------------");
                    gymList.forEach(gym -> System.out.println(gym.getGymID() + "\t" + gym.getGymName() + "\t" + gym.getLocation() + "\t\t" + gym.getNoOfSeats()));
                    break;
                case 5:
                    System.out.println("Enter gym id");
                    int gymId = in.nextInt();
                    System.out.println("Press 1. Approve\nPress 2. Reject\n");
                    newStatus = in.nextInt();
                    handleGymRegistrationRequest(gymId, newStatus);
                    break;
                case 6:
                    approveAllGymRegistrationRequests();
                    break;
                case 7:
                    System.out.println("Exiting Admin Menu..");
                    break;
                default:
                    System.out.println("You have selected invalid option please try again!!");
                    break;
            }
        } while (menuOption != 7);
    }

    // Dummy methods to simulate actual functionality
    private List<GymOwner> getPendingGymOwnerApprovals() {
        // Simulate fetching pending gym owner approvals
        List<GymOwner> list = new ArrayList<>();
        list.add(new GymOwner(1, "john_doe", "John Doe", "1234-5678-9123", "GSTIN1234", "PAN1234", "Address 1", "560001"));
        list.add(new GymOwner(2, "jane_doe", "Jane Doe", "9876-5432-1987", "GSTIN5678", "PAN5678", "Address 2", "560002"));
        return list;
    }

    private void handleGymOwnerRequest(int gymOwnerId, int newStatus) {
        // Simulate handling gym owner request
        System.out.println("Gym owner request for ID " + gymOwnerId + " has been " + (newStatus == 1 ? "approved" : "rejected") + ".");
    }

    private void approveAllGymOwners() {
        // Simulate approving all gym owners
        System.out.println("All pending gym owner registration requests have been approved.");
    }

    private List<Gym> getPendingGymRegistrationRequests() {
        // Simulate fetching pending gym registration requests
        List<Gym> list = new ArrayList<>();
        list.add(new Gym());
        list.add(new Gym());
        return list;
    }

    private void handleGymRegistrationRequest(int gymId, int newStatus) {
        // Simulate handling gym registration request
        System.out.println("Gym registration request for ID " + gymId + " has been " + (newStatus == 1 ? "approved" : "rejected") + ".");
    }

    private void approveAllGymRegistrationRequests() {
        // Simulate approving all gym registration requests
        System.out.println("All pending gym registration requests have been approved.");
    }
}
