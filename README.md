# Meals Application
Android Kottlin Application that build in Clean Architecture and best practisies.
## Summary
In this Application we have 1 screen
1. mealsList: that have a list of meals in a RecyclerView.
## Architecture
We follow the [Onion Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)\
So we have 3 layers:
- **Domain layer**:
Would execute business logic which is independent of any layer and is just a pure kotlin package with no android specific dependency.

- **Data layer**:
Would dispense the required data for the application to the domain layer by implementing interface exposed by the domain

- **App layer**:  
Would include both domain and data layer and is android specific which executes the UI logic.

![arch](https://github.com/Alinasser96/Brandz/blob/master/pics/arch.jpg)

## Dependency Injection 
We use Dagger Hilt to apply Dependency Injection

## **Thanks!**
