# ChoasGame
This project is based on this Numberphile video: https://www.youtube.com/watch?v=kbKtFN71Lfs

The game starts with 3 vertices and a random point P on the plot. One of the vertices (suppose V)  is chosen and the *midpoint* of V and P is plotted. 
Lets redefine the P to be this midpoint. Then another vertices (suppose Q)  is chosen and the *midpoint* of Q and P is plotted. This process repeats until 
a pattern is noticed. 

Currently this is the result of game:

![alt text](https://github.com/seharpanesar/ChoasGame/blob/master/Pictures/1.PNG)
![alt text](https://github.com/seharpanesar/ChoasGame/blob/master/Pictures/2.PNG)
![alt text](https://github.com/seharpanesar/ChoasGame/blob/master/Pictures/3.PNG)
![alt text](https://github.com/seharpanesar/ChoasGame/blob/master/Pictures/4.PNG)

If I come back to this project, here are some features to add:
  - Allow more vertices when project is initialized (right now there are only 3). This can be done using user input. 
  - Customize the location of those vertices (currently they always make an equilateral triangle).
  - Have "run" button that adds a point every ~20-30ms to see the points being plotted quickly without having to click anymore buttons 
