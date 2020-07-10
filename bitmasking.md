#header
##header2

    Best website to practice Bit-masking(i.e difficulty wise sorted question ) is :-

http://codedigger.tech/

    Book to go deep in bit_masking is:-

Hacker's Delight - https://drive.google.com/file/d/1Afqi5s8o0l5NBvC_OARdzlNFIO4Nrzd3/view?usp=sharing    

    Video Tutorials for Bit-Masking 

https://youtu.be/5upadP-hWXQ

    Usefull Templates to be used for bit-masking are : -

#define isOn(S, j) (S & (1 << j))

#define setBit(S, j) (S |= (1 << j))

#define clearBit(S, j) (S &= ~(1 << j))

#define toggleBit(S, j) (S ^= (1 << j))

#define lowBit(S) (S & (-S))

#define setAll(S, n) (S = (1 << n) - 1)

#define modulo(S, N) ((S) & (N - 1))   // returns S % N, where N is a power of 2

#define isPowerOfTwo(S) (!(S & (S - 1)))

#define nearestPowerOfTwo(S) ((int)pow(2.0, (int)((log((double)S) / log(2.0)) + 0.5)))

#define turnOffLastBit(S) ((S) & (S - 1))

#define turnOnLastZero(S) ((S) | (S + 1))

#define turnOffLastConsecutiveBits(S) ((S) & (S + 1))

#define turnOnLastConsecutiveZeroes(S) ((S) | (S - 1))

    Some very usefull inbuilt functions :-

1. _builtin_popcount(x): This function is used to count the number of one’s(set bits) in an integer.    

2. _builtin_parity(x): This function is used to check the parity of a number. This function returns true(1) if the number has odd parity else it returns false(0) for even parity.

3. __builtin_clz(x): This function is used to count the leading zeros of the integer. Note : clz = count leading zero’s

4. __builtin_ctz(x): This function is used to count the trailing zeros of the given integer. Note : ctz = count trailing zeros.


        A very useful STL for bitmasing is bitset<>

A bitset is an array of bool but each Boolean value is not stored separately instead bitset optimizes the space such that each bool takes 1 bit space only, so space taken by bitset bs is less than that of bool bs[N] and vector bs(N). However, a limitation of bitset is, N must be known at compile time, i.e., a constant.

    Useful inbuilt functions with bitset<> are :-

1. set()

2. flip()

3. reset()

4. any()

5. none()

6. all()

7. test()

8. count()


