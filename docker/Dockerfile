FROM docker.today36524.com.cn:5000/base/openjdk:server-jre8
RUN mkdir /kafka-msg-agent && mkdir /kafka-msg-agent/conf
COPY ./apps/kafka-msg-agent-jar-with-dependencies.jar /kafka-msg-agent/
COPY ./apps/rest-consumer.xml /kafka-msg-agent/conf/
COPY ./startup.sh /kafka-msg-agent/
RUN chmod 744 /kafka-msg-agent/startup.sh
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8
WORKDIR /kafka-msg-agent
ENTRYPOINT exec /kafka-msg-agent/startup.sh

