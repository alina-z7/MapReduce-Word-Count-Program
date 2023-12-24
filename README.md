# MapReduce Word Count Program

This Word Count program implements a MapReduce application using Java 8, Hadoop, Maven, and IntelliJ IDEA for development.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [License](#license)

## Introduction

This MapReduce Word Count program counts the occurrences of each word in a given input text or set of documents using the MapReduce paradigm. It utilizes Java 8 features, Hadoop for distributed computing, Maven for dependency management, and IntelliJ IDEA as the integrated development environment.

## Technologies Used

- Java 8
- Apache Hadoop
- Maven
- IntelliJ IDEA

### Prerequisites

- Java 8 installed
- Apache Hadoop setup and configured
- Maven installed
- IntelliJ IDEA or any preferred Java IDE

### Installation

1. Clone or download this repository to your local machine.
2. Open the project in IntelliJ IDEA or your preferred Java IDE.
3. Set up the Hadoop configuration to connect to your Hadoop cluster or the local environment.

## Usage

1. Ensure the input data is available in the required format.
2. Modify the input and output paths in the `WC_Main` class to point to your input and desired output directories.
3. Run the `WC_Main` class to initiate the MapReduce job.
4. Monitor the job execution and check the output directory for the Word Count results.

## Project Structure

The project structure is organized as follows:

- `src/main/java`: Contains Java source code files.
  - `org.alinazac`: Package containing MapReduce classes (`WC_Main`, `WC_Mapper`, `WC_Reducer`).
- `pom.xml`: Maven project configuration file.

## License

This project is licensed under the [MIT License](LICENSE).
