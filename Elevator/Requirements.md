- R1: There exist multiple elevator cars and floors in the building.
- R2: The building can have a maximum of 15 floors and three elevators.
- R3: The elevator car can move up or down or be in an idle state.
- R4: The elevator door can only be opened when it is in an idle state.
- R5: Every elevator car passes through each floor.
- R6: The panel outside the elevator should have buttons to call an elevator car and to specify
whether the passenger wants to go up or down.
- R7: The panel inside the elevator should have buttons to go to every floor. There should be
buttons to open or close the lift doors.
- R8: There should be a display inside and outside the elevator car to show the current floor number
and direction of the elevator car.
- R9: The display inside the elevator should also show the capacity of the elevator car.
- R10: Each floor has a separate panel and a display for each elevator car.
- R11: Multiple passengers can go to the same or different floors in the same or opposite direction.
- R12: The elevator system should be able to control the elevator car movement and the door
functioning and monitor the elevator car.
- R13: The elevator control system should be able to send the most appropriate elevator to the
passenger when the passenger calls the elevator car.
- R14: The elevator car can carry a maximum of eight persons or 680 kilograms at once


##### Use Cases

- State Pattern:
  - Use case: Managing the different states of an elevator (e.g., idle, moving up, moving down, door open, door closed).
  - The state pattern allows the elevator to change its behavior based on its internal state, ensuring proper functioning and transitions between states.
- Command Pattern:
  - Use case: Encapsulating elevator requests (e.g., floor requests, door open/close requests) as objects.
  - The command pattern separates the request for an action from its execution, allowing requests to be queued, logged, or undone if needed.
- Mediator Pattern:
  - Use case: Facilitating communication and coordination between different components of the elevator system (e.g., floor controllers, elevator cars, scheduling system).
  - The mediator pattern promotes loose coupling by encapsulating the interactions between objects, allowing them to communicate through a central mediator.