public class Longsumdigits{
public static long sumDigits(long number){
long num = 0;
long sum = 0;
while(number != 0){
num = number % 10;
sum += num;
number = number / 10;
}
return sum;
}
}

