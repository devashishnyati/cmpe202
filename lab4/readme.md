# CRC CARDS


### **Customer**
* **Responsibilities:**
    * Requests for table
    * Gives name, contact number and no of people 
    * Receives messages
    * Cancel or Confirm Booking
* **Collaborators:**
    * Booking System 
    * Messaging System

### **Messaging System**
* **Responsibilities:**
    * Sends Message 
    * Receives Message
* **Collaborators:**
    * Customer
    * Messaging System

### **Booking System**
* **Responsibilities:**
    * Registers customer
    * Add customers in queue 
    * Checks availability
    * Checks no of seat
    * Allocate a table
    * Remove customers from queue 
    * Cancel Booking
    * Confirm Booking
* **Collaborators:**
    * Customer 
    * Messaging System 
    * Table


### **Table**
* **Responsibilities:**
    * Sets availability
    * Has number of seats
* **Collaborators:**
    * Customer
    * Messaging System

### **Allocated Table**
* **Responsibilities:**
    * Change availability to allocated 
    * Waits for table to get vacant
* **Collaborators:**
    * Table
    * Booking System

### **Vacant Table**
* **Responsibilities:**
    * Change availability to available 
    * Waits for allocation
* **Collaborators:**
    * Table
    * Booking System


# Design Patters

1. **Observer Pattern:** Since all the customers are notified automatically as soon as they are added to the booking system and whenever the table is empty and they match the requirements with their queue position.
    * Objects: Booking System, Customer
2. **State Pattern:** Since the state availability changes according to the allocated table or vacant table and according to this state booking system takes action.
    * Objects: Vacant Table, Allocated Table, Booking System