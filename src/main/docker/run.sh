#!/bin/bash
# Wait for config server
status=$(curl http://configserver:8080/actuator/health | jq -r '.status')
until [ "$status" = "UP" ]; do
    echo "Waiting for config server"
    sleep 1
    status=$(curl http://configserver:8080/actuator/health | jq -r '.status')
done
echo "Starting discovery server"
# Run tomcat
/usr/local/tomcat/bin/catalina.sh run