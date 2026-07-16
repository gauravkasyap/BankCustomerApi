# 🏦 Bank Customer API

A RESTful API built using **Spring Boot** that provides CRUD operations for managing bank customers. This project demonstrates the use of Spring Boot, Spring Data JPA, Hibernate, and MySQL to build a scalable backend application.

---

## 🚀 Features

- ➕ Create a new customer
- 📄 Retrieve all customers
- 🔍 Get customer by ID
- ✏️ Update customer details
- ❌ Delete customer
- ✅ Email uniqueness validation
- 🗄️ MySQL database integration
- 📦 RESTful API architecture

---

## 🛠️ Tech Stack

- Java 21/22
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API
- Postman (API Testing)

---

## 📂 Project Structure

```
BankCustomerAPI/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org.bank_customer_api/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── model/
│   │   │       └── BankCustomerApiApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

---

## 📊 Customer Model

| Field | Type |
|--------|------|
| customerId | Long |
| firstName | String |
| lastName | String |
| email | String (Unique) |
| phoneNumber | String |

---

## ⚙️ Setup Instructions

### 1. Clone Repository

```bash
git clone https://github.com/your-username/BankCustomerAPI.git
```

### 2. Navigate to Project

```bash
cd BankCustomerAPI
```

### 3. Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bankdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run Project

```bash
mvn spring-boot:run
```

Application starts at

```
http://localhost:8080
```

---

## 📌 API Endpoints

### Create Customer

```
POST /customers
```

Request Body

```json
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john@gmail.com",
    "phoneNumber": "9876543210"
}
```

---

### Get All Customers

```
GET /customers
```

---

### Get Customer By ID

```
GET /customers/{id}
```

---

### Update Customer

```
PUT /customers/{id}
```

Request Body

```json
{
    "firstName": "John",
    "lastName": "Smith",
    "email": "johnsmith@gmail.com",
    "phoneNumber": "9999999999"
}
```

---

### Delete Customer

```
DELETE /customers/{id}
```

---

## 🧪 Testing

The API can be tested using:

- Postman
- Thunder Client
- cURL

Example:

```bash
curl http://localhost:8080/customers
```

---

## 📸 Sample Response

```json
{
    "customerId": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john@gmail.com",
    "phoneNumber": "9876543210"
}
```

---

## 🎯 Future Improvements

- JWT Authentication
- Role-Based Authorization
- Swagger/OpenAPI Documentation
- Pagination & Sorting
- Search Customers
- Global Exception Handling
- Validation using Bean Validation
- Docker Support
- Unit & Integration Testing

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create your feature branch

```bash
git checkout -b feature-name
```

3. Commit your changes

```bash
git commit -m "Added new feature"
```

4. Push to GitHub

```bash
git push origin feature-name
```

5. Open a Pull Request

---

## 👨‍💻 Author

**Gaurav Kasyap**

- Java Backend Developer
- Spring Boot Enthusiast
- Passionate about REST APIs and Backend Development

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.
