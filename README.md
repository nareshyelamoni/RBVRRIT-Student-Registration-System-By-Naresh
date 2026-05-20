# 📘 RBVRRIT Student Registration System

## 📝 Project Description
This is a **Student Registration Web Application** developed using **Java Servlet, JSP, JDBC, and MySQL**.  
The application allows users to register their details through a form similar to Google Forms and stores the data in a database.

---

## 🎯 Features
- Student Registration Form
- Form Validation (Age > 18)
- Data stored in MySQL database
- Success and Failure response pages
- Clean UI using HTML & CSS
- Backend processing using Servlet

---

## 🛠️ Technologies Used
- Java (Servlet & JSP)
- JDBC
- MySQL
- HTML
- CSS
- Apache Tomcat Server

---

## 📂 Project Structure
```
dynamic-form/
│
├── src/
│   └── (Servlet Java Files)
│
├── WebContent/ or webapp/
│   ├── index.html
│   ├── success.jsp
│   ├── failure.jsp
│
├── database/
│   └── SQL file
│
├── .gitignore
└── README.md
```

---

## 🗄️ Database Table
```sql
CREATE TABLE studentInfo (
    id VARCHAR(40) NOT NULL,
    name VARCHAR(40) NOT NULL,
    age INT NOT NULL CHECK(age > 18),
    gmail VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    location VARCHAR(70) NOT NULL,
    course VARCHAR(40) NOT NULL
);
```

---

## ▶️ How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/nareshyelamoni/RBVRRIT-Student-Registration-System-By-Naresh.git
   ```

2. Import project into Eclipse

3. Configure Apache Tomcat Server

4. Setup MySQL database using above SQL

5. Update DB credentials in your Servlet

6. Run the project on server

---


## 🎓 College Info
**RBVRR Institute of Technology (RBVRRIT)**

---

## 👨‍💻 Author
**Naresh Yelamoni**

---

## 🚀 Future Improvements
- Add Login System
- Add Admin Dashboard
- Form validation using JavaScript
- Responsive UI design

---

# ⭐ If you like this project, give it a star!
