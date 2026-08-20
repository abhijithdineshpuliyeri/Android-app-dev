# Exp3 - Course Info App

A simple Android application developed as part of **Experiment 3** to demonstrate a **Master-Detail interface using Android Fragments**.

The application displays a list of programming and technology courses on the left side and shows the corresponding course information when a course is selected.

## 📱 Features

- **Master-Detail Interface** – Displays the course list and course details together.
- **Course List** – Includes:
  - Java
  - Python
  - Android
  - Machine Learning
  - Cyber Security
- **Course Details** – Displays information related to the selected course.
- **Fragment-Based UI** – Uses separate fragments for the course list and course details.
- **Simple and Responsive Layout** – Designed for Android devices using XML layouts.

## 🖼️ App Screenshot

![Course Info App](screenshots/app_screenshot.png)

## 🛠️ Technologies Used

- **Java**
- **Android Studio**
- **Android Fragments**
- **ListView**
- **ArrayAdapter**
- **XML Layouts**
- **Android SDK**

## 📂 Project Structure

```text
Exp3/
├── MainActivity
├── CourseListFragment
├── DetailFragment
├── res/
│   ├── layout/
│   └── values/
└── screenshots/
    └── app_screenshot.png
```

### Main Components

**MainActivity**  
Acts as the main entry point of the application and hosts the fragments.

**CourseListFragment**  
Displays the available courses using a ListView and ArrayAdapter.

**DetailFragment**  
Displays detailed information about the course selected by the user.

## ⚙️ How It Works

1. The application starts and displays the available courses.
2. The user selects a course from the course list.
3. The selected course is passed to the detail fragment.
4. The corresponding course information is displayed in the **Course Details** section.

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/abhijithdineshpuliyeri/Android-app-dev.git
```

2. Open the project in **Android Studio**.
3. Select the `exp3` branch.
4. Allow Gradle to finish syncing.
5. Run the application using an Android emulator or a connected Android device.

## 🎯 Objective

The main objective of this experiment is to understand and implement **Android Fragments** and the **Master-Detail UI pattern** for displaying and managing related information within an Android application.

## 👨‍💻 Author

**Abhijith P**

MCA Student

## 📌 Experiment

**Experiment 3 – Course Information Application**

---

⭐ Developed as part of Android Application Development coursework.