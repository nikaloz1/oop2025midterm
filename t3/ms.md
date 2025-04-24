# Parking Management System
Masterclass in Java

## Description
Create Parking Management System (PMS) in Java. PMS is widely used software. It can be any complexity. Our example is a basic one, which has the following features:

1. storage for parking spots
2. ability to add a vehicle to the parking
3. ability to remove a vehicle from the parking
4. ability to print the parking information on the console

## PMS Structure
We will need the following classes for the software:

1. Vehicle - the vehicle itself
2. PMS - parking management system
3. ParkingTester - the tester class. This class will be used to test our management system.

### Class Vehicle
```java
String plateNumber
String type
```

### Class PMS
```java
List <Vehicle> storage
void addVehicle(Vehicle)
boolean removeVehicle(Vehicle)
void printStorage()
```

## New Feature
The system includes a spot availability checker that allows users to:
- Check if specific parking spots are available
- Get notifications when spots become available
- Reserve spots for specific time periods 