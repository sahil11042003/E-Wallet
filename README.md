Welcome to the E-Wallet Microservices Application! This project embodies a robust and feature-rich electronic wallet system built using a microservices architecture. It offers users a seamless experience for managing their financial transactions, enabling secure money transfers, and staying updated with their account activities.

Features/Functionalities:

Money Transfer: Users can effortlessly transfer money to other users within the system, ensuring quick and convenient transactions.
Account Management: Each user has their own account with a current balance that adjusts based on incoming and outgoing transactions.
Email Notifications: Whenever a transaction is conducted, users receive email notifications detailing the transaction for their reference.
Account Customization: Users can update or delete their accounts, granting them control over their personal information and preferences.
Welcome Bonus: New users are greeted with a welcome amount in their wallet upon registration, enhancing their initial experience.
Communication Channels: Kafka is utilized for seamless communication between microservices, ensuring efficient and reliable data transfer.
Notification Services: The Notification Service sends email notifications to users for each transaction, enhancing user engagement.
Microservice Architecture: The E-Wallet application is structured around a microservices architecture, with various services, including User Service, Transaction Service, Notification Service, and Wallet Services, each equipped with its own database.
Endpoints and Controllers:


Project Structure:
The project is divided into distinct microservices, each focused on specific functionalities. These services communicate via Kafka, ensuring efficient inter-service communication. The application's modularity guarantees flexibility and scalability, enabling easy addition of new features or services as needed.
E-Wallet will be Parent Application Containing Various Microservices ( - User Service, Transaction Service, Notification Service, Wallet Services) with each service having its own database.

Technologies Used:

Spring Boot: For building robust microservices
Kafka: Facilitating seamless communication between microservices
Database (varies per service): For storing relevant data
Email Service: For sending transaction-related email notifications
Third-Party SMS Integration: For sending SMS notifications
