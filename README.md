# Build
mvn clean package && docker build -t rs.sf/soap_lombok_inheritance .

# RUN

docker rm -f soap_lombok_inheritance || true && docker run -d -p 8080:8080 -p 4848:4848 --name soap_lombok_inheritance rs.sf/soap_lombok_inheritance 