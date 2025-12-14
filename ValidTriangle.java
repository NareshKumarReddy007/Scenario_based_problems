//Valid Triangle
class Scenario_13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b<=c||a+c<=b||b+c<=a) System.out.println("Not a Valid Triangle");
        else System.out.println("Valid Triangle");
    }
}
