Step 1: Download Latest Java, JDK 26 to your windows
<img width="1898" height="754" alt="image" src="https://github.com/user-attachments/assets/977cc427-a425-4b0d-becf-9e5316d01e60" />
Direct link for windows - https://download.oracle.com/java/26/latest/jdk-26_windows-x64_bin.msi

Step 2: Download Latest Maven
<img width="1907" height="952" alt="image" src="https://github.com/user-attachments/assets/b0d9848e-5b1d-42b2-993d-1d6fe6ee675c" />

<img width="1919" height="773" alt="image" src="https://github.com/user-attachments/assets/6d49ed8e-6719-416d-a604-3c40a74304bc" />

Direct link for windows - https://dlcdn.apache.org/maven/maven-3/3.9.14/binaries/apache-maven-3.9.14-bin.zip

Step 3: Install JAVA on your system
After installing the java, setup your windows environment variable
JAVA_HOME=C:\Program Files\Java\jdk-26\

Extract the maven and copy the folder so that you have 
MAVEN_HOME=C:\Program Files\Apache\Maven\apache-maven-3.9.14\

Ensure the bin folder exist in that folder

Step 4: Setup the path variables for JAVA and MVN
Add these to your path variable on windows
%JAVA_HOME%\bin
%MAVEN_HOME%\bin

Step 5: Confirmation
Once you got the steps above correct, you can do this on your terminal

c:\> mvn --version
Apache Maven 3.9.14 (996c630dbc656c76214ce58821dcc58be960875b)
Maven home: C:\Program Files\Apache\Maven\apache-maven-3.9.14
Java version: 26, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-26
Default locale: en_US, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"

C:\> java --version
java 26 2026-03-17
Java(TM) SE Runtime Environment (build 26+35-2893)
Java HotSpot(TM) 64-Bit Server VM (build 26+35-2893, mixed mode, sharing)

Step 6: Go to your intellij idea

<img width="986" height="923" alt="image" src="https://github.com/user-attachments/assets/4fff5551-df1d-4015-bb49-907cd77d340d" />
Click next

<img width="984" height="917" alt="image" src="https://github.com/user-attachments/assets/1d4cef81-471c-4f43-91ed-abf04b8e92dd" />
Pick those 3 options are you can hit off your project


Step 7:
Right click and create a new Class called HelloController

<img width="1046" height="428" alt="image" src="https://github.com/user-attachments/assets/f75cd3bc-84c1-4aa0-92c2-8f0db1fb949c" />

<img width="997" height="415" alt="image" src="https://github.com/user-attachments/assets/d24329bc-8279-47eb-9d94-10897d0d08db" />

Paste this inside the controller

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World from Spring Boot 🚀";
    }

    @GetMapping("/about")
    public String about() {
        return "This is the about page";
    }
}

Step 8: Run the project
Hit the play button
<img width="1686" height="272" alt="image" src="https://github.com/user-attachments/assets/16ac2219-44eb-43bc-8ace-5585276e7482" />

<img width="1874" height="976" alt="image" src="https://github.com/user-attachments/assets/9a0c57ea-0d10-421b-a37a-e0249b0cb610" />

step 9: View the result
Head over to the browser and run http://localhost:8080 and also http://localhost:8080/about
<img width="375" height="170" alt="image" src="https://github.com/user-attachments/assets/5ea18979-9715-46d1-9955-38cec3bbc7f0" />

At this stage, if you are successful you would have run your java springboot project successfully
