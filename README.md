# 🏢 Employee Communication System

[![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.2-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0+-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template_Engine-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)

A robust enterprise web application designed for streamlined employee onboarding, departmental communication, and secure account verification built using **Java 21**, **Spring Boot**, **Spring Data JPA**, and **Thymeleaf**.

---

## ✨ Features

- **Employee Registration & Verification:** Multi-stage employee onboarding with pending registrations and email-based verification tokens.
- **Automated Mail Dispatcher:** Integrated with JavaMailSender for automated transactional notifications, confirmations, and security alerts.
- **Enterprise Data Persistence:** Spring Data JPA with Hibernate ORM and MySQL database management.
- **Role & Security Foundations:** Secure credential management and password encryption via Spring Security Crypto.
- **Responsive Dynamic UI:** Server-rendered responsive portal templates using Thymeleaf and modern CSS.

---

## 🛠️ Tech Stack

- **Backend:** Java 21, Spring Boot
- **Data & ORM:** Spring Data JPA, Hibernate, MySQL
- **Email Service:** Spring Mail (JavaMailSender / SMTP)
- **Security:** Spring Security Crypto
- **Frontend / Templating:** Thymeleaf, HTML5, CSS3, JavaScript
- **Build Tool:** Apache Maven

---

## 🚀 Getting Started

### Prerequisites
- **JDK 21** or later installed
- **MySQL Server** running locally or in Docker
- **Maven 3.8+** (or use bundled wrapper)

### Setup & Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Priyanshu03s/EmployeeCommunicationSystem.git
   cd EmployeeCommunicationSystem
   ```

2. **Configure Database & Mail Service:**
   Copy the example configuration or set environment variables in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_communication?createDatabaseIfNotExist=true
   spring.datasource.username=${DB_USERNAME:root}
   spring.datasource.password=${DB_PASSWORD:your_mysql_password}

   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=${MAIL_USERNAME:your_email@gmail.com}
   spring.mail.password=${MAIL_PASSWORD:your_app_password}
   ```

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
   The application will start on port `8083`: `http://localhost:8083`

---

## 👤 Author

**Priyanshu Thakur**
- GitHub: [@Priyanshu03s](https://github.com/Priyanshu03s)
