# Electricity Billing System

## 🚀 About the Project
The **Electricity Billing System** is a Java-based desktop application integrated with MySQL to efficiently manage electricity billing, consumer records, and payments. This system automates the process of generating electricity bills, viewing consumer details, and managing transactions securely.

## ✨ Features
- User authentication (Admin & Consumer) 🔑
- Add, update, and delete consumer details 👤
- Automated bill calculation and generation 💡
- Secure payment processing 💰
- View and print bills 🖨️
- MySQL database integration for data management 🗄️
- Responsive and interactive Java Swing GUI 🎨

## 🛠️ Technologies Used
- **Programming Language:** Java (Swing, AWT)
- **Database:** MySQL
- **Backend:** JDBC for database connectivity
- **IDE:** IntelliJ IDEA / Eclipse / NetBeans

## 📂 Project Structure
```
electricity-billing-system/
├── src/
│   ├── database/
│   │   ├── DBConnection.java
│   ├── gui/
│   │   ├── LoginFrame.java
│   │   ├── Dashboard.java
│   │   ├── BillGeneration.java
│   ├── models/
│   ├── utilities/
├── resources/
│   ├── icons/
│   ├── styles/
├── .gitignore
├── README.md
├── electricity_billing.sql
└── LICENSE
```

## 🚀 Getting Started
### Prerequisites
Ensure you have the following installed:
- Java JDK 8 or later
- MySQL Server
- JDBC Driver
- Git (for version control)

### Installation
```sh
git clone https://github.com/mspanti/Electricity-Billing-System.git
cd Electricity-Billing-System
```

### Setting Up the Database
1. Open MySQL and create a database:
```sql
CREATE DATABASE electricity_billing;
```
2. Import the provided `electricity_billing.sql` file.

### Running the Project
1. Open the project in your Java IDE.
2. Configure database credentials in `DBConnection.java`.
3. Compile and run the application:
```sh
javac -d bin src/**/*.java
java -cp bin Electricity.Billing.Main
```

## 📬 Contact
For any queries or contributions, reach out:
- 📧 Email: mspandiyan3337@gmail.com.com


## 📝 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
💡 *We welcome contributions! Feel free to submit issues, feature requests, and pull requests.*

