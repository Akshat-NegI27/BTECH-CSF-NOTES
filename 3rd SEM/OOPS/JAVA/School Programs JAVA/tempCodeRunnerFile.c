
//Code3:
#include <stdio.h> 
#include <stdlib.h>

void code()
{
  puts("HACKED");
  return;
}
int overflow( char * in1)
{
  char buff[8];
  strcpy(buff,in1);
  return 0;
}
int main(int argc, char **argv) 
{ 
   overflow(argv[1]); 
return 0;
}
