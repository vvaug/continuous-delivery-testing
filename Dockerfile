FROM adoptopenjdk/openjdk11
ARG DIR=/app/
ARG APPLICATION_NAME=continuousdeliverytesting
RUN mkdir ${DIR}
COPY target/${APPLICATION_NAME}.*jar ${DIR}
WORKDIR ${DIR}
CMD ['java', '-jar', '${APPLICATION_NAME}*.jar' ]
