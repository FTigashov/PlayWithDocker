FROM openjdk

COPY . /java

WORKDIR /java

EXPOSE 8186

RUN javac Person.java

RUN javac Main.java

CMD ["java", "Main", ";", "Person"]
