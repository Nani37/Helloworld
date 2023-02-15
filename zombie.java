#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>
int main()
{
Int pid = fork();
if(pid>0)
{
printf(“Parent will sleep for 5 sec \n”);
sleep(5);
printf(“end of parent process \n”);
}
else
{
print(“this is child \n”);
printf(“end of child process \n”);
exit(0);
}
return(0);
}
