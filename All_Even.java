class All_Even{
    public static void main(String arg[]){
        int sum =0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of all Even numbers between 1 to 100 is "+sum);
    }
}