./mvnv package
<!-- ./mvnv spring-boot:run -->

docker login --username=khawarhere --email=khawarhere@gmail.com

docker build -t appone .

docker tag appone inserito/appone

docker push inserito/appone
