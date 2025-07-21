package com.example.budgettracker; // Defines the package for organizing classes

import java.util.Scanner; // Imports the Scanner class for reading user input

/**
 * The PersonalBudgetTracker class allows users to track their income and expenses
 * to manage their personal budget. It's a console-based application demonstrating
 * core Java concepts like variables, data types, operators, and user input.
 */
public class PersonalBudgetTracker {

    /**
     * The main method is the entry point of the Java application.
     * It orchestrates the budget tracking process.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // --- 1. Variable Declarations and Initializations ---
        // Primitive data types are used for efficiency and direct memory access.

        // Scanner object to read input from the console.
        // It's a resource that should be closed when no longer needed to prevent resource leaks.
        Scanner scanner = new Scanner(System.in);

        // Variables to store financial data. Using 'double' for currency
        // allows for decimal values, which is essential for financial calculations.
        double totalIncome = 0.0;     // Stores the user's total declared income.
        double totalExpenses = 0.0;   // Accumulates all recorded expenses.
        double remainingBalance = 0.0;// Calculates the money left after expenses.

        // --- 2. Welcome Message and User Input for Income ---
        System.out.println("----------------------------------------------");
        System.out.println("     Welcome to Your Personal Budget Tracker! ");
        System.out.println("----------------------------------------------");

        // Prompt the user to enter their total monthly income.
        System.out.print("Please enter your total monthly income (e.g., 2500.50): ");
        // Input validation loop to ensure valid double input for income.
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numerical value for income.");
            scanner.next(); // Consume the invalid input to prevent an infinite loop.
            System.out.print("Please enter your total monthly income (e.g., 2500.50): ");
        }
        totalIncome = scanner.nextDouble(); // Reads the double value entered by the user.

        // Consume the rest of the line to prepare for nextLine() calls (important after nextDouble()).
        scanner.nextLine();

        // --- 3. Expense Input Loop ---
        System.out.println("\nNow, let's add your expenses. Enter 'done' when you are finished.");

        String expenseName;   // Stores the name/description of an expense.
        double expenseAmount; // Stores the monetary value of an expense.
        boolean continueAddingExpenses = true; // Control flag for the expense input loop.

        // Loop to allow users to add multiple expenses until they type 'done'.
        while (continueAddingExpenses) {
            System.out.print("Enter expense name (or type 'done' to finish): ");
            expenseName = scanner.nextLine().trim(); // Reads the entire line and removes leading/trailing whitespace.

            // Check if the user wants to finish adding expenses. Case-insensitive comparison.
            if (expenseName.equalsIgnoreCase("done")) {
                continueAddingExpenses = false; // Exit the loop.
                break; // Exit the loop immediately.
            }

            System.out.print("Enter amount for '" + expenseName + "': ");
            // Input validation loop for expense amount.
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numerical value for the expense amount.");
                scanner.next(); // Consume the invalid input.
                System.out.print("Enter amount for '" + expenseName + "': ");
            }
            expenseAmount = scanner.nextDouble(); // Reads the double value for the expense.

            // Ensure expense amount is not negative.
            if (expenseAmount < 0) {
                System.out.println("Expense amount cannot be negative. Please enter a positive value.");
                // We'll let them re-enter in the next iteration if they want.
                // For simplicity, we won't re-prompt for this specific expense.
                // In a more complex system, you might loop for valid input here.
                scanner.nextLine(); // Consume the invalid input line.
                continue; // Skip the rest of this iteration and go to the next.
            }

            // Accumulate expenses using the '+' operator.
            totalExpenses = totalExpenses + expenseAmount; // Or totalExpenses += expenseAmount;

            // Consume the rest of the line after reading a double. This is crucial
            // before the next nextLine() call in the loop.
            scanner.nextLine();
        }

        // --- 4. Calculations and Results ---
        // Perform the final calculation using the '-' operator.
        remainingBalance = totalIncome - totalExpenses;

        System.out.println("\n--- Budget Summary ---");
        // Display results using formatted output.
        // String.format("%.2f", value) formats the double to two decimal places,
        // which is standard for currency.
        System.out.println("Total Income: $" + String.format("%.2f", totalIncome));
        System.out.println("Total Expenses: $" + String.format("%.2f", totalExpenses));
        System.out.println("----------------------");

        // Conditional statements (if-else if-else) to provide feedback based on the balance.
        if (remainingBalance > 0) {
            System.out.println("Remaining Balance: $" + String.format("%.2f", remainingBalance) + " (You are within your budget! Keep up the good work!)");
        } else if (remainingBalance < 0) {
            // Using Math.abs() to display the positive difference for the deficit.
            System.out.println("Remaining Balance: $" + String.format("%.2f", remainingBalance) + " (You are over budget by $" + String.format("%.2f", Math.abs(remainingBalance)) + ". Consider reducing expenses.)");
        } else {
            System.out.println("Remaining Balance: $" + String.format("%.2f", remainingBalance) + " (You have spent exactly your income. Good job managing!)");
        }

        System.out.println("----------------------------------------------");
        System.out.println("Thank you for using the Personal Budget Tracker!");
        System.out.println("----------------------------------------------");

        // --- 5. Resource Cleanup ---
        // Close the scanner to release system resources. This is good practice.
        scanner.close();
    }
}