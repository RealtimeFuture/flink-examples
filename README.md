# Flink Examples

This project contains example applications built with Apache Flink, demonstrating both the DataStream API and the (deprecated) DataSet API.

## Modules

The project consists of the following modules:

### 1. flink-examples-word-count
A classic WordCount example implemented using the Flink **DataSet API**.
*   **Description**: Counts the occurrence of each word in the input text.
*   **Key Concepts**: `FlatMap`, `GroupBy`, `Sum`, Tuple data types.
*   **Note**: The DataSet API is deprecated since Flink 1.18. This example is retained for testing and legacy reference.

### 2. flink-examples-top-speed
A streaming application implemented using the Flink **DataStream API**.
*   **Description**: Monitors car speeds and detects the top speed within a specific window. It can read from a file or generate synthetic car data.
*   **Key Concepts**: `KeyBy`, `GlobalWindows`, `TimeEvictor`, `DeltaTrigger`, Custom Source/Sink.

## Prerequisites

*   Java 8 or 11
*   Maven 3.x

## Building the Project

To build all examples, run the following command from the root directory:

```bash
mvn clean package
```

This will generate the JAR files in the `target` directory of each module.

## How to Run

### WordCount

You can run the WordCount example using the following command:

```bash
# Run with default data
java -cp flink-examples-word-count/target/flink-examples-word-count-2.1.4.jar org.apache.streampark.flink.example.WordCount

# Run with custom input and output
java -cp flink-examples-word-count/target/flink-examples-word-count-2.1.4.jar org.apache.streampark.flink.example.WordCount --input <path/to/input> --output <path/to/output>
```

### TopSpeed

You can run the TopSpeed example using the following command:

```bash
# Run with generated data (prints to stdout)
java -cp flink-examples-top-speed/target/flink-examples-top-speed-2.1.4.jar org.apache.streampark.flink.example.TopSpeed

# Run with file input and output
java -cp flink-examples-top-speed/target/flink-examples-top-speed-2.1.4.jar org.apache.streampark.flink.example.TopSpeed --input <path/to/input/dir> --output <path/to/output/dir>
```

*Note: You may need to have Flink dependencies in your classpath if running purely with `java -cp`. Alternatively, use the `flink run` command if you have a Flink cluster or distribution set up.*

## License
See the source code headers for license information.
