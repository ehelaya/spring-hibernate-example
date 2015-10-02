# Spring-Hibernate-example

This is a small example in spring with hibernate. only demonstrate addding a user into am mysql database using hibernate dialect.
## Usage

The project uses Apache Ant build tool . To create war file run following code
note: edit signup-servlet.xml file for mysql connection details

* $ ant dist 

copy signupv1.war in dist/ folder into tomcat webapps folder
goto localhost:<port>/signupv1/ to see user add page.
