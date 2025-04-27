# 📚 Student Exam Scheduler - Assignment

## 📋 Introduction
This project is a simple **Student Exam Scheduling System** built in **Java**.  
It allows you to:
- Add new students
- Schedule exams for students
- Navigate through their exams (next and previous)
- View all scheduled exams

The program uses:
- **ArrayList** for managing students
- A **Doubly Linked List** for managing exam schedules

---

## 🛠 Features Implemented

| Feature | Description |
|:--------|:------------|
| Add Student | Add a new student to the system |
| Add Exam | Add an exam schedule for a specific student |
| View Next Exam | Move to and view the next scheduled exam |
| View Previous Exam | Move to and view the previous scheduled exam |
| View All Exams | Display all exams scheduled for a student |
| Exit | Terminate the application |

---

## 🧩 Class Descriptions

### 1. Main.java
Handles user interaction with a menu-driven interface.
- Prompts the user to add students, schedule exams, or navigate through exams.
- Calls methods from `StudentInfoSystem` and `ExamSchedule`.

---

### 2. Student.java
Represents a **student** with:
- `name`: The name of the student.
- `examSchedule`: An instance of `ExamSchedule` for managing their exams.

---

### 3. StudentInfoSystem.java
Manages all students using an **ArrayList**.
- `addStudent(Student student)`: Adds a new student.
- `findStudentByName(String name)`: Searches and returns a student by name.

---

### 4. ExamNode.java
Represents a **single exam** node in the doubly linked list.
- `examDetails`: Contains information like exam date and location.
- `next`: Reference to the next exam.
- `prev`: Reference to the previous exam.

---

### 5. ExamSchedule.java
Manages a **doubly linked list** of exam schedules.
- `addExam(String examDetails)`: Adds a new exam at the end of the list.
- `viewNextExam()`: Moves and displays the next exam.
- `viewPreviousExam()`: Moves and displays the previous exam.
- `viewAllExamSchedule()`: Displays all exams.

---

## 🧪 How the Program Works

1. Run `Main.java`.
2. A menu appears with different options.
3. Choose an option by entering the corresponding number:
    - `1`: Add a new student
    - `2`: Schedule a new exam for an existing student
    - `3`: View the next exam scheduled for a student
    - `4`: View the previous exam
    - `5`: View all exams for a student
    - `6`: Exit the application
4. The system interacts with you through the console.

---

## 🔥 Sample Output

```bash
Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice: 1
Enter student name: John Doe
Student added: John Doe

Options:
Enter your choice: 2
Enter student name: John Doe
Enter exam date (e.g., 2023-10-15): 2024-05-20
Enter exam location (e.g., Room 101): Room A101
Exam added: 2024-05-20 - Room A101


## 🔥 Improvements:

1. **Add validation**:
    - Implement input validation to ensure that data such as student names or exam details are not empty.
    - For example, ensure the student name is not blank when adding a new student or entering exam details.

2. **Allow deleting or updating exams**:
    - Add features that allow users to delete or update an existing exam in the student's schedule.
    - This would require you to modify the linked list (i.e., remove or modify `ExamNode` objects).

3. **Save students and exams into a file**:
    - Use **Java file I/O** to persist the student and exam data into a file.
    - This ensures that the data isn't lost when the program stops and can be reloaded when the program is run again.
    - You could use text files, CSV, or even JSON for storing the data.

4. **Later, use dates properly**:
    - Instead of using a string to store exam dates, consider using the `LocalDate` class from Java's `java.time` package.
    - This would allow better handling and validation of dates, including comparisons, formatting, and parsing.

5. **Build a graphical interface using JavaFX or Swing**:
    - Transition from a command-line interface (CLI) to a **graphical user interface (GUI)** using **JavaFX** or **Swing**.
    - A GUI could provide a more user-friendly experience, allowing users to easily view, add, update, and delete students and exams.
    - It would also give you practice with event-driven programming.
