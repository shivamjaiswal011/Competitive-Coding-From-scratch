#include<iostream>

void towerofhanoi(int n,char src,char dest,char helper)
{ if(n==0)
  { return;
  }
 
  towerofhanoi(n-1,src,helper,dest);
  cout<<"Move"<<n<<" disks from "<<src<<"to "<<dest;
  towerofhanoi(n-1,helper,dest,src);
}
int main()
{
 int n;
 cout<<" Enter no. of Disks : ";
 cin>>n;
 towerofhanoi(n,'A','C','B');
 return 0;
}
