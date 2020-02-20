#!/bin/bash

ps -ef|grep hackathon-0.0.1-SNAPSHOT.jar|head -1|awk '{print $2}'|xargs kill -9


if [ $? -eq "0" ]
  then

echo 'Restart the backend'

cd /backend/
java -jar hackathon-0.0.1-SNAPSHOT.jar &

else

echo 'Not running start now'
cd /backend/
java -jar hackathon-0.0.1-SNAPSHOT.jar &

fi
