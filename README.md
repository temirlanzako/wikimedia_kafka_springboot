# wikimedia_kafka_springboot

Kafka Multi-Module Project 🏗️

📌 About This Project

This is a multi-module Spring Boot project designed to practice Apache Kafka by fetching real-time data from Wikimedia. The project consists of:

A Kafka Producer that streams data from Wikimedia.

A Kafka Consumer that processes and stores the data.

Integration of Kafka with Spring Boot to understand event-driven architecture.

🛠️ Tech Stack

Java 17

Spring Boot

Apache Kafka

Wikimedia Stream API

PostgreSQL (as database)

Docker & Docker Compose

Gradle (for build automation)

📂 Project Structure

kafka-multi-module-project/
│── producer/          # Kafka Producer - Fetches Wikimedia events
│── consumer/          # Kafka Consumer - Listens and processes messages
│── common/            # Shared modules (DTOs, configs)
│── docker/            # Docker setup for PostgreSQL & Kafka
│── README.md          # Project documentation
│── settings.gradle    # Multi-module configuration

🚀 How It Works

The producer fetches live edit events from Wikimedia and publishes them to a Kafka topic.

The consumer listens to the Kafka topic and stores the events in PostgreSQL.

The project uses Spring Boot & Kafka for event-driven data processing.
