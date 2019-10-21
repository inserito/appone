./mvnw package

docker login --username=khawarhere

docker build -t appone .

docker tag appone inserito/appone:4

docker push inserito/appone:4
