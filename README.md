docker-example
==============

This project is just a really simple example of using gradle to build a docker image. 

Setup
=====
* Setup docker locally on your mac using docker-machine
    * Download and install [docker-toolbox](https://www.docker.com/docker-toolbox)
    * docker-machine create --driver virtualbox default
    * docker-machine ls
    * modify your .profile to include:

        eval "$(docker-machine env default)"

* Setup gradle
    * brew update && brew install gradle

Build
=====
gradle distDocker


Run
===
docker images    # find the image id
docker run -p 4567:4567 <imageid>
curl localhost:4567/hello
