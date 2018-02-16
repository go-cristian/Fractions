### Fractions

Example classes for handling Fractions and some Operations, this projects is a result from the 
[Software Bootcamp](https://www.youtube.com/watch?v=g8bXwYU1Y7U&list=PLnoPakspmPo6E_ySkPtmXr6-xu-75eCo4) 
(by [Carlos Obregon](https://twitter.com/gaijinco)), also is inspired in the book 
[Elegant Objects](www.yegor256.com/elegant-objects.html). 

#### Tests

All the code was created using TDD, so it was more easy to create the implementation.

#### Builders

The class Fraction uses a builder, but is not a requirements. It can be used a basic constructor, 
or even an static factory.

```java
new Fraction(1); //Representing 1
new Fraction(1,2); //Representing 1/2
Fraction.of(1); //Representing 1
Fraction.of(1,2); //Representing 1/2
```


<font size="3">Made with :heart: by [Cristian Gómez](https://twitter.com/iyubinest).</font>

License
-------

    Copyright 2018 Cristian Gómez

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.