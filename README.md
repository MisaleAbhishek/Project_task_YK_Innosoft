# Project_task_YK_Innosoft

# Book Cart Application

This is a simple Java web application for managing a book cart. It uses advanced Java concepts and is deployed on an Apache Tomcat server. The application uses Oracle Database for data management.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or later installed on your machine.
- Apache Tomcat Server version 10.1 installed.
- Oracle Database installed and configured.
- A web browser for accessing the application.

## Setup Instructions

1. **Clone the Repository**

   Clone the project repository to your local machine:

   ```bash
   git clone <repository-url>
Configure the Database

Ensure your Oracle Database is running.
Create a new schema for the application (if not already done).
Update the database configuration settings in your application code (usually found in a configuration file or within the code itself).
Build the Project

Navigate to the project directory and compile the Java files:

bash
Copy code
javac -d out src/*.java
Package the compiled files into a WAR file (if necessary for your deployment process):

bash
Copy code
jar -cvf bookcart.war -C out/ .
Deploy to Tomcat

Copy the bookcart.war file (or the compiled class files) to the webapps directory of your Tomcat server.
Start the Tomcat server using the following command (ensure the CATALINA_HOME environment variable is set to your Tomcat directory):
bash
Copy code
$CATALINA_HOME/bin/startup.sh
Access the Application

Open a web browser and go to http://localhost:8080/bookcart/.
You should see the user homepage homepage1.html.
Usage Instructions
Homepage

Open homepage1.html in your browser.
If you are a new user, register an account; otherwise, log in with your existing credentials.
Book Cart Management

After logging in, you will see the book cart page.
Select the books you want to add to your cart by checking the corresponding checkboxes.
Press the "Submit" button to add the selected books to your cart.
You can continue adding more books to your cart as needed.
Troubleshooting
Ensure the database connection settings are correctly configured.
Make sure Tomcat is running on the correct port and is not blocked by any firewall.
Check the Tomcat server logs for any errors during deployment or runtime.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
If you have any questions or issues, please contact [your-email@example.com].

sql
Copy code

Make sure to replace `<repository-url>` and `[your-email@example.com]` with the appropriate information for your project. Additionally, if there are specific configurations or dependencies in your project, you may need to adjust the instructions accordingly.
