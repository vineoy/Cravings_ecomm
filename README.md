
# 🍽️Cravings_ecomm - A Full-Stack Food Delivery App

Cravings_ecomm is a robust and scalable full-stack food delivery application crafted to streamline the process of discovering, ordering, and receiving food. It integrates a dynamic React.js frontend with a powerful Spring Boot backend, supported by a MongoDB database and enriched with third-party services like AWS S3 and Razorpay. The app serves both customers and administrators with distinct sets of features and user experiences.

## 🛠️ Tech Stack

### Frontend - React.js

1. Component-based architecture

2. Routing with React Router

3. Axios for HTTP requests

4. Context API or Redux for state management

5. Styled with CSS modules or frameworks like Tailwind CSS

### Backend - Spring Boot

1. RESTful API development

2. Spring Security (optional for authentication)

3. Hibernate for object-relational mapping

4. Maven for project management and build automation

### Database - MongoDB

1. NoSQL document-based storage

2. Collections to store user, food, and order data

3. High performance with flexible schema

### Cloud and Integrations

1. AWS S3: For storing and retrieving food images

2. Razorpay: Payment gateway integration for processing secure online transactions


## 🎯Features

### 👥 User Features

- Sign Up / Login / Logout:

- Secure user registration and authentication

- Sessions or JWT for managing user sessions

- Search Food Items:

  Dynamic food search using keywords or categories

  Instant search results from MongoDB

- Cart Management:

   Add, update, or remove food items in cart

   Calculate total cost dynamically

- Order Placement:

   Checkout process that collects user and order details

   Razorpay integration for secure payment processing

- Order Tracking:

  View live updates of order status (Preparing, Out for Delivery, Delivered)

### 🧑‍💼 Admin Features

- Upload New Foods:

  Upload food name, description, price, category, and image

  Images stored in AWS S3 bucket

- Edit/Remove Foods:

  Modify existing food entries

  Remove items from the listing

- Manage Orders:

  View all customer orders

  Update order status to: Preparing, Out for Delivery, Delivered


## 💻 Getting Started

Follow these steps to set up the project locally.

#### ✅ Prerequisites

- Node.js and npm installed

- Java 17 or newer

- Maven installed

- MongoDB running locally or remotely

- AWS account with an S3 bucket

- Razorpay developer account

#### 🔧 Frontend Setup

```bash
cd client
npm install          # Install dependencies
npm start            # Start the development server
```
#### 🧰 Backend Setup

```bash
cd server
mvn clean install    # Build the project
mvn spring-boot:run  # Start the backend API server
```
## Screenshots

![Screenshot (104)](https://github.com/user-attachments/assets/b29a4f0e-6a95-4a0e-833a-a129c9570215)

![Screenshot (103)](https://github.com/user-attachments/assets/d9b61522-a5ab-4421-9141-705751d8227c)

![Screenshot (105)](https://github.com/user-attachments/assets/cfb983ea-2364-46b1-a3f9-68b7b9eb7114)

![Screenshot (111)](https://github.com/user-attachments/assets/c43fd229-06aa-499e-a7cb-219b1f9f0cbf)

![Screenshot (106)](https://github.com/user-attachments/assets/8c0c2bc8-be58-4180-abb3-9a71bd5931da)

![Screenshot (107)](https://github.com/user-attachments/assets/5a19bb2a-3ebf-452c-97f0-f2b7fc3fa019)

![Screenshot (109)](https://github.com/user-attachments/assets/4643c3c6-6d8b-4c33-a110-697a744a5545)

![Screenshot (110)](https://github.com/user-attachments/assets/efa2cd5f-1e4d-4384-a099-31ee03af27f5)


