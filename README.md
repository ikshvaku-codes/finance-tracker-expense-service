
# Expense Service

The **Expense Service** is a microservice that is part of the **Finance Tracker** project. It is designed to handle all expense-related operations, such as creating, updating, retrieving, and deleting expenses. This service is built using Spring Boot and follows a modular microservices architecture.

## Features

- CRUD operations for managing expenses.
- Categorization of expenses.
- Integration with a relational database (PostgreSQL).
- RESTful APIs for communication with other microservices.
- Scalable and maintainable architecture.

## Technologies Used

- **Java**: Version 21
- **Spring Boot**: Version 3.x
- **PostgreSQL**: Database for data persistence.
- **Hibernate**: ORM for database interaction.
- **Lombok**: Reduces boilerplate code.
- **Maven**: Build and dependency management tool.


## Prerequisites

- Java 21 or higher installed.
- PostgreSQL database running locally or remotely.
- Maven installed for building the project.

## Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/your-repo/expense-service.git
   cd expense-service
   ```


2. **Configure the database** :Update the `application.yml` file in the `src/main/resources` directory with your PostgreSQL database credentials:

```yaml
 spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/expense_db
    username: <your-username>
    password: <your-password>

```

3. Build the Project: Use your IDE to clean and install the maven project or use the bash command

   ```bash
   mvn clean install
   ```
4. Run the Application

   ```bash
   mvn spring-boot:run
   ```


## API Endpoints


### Base URL

http://localhost:8080/api/v1


### Expense Endpoints

* **Create Expense** : `POST /expenses`
* **Get All Expenses** : `GET /expenses`
* **Get Expense by ID** : `GET /expenses/{id}`
* **Update Expense** : `PUT /expenses/{id}`
* **Delete Expense** : `DELETE /expenses/{id}`

### Category Endpoints

* **Create Category** : `POST /categories`
* **Get All Categories** : `GET /categories`
* **Get Category by ID** : `GET /categories/{id}`
* **Update Category** : `PUT /categories/{id}`
* **Delete Category** : `DELETE /categories/{id}`


## Project Structure

**src/**

**├── main/**

**│   ├── java/**

**│   │   └── com.finance.expense/**

│   │       ├── controller/         			

│   │       ├── dto/                				

│   │       ├── service/            			

│   │       ├── service/impl/       			

│   │       ├── repository/         			

│   │       └── entity/             				

**│   └── resources/**

│       ├── application.yml         			

│       └── static/                 				

└── test/                           				


## Contributing

Contributions are welcome! If you have suggestions for improvements or new features, feel free to open an issue or submit a pull request.

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Make your changes and commit them (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.


## License

This project is licensed under the GNU License. See the `LICENSE` file for details.


## Contact

For any inquiries or feedback, please reach out to me at [ikshvaku.codes@gmail.com].
