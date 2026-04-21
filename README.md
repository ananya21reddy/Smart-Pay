# SmartPay Utility Billing System

## Overview

SmartPay is a Java-based console application designed to calculate electricity bills based on unit consumption. The system applies slab-based pricing and includes a fixed tax percentage to generate a final bill along with a formatted digital receipt.

---

## Features

* Slab-based electricity billing system
* Automatic tax calculation (10%)
* Input validation for meter readings
* Interactive command-line interface
* Continuous billing support for multiple customers
* Formatted digital receipt generation

---

## Billing Logic

### Unit Pricing

* 0–100 units: ₹1 per unit
* 101–300 units: ₹2 per unit
* Above 300 units: ₹5 per unit

### Tax

* 10% applied on total bill amount

---

## How It Works

1. User enters:

   * Customer name
   * Previous meter reading
   * Current meter reading

2. The system:

   * Calculates units consumed
   * Applies slab-based pricing
   * Adds 10% tax
   * Displays a formatted receipt

---

## How to Run

1. Compile the program:

```bash id="a1s8pw"
javac UtilityBiller.java
```

2. Run the program:

```bash id="m4j9de"
java UtilityBiller
```

---

## Sample Output

```id="z5u3yb"
===== Welcome to SmartPay Utility Billing System =====

Enter Customer Name: Ananya
Enter Previous Meter Reading: 120
Enter Current Meter Reading: 250

========= DIGITAL RECEIPT =========
Customer Name   : Ananya
Units Consumed  : 130
Tax Amount (10%): rs.26.00
Final Total     : rs.286.00
===================================
```

---

## Project Structure

```id="3pn9v9"
Smart-Pay/
│── src/
│   └── UtilityBiller.java
│── README.md
```

---

## Error Handling

* Prevents invalid meter readings (previous > current)
* Handles incorrect input formats
* Ensures smooth user interaction

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)

---

## Future Enhancements

* Add GUI for better user experience
* Store billing history in a file or database
* Support different tariff plans
* Generate downloadable receipts

---

## Author

Ananya Reddy
