public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        User user = new Member("john_doe");
        System.out.println(user.getDescription());  // Output: User: john_doe
        System.out.println(user.getPrivileges());   // Output: [read, write]

        // Add a badge to the user
        User userWithBadge = new BadgeDecorator(user, "Gold");
        System.out.println(userWithBadge.getDescription());  // Output: User: john_doe, Badge: Gold
        System.out.println(userWithBadge.getPrivileges());   // Output: [read, write]

        // Add a privilege to the user
        User userWithPrivilege = new PrivilegeDecorator(user, "delete");
        System.out.println(userWithPrivilege.getDescription());  // Output: User: john_doe
        System.out.println(userWithPrivilege.getPrivileges());   // Output: [read, write, delete]

        // Add both badge and privilege to the user
        User userWithBadgeAndPrivilege = new PrivilegeDecorator(new BadgeDecorator(user, "Silver"), "moderate");
        System.out.println(userWithBadgeAndPrivilege.getDescription());  // Output: User: john_doe, Badge: Silver
        System.out.println(userWithBadgeAndPrivilege.getPrivileges());   // Output: [read, write, moderate]
    }
}