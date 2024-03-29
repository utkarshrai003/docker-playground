# ADD  ->  copies the files from a source on the host into the container’s own filesystem at the set destination.
# ENTRYPOINT  ->  sets a default application to be used every time a container is created with the image.
# ENV  ->  sets environment variables.
# EXPOSE  ->  associates a specific port to enable networking between the container and the outside world.
# FROM  ->  defines the base image used to start the build process.
# MAINTAINER  ->  defines a full name and email address of the image creator.
# RUN  ->  is the central executing directive for Dockerfiles.
# USER  ->  sets the UID (or username) which is to run the container.
# VOLUME  ->  is used to enable access from the container to a directory on the host machine.
# WORKDIR  ->  sets the path where the command, defined with CMD, is to be executed.
# LABEL  ->  allows you to add a label to your docker image.
# CMD  ->  can be used for executing a specific command within the container.

FROM ruby:3.0.0

RUN apt-get update -qq && apt-get install -y build-essential libpq-dev nodejs && gem install bundler

ENV APP /rate_limiter

RUN mkdir $APP
WORKDIR $APP

COPY Gemfile /rate_limiter/Gemfile
COPY Gemfile.lock /rate_limiter/Gemfile.lock

RUN bundle install

COPY . $APP

EXPOSE 3000
CMD ["rails", "s", "-b", "0.0.0.0"]