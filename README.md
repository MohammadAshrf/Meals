# Meals Application

This is an Android Kotlin application built using Clean Architecture and best practices. The application has one screen, which is the mealsList, where users can view a list of meals in a RecyclerView.

## Architecture

The application follows the Onion Architecture, as described by Uncle Bob in his blog post [The Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html). The Onion Architecture is a software architecture pattern that separates software into layers, with each layer having specific responsibilities.

The application has three layers:

- **Domain Layer**: This layer is responsible for executing business logic that is independent of any layer and is just a pure Kotlin package with no Android-specific dependency.

- **Data Layer**: This layer dispenses the required data for the application to the domain layer by implementing the interface exposed by the domain.

- **App Layer**: This layer includes both the domain and data layers and is Android-specific, executing the UI logic.

The following diagram illustrates the architecture of the application:

![architecture](https://github.com/Alinasser96/Brandz/blob/master/pics/arch.jpg)

## Dependency Injection 

Dependency injection is implemented using Dagger Hilt, which is a lightweight dependency injection framework for Android that reduces boilerplate code and makes it easy to integrate with Android components.

## Conclusion

This application is built using best practices and is organized in a way that is easy to understand and maintain. The implementation of Clean Architecture and Dagger Hilt makes the application scalable, maintainable, and testable. 

## **Thanks!**
