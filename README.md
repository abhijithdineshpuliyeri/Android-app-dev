# Exp5 - Android Notification App

A clean and simple Android application demonstrating the implementation of system notifications. This project was developed as part of **Experiment 5** in Android Application Development.

## 📱 Features

- **Modern UI**: A user-friendly interface featuring a clean "Notification Center" card.
- **Notification API**: Utilizes `NotificationCompat` and `NotificationChannel` for backward compatibility.
- **Android 13+ Support**: Handles runtime permission requests for `POST_NOTIFICATIONS`.
- **Interactive**: Tapping the notification opens the app back to the main activity.

## 📸 Screenshots

| Main Application UI | Notification View |
| :---: | :---: |
| ![App UI](screenshots/app_ui.jpg) | ![Notification View](screenshots/notification_view.jpg) |

## 🛠️ Technical Implementation

- **Language**: Java
- **UI Framework**: Android XML Layouts with Material Design components.
- **Core Components**:
    - `NotificationChannel`: Used for categorizing notifications (required for Android 8.0+).
    - `NotificationManagerCompat`: Ensures compatibility across different Android versions.
    - `PendingIntent`: Used to trigger app opening when a notification is clicked.

## 🚀 How to Run

1. Clone the repository.
2. Open the project in **Android Studio**.
3. Build and run the app on an Android device or emulator (Android 7.0+ recommended).
4. Click the **"SHOW NOTIFICATION"** button to trigger the alert.
5. If running on Android 13 or higher, grant the notification permission when prompted.

---
*Android Application Development • Experiment 5*
