# Spring Boot REST API - Timestamp, Email, and URL Endpoint

This project demonstrates a simple Spring Boot REST API that returns an email, the current date-time in ISO 8601 format, and a URL in a JSON response. The application is built using Java 17 and Spring Boot.

## Project Overview

The API exposes a single endpoint `/info` that returns a JSON object containing the following data:

- **email**: A string representing an email address.
- **current_time**: The current date and time in ISO 8601 format.
- **github_url**: A string representing a GitHub URL.

### Example JSON Response

When you access the `/info` endpoint, you will receive a JSON response that looks like this:

```json
{
  "email": "your.email@example.com",
  "current_time": "2025-01-31T12:34:56.789Z",
  "github_url": "https://github.com/yourusername"
}
# Spring Boot REST API - Timestamp, Email, and URL Endpoint

This task demonstrates a simple Spring Boot REST API that returns an email, the current date-time in ISO 8601 format, and a URL in a JSON response. The application is built using Java 17 and Spring Boot.

## Technologies Used

This task leverages the following technologies and tools:

- **Java 17**: The programming language used for building the API.
- **Spring Boot 3.4.2**: A powerful framework used to simplify Java-based web development, particularly for building RESTful APIs.
- **Spring Boot Starter Web**: A starter for building web applications, including RESTful applications using Spring MVC.
- **Spring Boot Starter JSON**: A starter to handle JSON data in the Spring Boot application.
- **Maven**: A build automation tool used to manage project dependencies and build lifecycle.
- **ISO 8601**: The format used to represent the current date-time in the API's response.

## Setup and Installation

Follow the steps below to set up the project on your local machine:

### 1. Clone the repository

```bash
git clone https://github.com/joelned/HNG-task.git
