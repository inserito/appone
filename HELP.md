./mvnv package

docker login --username=khawarhere

docker build -t appone .

docker tag appone inserito/appone:2

docker push inserito/appone
