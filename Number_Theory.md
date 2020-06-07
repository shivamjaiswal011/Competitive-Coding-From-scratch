#header
##header2

    Resource To practice question on Number Theory

Link : https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=719

    Number Theory (part-1) tutorial (GCD, Factors, Prime)

Link :  https://youtu.be/qHBhRoDkIm4




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






   
    Number Theory (part-2) tutorial (1 Qustion on sieve, Prime-Factors, Totient Function )

Link : https://youtu.be/m6uROtdC-q4

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







    Important functions to do
1. Count number of prime factors.
2. Count number of distinct prime factors.
3. Sum of all prime factors.
4. Count number of divisors of N.
5. Sum of all divisors of N.

If N can be represented as N = a^i x b^j x ....... x c^k
where a, b, c are prime factors of N then -:

No of divisors = (i+1)x(j+1)x......x(k+1)

Sum of divisors = ((a^i+1) - 1 )/(a-1) x ((b^j+1)-1)/(b-1) x ..... x ((c^k+1)-1)/(c-1)      







    Totient Function

Formula = Eulerphi(N) = N x ((product of all terms)(1 - 1/Prime factor i ))
eg N = 36 = 2^2 x 3^2

Eulerphi(N) = N x (1 - 1/2) x (1 - 1/3) = 12 

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
