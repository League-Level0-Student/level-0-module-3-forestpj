int x = 99;

int y = 98;

for (int i = 0; i < 100; i++){

println(+ x + " bottles of beer on the wall " + x + " bottles of beer. Take one down pass it around " + y + " bottles of beer on the wall" );

x --;

y --;

if (y == 0){
  System.exit(0);
}
}
