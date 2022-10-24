

<!-- PROJECT LOGO -->

<!-- TABLE OF CONTENTS -->

<details>
  <summary>Table of Contents</summary>
  <ul>
    <li>
      <a href="#about-the-project">About Make Change</a>
  </ul>
      <ul>
        <li><a href="#technologies-used">Technologies Used</a></li>
      </ul>
    </li>
  <ul>
    <li><a href="#howitworks">How It Works</a></li>
  </ul>  
  <ul>
    <li><a href="#contact">Contact</a></li>
  </ul>

  <ul>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
    </ul>

</details>

<!-- ABOUT THE PROJECT -->

## About Make Change


<p>
This program acts as a cash register. It allows the user to calculate/make change for the customer based on the purchase price and the amount tendered. It will notify the cashier how many pieces of currency to give back to the customer based on the amount of change that they are owed. It will use the largest bill and coin denominations possible to make change. It will not use 2 five dollar bills for ten dollars worth of change. It will use a ten dollar bill. This also applies to coin amounts. Any denominations not used in the program will not be displayed.  
 </p>

<!--[![Product Name Screen Shot][product-screenshot]](https://example.com) -->

<p align="right">(<a href="#top">back to top</a>)</p>

### Technologies Used

-   [Eclipse](https://spring.io/tools)
-   [Atom Text Editor](https://atom.io/)
-   [Java](https://www.java.com/en/)
-   [GITHUB](https://github.com)
-   [Debugger-Oracle](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jdb.html)  

<p align="right">(<a href="#top">back to top</a>)</p>

## How It Works



<p>
The make change cash register will first prompt the user to input the price of the item. Then it will prompt the user to input the cost of the item that is to be purchased. It will then calculate the change for the user.
</P>
<ol>

<li>
 If there is not enough tendered to cover the purchase price the program will prompt the user to inform the customer that there is not enough money to cover the item. It will also inform the user to tell the customer to leave and the program will terminate.
</li>

<li>
  If the amount tendered is greater than the purchase price the program will calculate the amount of change. Once the amount of change is calculated the program will then calculate the amount of each denomination to give back to the customer.
    Below is an example of a logic condition used in the program to determine the quantity of the denomination.


  -if (change >= 20) {           
	amountOfTwenties = (int) (change / twentyDollarBill);
	change = Math.round((change - (amountOfTwenties * twentyDollarBill))*100)/100.0;
	System.out.println("The amount of twenties is: " + amountOfTwenties);
				}

</li>
<li>
 If the amount tendered is the same as the purchase price the program will prompt the user to not give any change because there is no calculation to be preformed and the exact amount owed was paid. The program will then terminate.
</li>

</ol>
<p align="right">(<a href="#top">back to top</a>)</p>

## What I Learned
<p>
I learned fun ways to use Math.round, while loops, variable manipulation, formulas, and nesting. Debugging...is a gift from the coding gods. This helped me track down mathematical errors and why I was having missing penny issues.
Creating this program helped me understand the logic I used. I initially felt a little lost and overwhelmed mainly because this is my first solo coding project. I quickly realized that I needed to simplify the program and not over complicate it. The goal was to have a fully functioning program that would do exactly what the user needed it to do, make change. This oddly proved a bit difficult when it came to the actual change portion. I realized java needs to have formulas that tell it exactly what to do or else I would end up with a program that generated $10.05411102 instead of $10.05. This is where Math.round used in a formula proved to be incredibly useful it helped me round to the nearest 100th.
</p>



## Contact

<strong>Developer on Project</strong>

<h4>Sandra Harpole</h4>
<ul>
<li>
<a href="https://www.linkedin.com/in/sandra-harpole/">
LinkedIn
</a>
</li>
<li><a href="https://github.com/SandraLeAnn">Github</a></li>
<li> E-mail: sharpnw21@gmail.com </li>
</ul>


Project Link: [MakeChangeProject](https://github.com/SandraLeAnn/MakeChangeProject)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- ACKNOWLEDGMENTS -->

## Acknowledgments


-   [Stack Overflow](https://stackoverflow.com/)
-   [W3 Schools](https://www.w3schools.com/)
-   [Google](https://www.google.com/)
-   [TanUv90-Youtube Educator](https://www.youtube.com/watch?v=nLDWeTz3Zgc&t=65s/)
-   [Coding with John](https://www.youtube.com/watch?v=aqcJsKdjjvU)
<p align="right">(<a href="#top">back to top</a>)</p>
