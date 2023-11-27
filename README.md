# MapReduce Word Count Program

This Word Count program implements a MapReduce application using Java 8, Hadoop, Maven, and IntelliJ IDEA for development.

## Table of Contents

Introduction
Technologies Used
Setup
Usage
Project Structure
Contributing
License
Introduction

This MapReduce Word Count program counts the occurrences of each word in a given input text or set of documents using the MapReduce paradigm. It utilizes Java 8 features, Hadoop for distributed computing, Maven for dependency management, and IntelliJ IDEA as the integrated development environment.

## Technologies Used

Java 8
Apache Hadoop
Maven
IntelliJ IDEA
Setup

## Prerequisites
Java 8 installed
Apache Hadoop setup and configured
Maven installed
IntelliJ IDEA or any preferred Java IDE
Installation
Clone or download this repository to your local machine.
Open the project in IntelliJ IDEA or your preferred Java IDE.
Set up the Hadoop configuration to connect to your Hadoop cluster or the local environment.
Usage

Ensure the input data is available in the required format.
Modify the input and output paths in the WC_Main class to point to your input and desired output directories.
Run the WC_Main class to initiate the MapReduce job.
Monitor the job execution and check the output directory for the Word Count results.
Project Structure

The project structure is organized as follows:

src/main/java: Contains Java source code files.
org.alinazac: Package containing MapReduce classes (WC_Main, WC_Mapper, WC_Reducer).
pom.xml: Maven project configuration file.

## License

This project is licensed under the LUC License.

Contributions are welcome! Feel free to open issues or submit pull requests.

License

This project is licensed under the MIT License.
