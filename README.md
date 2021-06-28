# Car-Showroom
A java console based application to manage a car showroom

## Problem
  A vehicle showroom has some particular type vehcles e.g. normal, sports and heavy vehicles. They all share some common behaviour of a vehicle and except normal other veichles have some extra properties.
  The task was to design a vehicle showroom which has following properties:
   - User can add any type of vehicle
   - User can remove any vehicle
   - Prints all the details of vehicles currently have in showroom
   - usual visitor expected count is 30.But when a sports vehicle is added visitor count is increased by 20.
   

### Solution
  Solution has some following properties:
  - An abstract Vehicle class to store common behaviours of different types of vehicles.
  - Classes for different types of vehicles for their extra properties extending the Vehicle class.
  - An arrayList was used to store the added vehicles.
  - User can remove any vehicle using the model number.
  - A tabular, proper format to print all the details of the vehicles.
  - A nice, clean input system is added.
  - Operations for arraylist is added in another class to ensure reusability and prim format.
  - Well-organised and properly documented.
  - Maintained with clean code perspective.
  

# How to Run:
Open the terminal or cmd in the folder and type the follwing:
```sh
javac Showroom.java
java Showroom
```
