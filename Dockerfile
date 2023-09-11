FROM tomcat

COPY target/*.war /usr/local/tomcat/webapps/
#exposing port
EXPOSE 8083

