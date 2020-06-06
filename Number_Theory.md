#header
##header2

    Resource To practice question on Number Theory

Link : https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=719

    Number Theory (part-1) tutorial (GCD, Factors, Prime)

Link :  


    Gcd Algorithm

int gcd(int a, int b)

 {
     return (b == 0) ? a : gcd(b, a % b);
 }    
 
    Factors

vector<int> fact(int N)

 {
 
    vector<int> factor;
	
	for(int i; i<= sqrt(N); i++)
	{
		if(N % i == 0)
		{
			factor.push_back(i);
			if(i != N/i)
			factor.push_back(N/i);
		}
	}	
	return factor;
 }     

    Prime (Sieve algo)

vector<bool> isprime(1e6+1,true);

    vector<ll int> primes;

   void sieve()
    
 {
    ll int i,j;
    isprime[0] = false;
    isprime[1] = false;

    for(i=2; i<=1e6 ;i++)
  {
    if(isprime[i])
    {
      primes.push_back(i);

      for(j=i*i; j<=1e6; j+=i)
      {
        isprime[j]=false;
      }
    }
  }
 } 
   
    Number Theory (part-1) tutorial (1 Qustion on sieve, Prime-Factors, Totient Function )

Link : 

Question Link : https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=720&page=show_problem&problem=1081

    How to find Prime-factors    

vector<bool> isprime(1e6+1,true);

    vector<ll int> primes;

    void sieve()
    
 {
    ll int i,j;
    isprime[0] = false;
    isprime[1] = false;

    for(i=2; i<=1e6 ;i++)
  {
    if(isprime[i])
    {
      primes.push_back(i);

      for(j=i*i; j<=1e6; j+=i)
      {
        isprime[j]=false;
      }
    }
  }
}


vector<int> primefactors(ll int N)

 {
    vector<int> factors;
    ll pf_idx = 0, pf=primes[pf_idx];

    while(pf*pf<=N)
    {
        while(N % pf == 0)
        {
            N/=pf;
            factors.push_back(pf);
        }
        pf = primes[++pf_idx];
    }
    if(N != 1) factors.push_back(N);
    return factors;
}


    Totient Function

ll int eulerPhi( ll int N)
{

    ll pf_idx = 0, pf=primes[pf_idx];
    
    ll ans=N;

    while(pf*pf<=N)
    {
        if(N % pf == 0)
        {
            ans -= ans / pf;
        }
        while(N % pf == 0) N /= pf;

        pf = primes[++pf_idx];
    }
    if(N != 1) ans -= ans / N;
    return ans;
}    








        // Happy Coding //
