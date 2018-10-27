# Struts2-LoginForm
Assignment for CZ3002 - Advanced Software Engineering

This assignment of CZ3002 is a group assignment and takes 5% of the final course marks. Grouping information for this assignment can be checked from Groups on the course site of NTULearn. Only one submission from your group is necessary. The deadline is 11.59pm, Monday, 29th, October 2018 .

This assignment is to illustrate wire-by-configuration in the MVC framework of Struts 2 (the newer version of Struts) by building a Web application that contains one single function of Login under Struts 2. You can use Question 2.b in Tutorial 8 for a quick background understanding. For further reference, please go to https://struts.apache.org/getting-started/.

Detailed requirements of the assignment are: You must write M, V, C code for the Login function. The login function takes in the account name and password, and does verification. The verification shall be done against a table of credentials in a MySQL database. A successful login results in a page with a simple message “Successful login” displayed at the center. A failure in login redirects back to the login page indicating the previous login effort is not successful. You may expect to write simple JSP file(s), Action classes, your model class(es), struts.xml or alike for this Web application.

Deliver two parts for the assignment: 1) a report document of at most THREE pages, 2) your source code, and with your source code you are also expected to deliver your database scripts to create the database and to populate the password table in MySQL. Please also deliver your source code with the application archive War file. Submissions must be through NTULearn course site under this group assignment.

Your code should be well documented and tested to run, and include pieces equivalent to M, V and C accordingly and other necessary files and data (like struts.xml etc.) of Struts 2. They must be self-contained to run.

Your report should include I) An architectural diagram and a detailed explanation of the framework architectural style in the MVC perspective (3 roles). II)Execution flow of different pieces of your code for M, V, and C interacting with each other with an explanation using the architectural diagram (mentioned in I) and a sequence diagram. III) Explain how the dynamic binding works when a maintenance change occurs (e.g. change to a different a login function). IV) Organization of the code, installation manual and user manual to run the code.
