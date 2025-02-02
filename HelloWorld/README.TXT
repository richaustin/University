------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

Run Unit Tests: mvn clean test

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HelloWorld.java</title>
    <style>
        pre {
            background-color: #f4f4f4;
            padding: 10px;
            border: 1px solid #ddd;
            overflow-x: auto;
        }
    </style>
</head>
<body>
    <h1>HelloWorld.java</h1>
    <pre>
public class HelloWorld {
    static void myMethod() {
      System.out.println("I just got executed!");
    }
  
    public static void main(String[] args) {
      myMethod();
      myMethod();
      myMethod();
    }
}
    </pre>
</body>
</html>