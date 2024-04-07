StackOverflowSystem Requirements
We will focus on the following set of requirements while designing the parking
lot:
1. The parking lot should have multiple floors where customers can park
   their cars.
2. The parking lot should have multiple entry and exit points.
3. Customers can collect a parking ticket from the entry points and can pay
   the parking fee at the exit points on their way out.
4. Customers can pay the tickets at the automated exit panel or to the
   parking attendant.
5. Customers can pay via both cash and credit cards.
6. Customers should also be able to pay the parking fee at the customer’s
   info portal on each floor. If the customer has paid at the info portal, they
   don’t have to pay at the exit.
7. The system should not allow more vehicles than the maximum capacity
   of the parking lot. If the parking is full, the system should be able to show
   a message at the entrance panel and on the parking display board on the
   ground floor.
8. Each parking floor will have many parking spots. The system should
   support multiple types of parking spots such as Compact, Large,
   Handicapped, Motorcycle, etc.
9. The Parking lot should have some parking spots specified for electric
   cars. These spots should have an electric panel through which customers
   can pay and charge their vehicles.
10. The system should support parking for different types of vehicles like car,
    truck, van, motorcycle, etc.
11. Each parking floor should have a display board showing any free parking
    spot for each spot type.
12. The system should support a per-hour parking fee model. For example,
    customers have to pay $4 for the first hour, $3.5 for the second and third
    hours, and $2.5 for all the remaining hours.
13. The system should decide the parking floor and parking spot in that floor for the incoming vehicle.

##### To practice the various design patterns on ParkingLot
##### Use Cases

- Singleton Pattern: 
  - Use case: Ensuring a single instance of the parking lot management system.
  - The singleton pattern can be used to create a single instance of the parking lot controller, which coordinates the overall functioning of the parking lot.
- Factory Pattern:
  - Use case: Creating different types of parking spots (e.g., Large, handicapped, electric vehicle).
  - The factory pattern can be used to encapsulate the creation logic for different types of parking spots, allowing for easy extensibility and maintenance.
- Strategy Pattern:
  - Use case: Implementing different pricing strategies for parking fees.
  - The strategy pattern can be used to define various pricing algorithms (e.g., hourly, daily, monthly) and dynamically switch between them based on the parking duration or customer type.
- Observer Pattern:
  - Use case: Notifying relevant components or systems about parking events.
  - The observer pattern can be employed to notify other systems or components (e.g., display boards, mobile apps) when a parking spot becomes available or occupied.
- State Pattern:
  - Use case: Managing the state of a parking spot (e.g., available, occupied, reserved).
  - The state pattern can be used to represent and manage the different states of a parking spot, encapsulating the behavior associated with each state.
- Abstract Factory Pattern:
  - Use case: Creating families of related parking spot objects (e.g., compact spots, large spots, handicapped spots) for different parking floor configurations.
  - The abstract factory pattern can be used to provide an interface for creating families of related parking spot objects without specifying their concrete classes. This allows for the creation of different parking floor configurations with varying types of parking spots, while encapsulating the creation logic within the respective factory classes. It promotes flexibility, extensibility, and loose coupling between the client code and the concrete parking spot implementations.