FROM openjdk

COPY . /java

WORKDIR /java

EXPOSE 8186

RUN javac Main.java

CMD ["java", "Main"]