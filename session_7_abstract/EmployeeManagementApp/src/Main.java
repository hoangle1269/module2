import src.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManagement staffManagement = new StaffManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Staff");
            System.out.println("2. Remove Staff");
            System.out.println("3. Update Staff");
            System.out.println("4. Display Staff Count");
            System.out.println("5. Display Staff by Type");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Staff Type (Office/Factory/Delivery): ");
                    String staffType = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String position = scanner.nextLine();

                    if ("Office".equalsIgnoreCase(staffType)) {
                        staffManagement.addStaff(new OfficeStaff(id, name, phone, position));
                    } else if ("Factory".equalsIgnoreCase(staffType)) {
                        System.out.print("Enter Factory ID: ");
                        int factoryId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter Type: ");
                        String type = scanner.nextLine();
                        staffManagement.addStaff(new FactoryStaff(id, name, phone, position, factoryId, type));
                    } else if ("Delivery".equalsIgnoreCase(staffType)) {
                        System.out.print("Enter Vehicle Type: ");
                        String vehicleType = scanner.nextLine();
                        staffManagement.addStaff(new DeliveryStaff(id, name, phone, position, vehicleType));
                    } else {
                        System.out.println("Invalid staff type");
                    }
                    break;
                case 2:
                    System.out.print("Enter ID of staff to remove: ");
                    int removeId = scanner.nextInt();
                    staffManagement.removeStaff(removeId);
                    break;
                case 3:
                    System.out.print("Enter ID of staff to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Phone: ");
                    String newPhone = scanner.nextLine();
                    System.out.print("Enter New Position: ");
                    String newPosition = scanner.nextLine();
                    Staff updatedStaff = null;
                    for (Staff staff : staffManagement.getStaffList()) {
                        if (staff.getId() == updateId) {
                            if (staff instanceof OfficeStaff) {
                                updatedStaff = new OfficeStaff(updateId, newName, newPhone, newPosition);
                            } else if (staff instanceof FactoryStaff) {
                                System.out.print("Enter New Factory ID: ");
                                int newFactoryId = scanner.nextInt();
                                scanner.nextLine(); // consume newline
                                System.out.print("Enter New Type: ");
                                String newType = scanner.nextLine();
                                updatedStaff = new FactoryStaff(updateId, newName, newPhone, newPosition, newFactoryId, newType);
                            } else if (staff instanceof DeliveryStaff) {
                                System.out.print("Enter New Vehicle Type: ");
                                String newVehicleType = scanner.nextLine();
                                updatedStaff = new DeliveryStaff(updateId, newName, newPhone, newPosition, newVehicleType);
                            }
                            break;
                        }
                    }
                    if (updatedStaff != null) {
                        staffManagement.updateStaff(updatedStaff);
                    } else {
                        System.out.println("Staff not found");
                    }
                    break;
                case 4:
                    staffManagement.displayStaffCount();
                    break;
                case 5:
                    System.out.print("Enter Staff Type to Display (Office/Factory/Delivery): ");
                    String displayType = scanner.nextLine();
                    staffManagement.displayStaffByType(displayType);
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
