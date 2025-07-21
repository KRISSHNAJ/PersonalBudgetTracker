# Personal Budget Tracker (Java 17 Console Application)

This is a simple console-based Personal Budget Tracker application developed using Java 17. It allows users to input their monthly income and various expenses, then calculates and displays their remaining balance. This project serves as a foundational example for beginners in Java, demonstrating core concepts such as:

* **Variables and Primitive Data Types:** `double` for financial values, `String` for text, `boolean` for control flags.
* **Operators and Expressions:** Arithmetic operators (`+`, `-`), comparison operators (`>`, `<`, `==`), assignment operators (`=`, `+=`).
* **User Input:** Utilizing the `java.util.Scanner` class to read input from the command-line interface (CLI).
* **Control Flow:** `while` loops for repetitive input, `if-else if-else` statements for conditional logic.
* **Basic Input Validation:** Ensuring numerical inputs are correctly handled and providing user feedback for invalid entries.
* **Code Comments:** Extensive line-by-line comments explain the purpose of each section and line of code.

## Table of Contents

1.  [Features](#features)
2.  [Tech Stack](#tech-stack)
3.  [Project Structure](#project-structure)
4.  [How to Run](#how-to-run)
5.  [Usage](#usage)
6.  [Code Quality & Efficiency](#code-quality--efficiency)
7.  [Future Enhancements](#future-enhancements)
8.  [License](#license)

## Features

* **Income Input:** Users can enter their total monthly income.
* **Expense Tracking:** Users can add multiple expenses with names and amounts until they choose to finish.
* **Balance Calculation:** Automatically calculates the remaining balance after deducting all expenses from the income.
* **Budget Feedback:** Provides simple feedback (e.g., "You are within your budget!", "You are over budget!") based on the remaining balance.
* **Input Validation:** Basic validation for numerical inputs to prevent crashes from non-numeric entries.
* **User-Friendly CLI:** Clear prompts and informative output.

## Tech Stack

* **Java 17**: Core programming language.

## Project Structure




Project: Personal Budget Tracker (Console-Based)

This project will demonstrate core Java basics (variables, data types, operators, Scanner for input) by creating a simple personal budget tracker. Users can input their income and various expenses, and the application will calculate their remaining balance.

1. Project Name
PersonalBudgetTracker

2. Folder Structure
PersonalBudgetTracker/
├── src/
│   └── com/
│       └── example/
│           └── budgettracker/
│               └── PersonalBudgetTracker.java
├── .gitignore
├── README.md
├── pom.xml (Optional, for Maven project setup - useful for dependency management, though not strictly needed for this basic project)



3. Tech Stack Needs

Java Development Kit (JDK) 17: The primary programming language and runtime environment.
Command Line Interface (CLI): For running the application and user interaction.

4. GitHub All Contents

This section will detail the contents for each file to be uploaded to a GitHub repository.

PersonalBudgetTracker/src/com/example/budgettracker/PersonalBudgetTracker.java


PersonalBudgetTracker/.gitignore
# Java-specific ignore patterns
*.class
# Package Files #
*.jar
*.war
*.ear
*.zip
*.tar.gz
*.rar

# Maven
target/
pom.xml.tag
pom.xml.releaseBackup
pom.xml.versionsBackup
pom.xml.next
release.properties
dependency-reduced-pom.xml
buildNumber.properties
.mvn/wrapper/maven-wrapper.jar

# Eclipse
.classpath
.project
.settings/

# IntelliJ IDEA
.idea/
*.iml
*.iws

# OS generated files
.DS_Store
.localized
Thumbs.db



PersonalBudgetTracker/README.md
# Personal Budget Tracker (Java 17 Console Application)

This is a simple console-based Personal Budget Tracker application developed using Java 17. It allows users to input their monthly income and various expenses, then calculates and displays their remaining balance. This project serves as a foundational example for beginners in Java, demonstrating core concepts such as:

* **Variables and Primitive Data Types:** `double` for financial values, `String` for text, `boolean` for control flags.
* **Operators and Expressions:** Arithmetic operators (`+`, `-`), comparison operators (`>`, `<`, `==`), assignment operators (`=`, `+=`).
* **User Input:** Utilizing the `java.util.Scanner` class to read input from the command-line interface (CLI).
* **Control Flow:** `while` loops for repetitive input, `if-else if-else` statements for conditional logic.
* **Basic Input Validation:** Ensuring numerical inputs are correctly handled and providing user feedback for invalid entries.
* **Code Comments:** Extensive line-by-line comments explain the purpose of each section and line of code.

## Table of Contents

1.  [Features](#features)
2.  [Tech Stack](#tech-stack)
3.  [Project Structure](#project-structure)
4.  [How to Run](#how-to-run)
5.  [Usage](#usage)
6.  [Code Quality & Efficiency](#code-quality--efficiency)
7.  [Future Enhancements](#future-enhancements)
8.  [License](#license)

## Features

* **Income Input:** Users can enter their total monthly income.
* **Expense Tracking:** Users can add multiple expenses with names and amounts until they choose to finish.
* **Balance Calculation:** Automatically calculates the remaining balance after deducting all expenses from the income.
* **Budget Feedback:** Provides simple feedback (e.g., "You are within your budget!", "You are over budget!") based on the remaining balance.
* **Input Validation:** Basic validation for numerical inputs to prevent crashes from non-numeric entries.
* **User-Friendly CLI:** Clear prompts and informative output.

## Tech Stack

* **Java 17**: Core programming language.

## Project Structure



PersonalBudgetTracker/
├── src/
│ └── com/
│ └── example/
│ └── budgettracker/
│ └── PersonalBudgetTracker.java
├── .gitignore
├── README.md



## How to Run

To run this project, you need to have **Java Development Kit (JDK) 17 or higher** installed on your system.

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/PersonalBudgetTracker.git](https://github.com/YOUR_USERNAME/PersonalBudgetTracker.git)
    cd PersonalBudgetTracker
    ```
    (Replace `YOUR_USERNAME` with your actual GitHub username)

2.  **Compile the Java Code:**
    Open your terminal or command prompt, navigate to the `PersonalBudgetTracker/src` directory, and compile the Java file:
    ```bash
    javac com/example/budgettracker/PersonalBudgetTracker.java
    ```

3.  **Run the Application:**
    From the `PersonalBudgetTracker/src` directory, execute the compiled class:
    ```bash
    java com.example.budgettracker.PersonalBudgetTracker
    ```

    Alternatively, if you are in the `PersonalBudgetTracker` root directory, you can compile and run as follows:
    ```bash
    javac src/com/example/budgettracker/PersonalBudgetTracker.java
    java -cp src com.example.budgettracker.PersonalBudgetTracker
    ```

## Usage

Once the application is running, follow the on-screen prompts:

1.  Enter your total monthly income.
2.  Enter the name and amount for each expense.
3.  Type `done` when you have finished adding all expenses.
4.  The application will then display your budget summary and remaining balance.

### Example Interaction:

 Welcome to Your Personal Budget Tracker!


Please enter your total monthly income (e.g., 2500.50): 2500
Now, let's add your expenses. Enter 'done' when you are finished.
Enter expense name (or type 'done' to finish): Rent
Enter amount for 'Rent': 1000
Enter expense name (or type 'done' to finish): Groceries
Enter amount for 'Groceries': 300.75
Enter expense name (or type 'done' to finish): Utilities
Enter amount for 'Utilities': 150
Enter expense name (or type 'done' to finish): Entertainment
Enter amount for 'Entertainment': 50
Enter expense name (or type 'done' to finish): done

--- Budget Summary --- Total Income: $2500.00 Total Expenses: $1500.75


Remaining Balance: $999.25 (You are within your budget! Keep up the good work!)


Thank you for using the Personal Budget Tracker!




## Code Quality & Efficiency

* **Readability:** The code is extensively commented line-by-line to explain the purpose of each section, variable, and operation. This enhances understanding for new developers.
* **Variable Naming:** Variables are named descriptively (e.g., `totalIncome`, `expenseAmount`) to clearly indicate their purpose.
* **Data Types:** Appropriate primitive data types (`double` for currency) are used for efficiency and accuracy in calculations.
* **Resource Management:** The `Scanner` object is properly closed using `scanner.close()` to prevent resource leaks.
* **Input Validation:** Basic input validation is implemented to handle non-numeric inputs gracefully, improving robustness.
* **Clarity:** Clear prompts and structured output make the application user-friendly.
* **Efficiency:** For a console-based application of this simplicity, the chosen approach (direct variable manipulation, `Scanner`) is highly efficient. No complex data structures or algorithms are required.
* **Error Handling:** Basic error handling for invalid input types is included. Negative expense amounts are also flagged.

## Future Enhancements

* **Data Persistence:** Store budget data in a file (e.g., CSV, JSON) or a simple database so it persists across sessions.
* **Expense Categories:** Allow users to categorize expenses (e.g., Food, Transport, Housing) for better insights.
* **Reporting:** Generate more detailed reports, perhaps breaking down spending by category.
* **Graphical User Interface (GUI):** Develop a GUI using JavaFX or Swing for a more interactive experience.
* **Monthly/Annual Tracking:** Extend to track budgets over different periods.
* **More Robust Input Validation:** Implement more sophisticated input validation (e.g., regular expressions for specific formats).
* **Object-Oriented Design:** Introduce classes like `Expense` or `Budget` to encapsulate related data and behavior.

## License

This project is open-source and available under the [MIT License](LICENSE).



PersonalBudgetTracker/pom.xml (Optional - for Maven Project)

This pom.xml would be used if you wanted to manage your project with Maven, which is highly recommended for larger projects as it simplifies dependency management, building, and project structure. For this basic console app, it's not strictly necessary, but good to include for a "best practices" setup.

XML


<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example.budgettracker</groupId>
    <artifactId>PersonalBudgetTracker</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>${maven.compiler.source}</source>
                    <target>${maven.compiler.target}</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.2.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <addClasspath>true</addClasspath>
                            <mainClass>com.example.budgettracker.PersonalBudgetTracker</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>



5. Full Project Description

Project Title: Personal Budget Tracker (Console-Based)
Description:
The Personal Budget Tracker is a lightweight, console-based Java application designed to help individuals monitor their monthly income and expenses. Developed using Java 17, this project serves as an excellent practical demonstration of fundamental Java programming concepts. Users interact with the application through the command-line interface, providing their income and a list of various expenses. The application then processes this input, calculates the total expenses, and determines the remaining balance, offering immediate feedback on their budget status (e.g., "within budget," "over budget," or "exactly balanced").
Key Learning Objectives Demonstrated:
Java Syntax Basics: Proper class definition, main method structure, package declarations.
Variables and Primitive Data Types: Effective use of double for precise financial calculations, String for text input, and boolean for control flow flags. This highlights the importance of choosing appropriate data types for efficiency and accuracy.
Operators and Expressions: Practical application of arithmetic operators (+, -) for calculations, and relational operators (>, <, ==) for conditional logic.
Command Line Interface (CLI) Interaction: Proficiency in reading user input from the console using the java.util.Scanner class, including handling different data types (nextDouble(), nextLine()).
Basic Input Validation: Implementing simple checks to ensure that user inputs are valid (e.g., numerical values for amounts, positive values for expenses), preventing common errors and improving application robustness.
Control Flow Statements: Utilizing while loops for repetitive input collection (e.g., adding multiple expenses) and if-else if-else statements for decision-making based on the calculated balance.
Code Quality and Readability: Emphasis on clear, descriptive variable names, consistent formatting, and comprehensive line-by-line comments to enhance code understanding and maintainability.
Resource Management: Demonstrating the importance of closing resources like Scanner to prevent leaks.
Target Audience:
This project is ideal for Java beginners or those looking to reinforce their understanding of core Java concepts in a practical, finance-related context. It provides a solid foundation for building more complex applications involving user interaction and data processing.
Efficiency and Quality Considerations:
Memory Efficiency: By using primitive data types (double), the application minimizes memory overhead compared to using wrapper classes unnecessarily.
Execution Speed: For a console application, direct I/O with Scanner and simple arithmetic operations are inherently fast. There are no heavy computations or complex algorithms that would introduce performance bottlenecks.
Robustness: Basic input validation prevents common InputMismatchException errors when users enter non-numeric data, making the application more resilient.
Maintainability: The comprehensive comments, logical structure, and meaningful variable names make the code easy to understand, debug, and extend in the future.
Modularity (Initial): While a simple main method, the use of packages (com.example.budgettracker) sets a good precedent for larger, more modular projects.

6. Steps to Upload to GitHub Repo

Initialize Git Repository:
Navigate to your PersonalBudgetTracker project root directory in your terminal and initialize a Git repository:
Bash
git init
Create .gitignore:
Make sure you have the .gitignore file in your root directory to exclude compiled classes and IDE-specific files.
Add Files to Staging Area:
Add all relevant project files to the Git staging area:
Bash
git add .

This command adds all files in the current directory and its subdirectories.
Commit Changes:
Commit the staged files with a descriptive message:
Bash
git commit -m "Initial commit: Personal Budget Tracker Java 17"


Create Remote Repository on GitHub:
Go to GitHub, log in, and create a new public repository (e.g., PersonalBudgetTracker). Do not initialize it with a README, .gitignore, or license, as you already have them locally.
Link Local to Remote Repository:
Copy the commands provided by GitHub to link your local repository to the newly created remote repository. It will typically look like this:
Bash
git remote add origin https://github.com/YOUR_USERNAME/PersonalBudgetTracker.git
git branch -M main
git push -u origin main

(Replace YOUR_USERNAME with your actual GitHub username)
Verify:
Go to your GitHub repository page and refresh it. You should see all your project files uploaded.
This comprehensive setup ensures a well-organized, high-quality project that is easy to understand, run, and maintain, showcasing best practices for core Java development.
