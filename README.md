📝 To-Do List Application
This system is a Task Management system, the result of a study with Spring Boot.

The idea was to present a clean and functional web application designed to help users manage their daily tasks efficiently. It provides 
a robust backend API for CRUD (Create, Read, Update, Delete) operations and a user-friendly web interface developed with Thymeleaf. This 
application demonstrates best development practices with Spring Boot, data persistence with MySQL, and a modern web style.

✨ Features
Task Management (CRUD):

a. Add New Tasks: Easily create new tasks with a title, description, start date, due date, priority, and tags.

b. View All Tasks: A clear and intuitive list displaying all pending and completed tasks.

c. Edit Tasks: Modify task details, including title, description, dates, priority, status (Pending/Completed), and tags.

d. Delete Tasks: Remove unwanted tasks from the list.

e. Intuitive User Interface: A responsive and visually appealing interface, built with Thymeleaf and styled with Tailwind CSS.

f. Date Pickers: Easy-to-use input fields for selecting start and due dates.

g. Priority Levels: Categorize tasks by High, Medium, or Low priority.

h. Task Status: Track task progress with visually differentiated Pending and Completed statuses.

i. Tags: Organize tasks with multiple tags separated by commas (e.g., Work, Personal, Urgent).


🛠️ Technologies Used
1. Backend:
  a. Spring Boot - The framework for building robust, stand-alone, production-grade Spring applications.
  b. Spring Data JPA - Simplifies data access and persistence layers.
  c. Hibernate - JPA implementation for object-relational mapping.
  d. Lombok - Reduces boilerplate code (getters, setters, constructors).

2. Database:
 a. MySQL - A open-source relational database.

3. Frontend:
  a. Thymeleaf - A modern server-side Java template engine for web and standalone environments.
  b. Tailwind CSS - A utility-first CSS framework for rapidly building custom designs.

4. Build Tool:
a. Maven - Project management and comprehension tool.
b. Containerization:
c. Docker - Platform for developing, shipping, and running applications in containers.
d. Docker Compose - Tool for defining and running multi-container Docker applications.

🚀 Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites
Java 17+ (JDK)
Maven 3.x
MySQL Server (or Docker for a fully containerized setup)
Docker Desktop (if running via Docker)

Installation (Local Setup)
Clone the repository:
git clone https://github.com/YOUR_USERNAME/spring-boot-todo-list.git
cd spring-boot-todo-list
(Remember to replace YOUR_USERNAME with your actual GitHub username)

Configure MySQL:

Create a new MySQL database schema named todolist_db:
  CREATE SCHEMA todolist_db;
  Update the database connection details in src/main/resources/application.properties:
    spring.datasource.url=jdbc:mysql://localhost:3306/todolist_db?useSSL=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=your_mysql_password # <--- IMPORTANT: Change this to your MySQL root password

Run the application:
  You can run the application directly from your IDE or using Maven:
  mvn clean install
  mvn spring-boot:run

The application will be accessible at http://localhost:8080/tasks.
  Installation (Docker Setup)
  For a fully containerized environment (recommended), ensure Docker Desktop is running.

Clone the repository (if you haven't already):
  git clone https://github.com/YOUR_USERNAME/spring-boot-todo-list.git
  cd spring-boot-todo-list

Update Docker Compose passwords:
  Open docker-compose.yml and change your_mysql_password to a secure password in both the mysql_db service and the app service environment variables.
  Build and run the containers:
    docker compose up -d

This command will build the Spring Boot application image, pull the MySQL image, and start both containers. The -d flag runs them in detached mode (in the background).
  Verify containers (optional):
  docker compose ps

You should see to-do-list-mysql and to-do-list-app running.

Access the application:
The application will be accessible at http://localhost:8080/tasks.

☁️ Deployment Considerations (Kubernetes)
This project is containerized using Docker, making it highly suitable for deployment on container orchestration platforms like Kubernetes. The docker-compose.yml serves as an excellent starting point for understanding how services interact and can be translated into Kubernetes manifests (e.g., Deployments, Services, Ingress, PersistentVolumeClaims, ConfigMaps, Secrets) for scalable and resilient cloud deployments.

🤝 Contributing
  Contributions are welcome! If you have suggestions for improvements, new features, or bug fixes, please open an issue or submit a pull request.

📄 License
  Feel free to change and improve the project.


📞 Contact
Your Name: [https://www.linkedin.com/in/engenheiro-muniz/]
Email: [engenheiro.muniz@outlook.com]

GitHub: [Link to your GitHub Profile]
