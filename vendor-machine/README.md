# Vendor Machine
A machine that takes cash from the customer and dispatches the respected products.

Asked to create a class diagram of the vendor machine.

## Requirements
1. It should have an interface to display available items.
2. It should accept the payment from the customer. ( only cash for now)
3. It should dispatch the requested products.
4. If the payment is more than the price of the requested product(s), then it should return the remaining amount.
5. Owner should be able to add the products to the vendor machine.
6. Owner should be able to remove the products to the vendor machine.

## Class Diagram
Based on the requirements, these are the required classes
1. VendorMachine
2. Item
3. Payment
4. Transaction

VendorMachine
- id: long
- items: Map<Item, Integer> 
- isWorking: boolean

Item
- id: long
- name: String
- price: double

Transaction
- id: long
- requestedItemsWithQuantity: Map<Item, Integer>
- TotalAmount: double

Payment
- id: long
- totalAmount: double
- paymentStatus: PaymentStatus

PaymentStatus
- PENDING FAILED COMPLETED



