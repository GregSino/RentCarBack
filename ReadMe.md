
  <h3 align="center">Spring boot Api with Hibernate, connected by REST with Front api </h3>

  <p align="center">
    No database needed, develop with only free solutions!
    <br />
    <a href="https://github.com/GregSino/RentCarFront"><strong>Don't forget to get the Front office! »</strong></a>
    <br />
    <a href="https://github.com/GregSino/RentCarBack"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/GregSino/RentCarBack">View Demo</a>
    ·
    <a href="https://github.com/GregSino/RentCarBack/issues">Report Bug</a>
    ·
    <a href="https://github.com/GregSino/RentCarBack/issues">Request Feature</a>
  </p>


<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#front-prerequisites)
  * [Installation](#front-prerequisites-simplified-install)
* [License](#license)
* [Contact](#contact)



<!-- ABOUT THE PROJECT -->
## About The Project


There are many great api built with Spring boot available on GitHub. however, I didn't find one that really suit my needs so I created this enhanced one. I want to create not one but two api connected by rest, to manage a many to many relationship.

Here's the project:
* The back-office developed with Spring boot / Maven / hibernate. No database is needed, this project use H2-Memory. 
* The front-office developed with Angular / Material / Bootstrap. 

The idea is to develop a simple CRUD between 3 entities:
* A driver list
* A car list
* A rent list composed of drivers and cars

### Built With
This section should list any major frameworks that you built your project using. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.
* [Spring boot](https://spring.io/)
* [Hibernate](https://hibernate.org/)
* [Angular](https://angular.io/)
* [Angular Material](https://material.angular.io/)
* [Bootstrap](https://getbootstrap.com/)



<!-- GETTING STARTED -->
## Getting Started

To develop this project, I've used IntelliJ for the back and Webstorm for the front. You can easilly use other IDE but it's a good idea to use 2 programs to run and test the api in real time.

### Front Prerequisites

As usual, don't forget to install Node.js. Then, you need to install Angular
* npm
```sh
npm install @angular/cli
```

It'll be necessary to install also Bootstrap...
* npm
```sh
npm install bootstrap --save
```

... Jquery
* npm
```sh
npm install jquery --save
```

... and finally Popper.js
* npm
```sh
npm install popper.js --save
```

### Front Prerequisites simplified install

1. Clone the repo
```sh
git clone https://github.com/GregSino/RentCarBack.git
```
2. Install NPM packages
```sh
npm install
```


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Greg Sino - gregsino@gmail.com

Project Link: [https://github.com/GregSino/RentCarBack](https://github.com/GregSino/RentCarBack)



