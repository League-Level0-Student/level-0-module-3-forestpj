
void setup() {
 
  // set the size of your sketch
  size(1000, 1000);

  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int x=1000;
  int y=1000;
  for (int i = 0; i < 10; i++){
      if(i%2==0) {
          fill(250,0,0);
      }
      else {
        fill(0,0,0);
      }
      ellipse(500,500,x,y);
    
  //Use an if statement and modulo to alternate the color of your rings.
  x-=100;
  y-=100;
  }
}
