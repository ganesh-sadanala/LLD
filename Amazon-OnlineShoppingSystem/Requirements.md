- Users should be able to add new products to sell.
- Users should be able to search for products by their name or category.
- Users can search and view all the products, but they will have to become a registered member to buy a product.
- Users should be able to add/remove/modify product items in their shopping cart.
- Users can check out and buy items in the shopping cart.
- Users can rate and add a review for a product.
- The user should be able to specify a shipping address where their order will be delivered.
- Users can cancel an order if it has not shipped.
- Users should get notifications whenever there is a change in the order or shipping status.
- Users should be able to pay through credit cards or electronic bank transfer.
- Users should be able to track their shipment to see the current state of their order.


#### Use Cases
##### Different Design Patterns used for different use cases

- Model-View-Controller (MVC Pattern)
  - Use case: Separating the user interface (View) from the business logic (Model) and the input handling (Controller).
  - Example: The product catalog page (View) displays the product information retrieved from the database (Model) based on user interactions (Controller).
- Factory Pattern:
  - Use case: Creating objects without explicitly specifying their exact class, allowing for flexibility and extensibility.
  - Example: Using a PaymentGatewayFactory to create different payment gateway objects (e.g., PayPal, Stripe) based on the selected payment method.
- Observer Pattern:
  - Use case: Establishing a one-to-many dependency between objects, where changes in one object trigger automatic notifications to its dependents.
  - Example: Notifying registered observers (e.g., order tracking system) when an order status changes.
- Decorator Pattern:
  - Use case: Dynamically adding new behaviors or responsibilities to an object without modifying its structure.
  - Example: Applying discounts or taxes to a product's price using decorators.