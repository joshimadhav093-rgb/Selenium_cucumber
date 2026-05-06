package basics_of_java;

public class Progrrames {
        public void reverse(){
            String or="Madhav";
            String rev="";
            int len=or.length();

            for(int i=len-1;i>=0;i--){

                rev=rev+or.charAt(i);
            }
            System.out.println(rev);
        }

        public void rev_num(){

            int or_num=1234;
            int rev_numb=0;

            while (or_num != 0){
                rev_numb=rev_numb * 10 + or_num % 10;
                or_num= or_num/10;
            }
            System.out.println (rev_numb);

        }

        public void tringle(){

            int a=5;

            for (int i=1;i<=a;i++){

                for(int j=1;j<=i;j++){

                    System.out.print("* ");

                }
                System.out.println(" ");
            }
        }


        public void array_miss(){
            int a[]={1,2,3,4,5,7,8,9,10};
            int sum1=0;
             for(int i=0;i<a.length;i++){
                 sum1=sum1+a[i];
             }
            int sum2=0;
             for(int i=1;i<=10;i++)
             {
                 sum2=sum2+i;
             }
             System.out.println(sum2-sum1);
        }

        public void add_digit (){
            String name ="Madhavjoshi1234";
            int len=name.length();
            int sum=0;

            for (char ch : name.toCharArray()) {
                if (Character.isDigit(ch)) {
                    sum += Character.getNumericValue(ch);
                }
            }

            System.out.println("Sum of digits: " + sum);

        }

        public void check (){
            final int a=5;
            int b=a+10;

            System.out.println(b);
        }

        public static void add(){
            int a=5;
            int b=10;
            System.out.println(a+b );

        }
    public static void main(String[] args) {
            Progrrames p= new Progrrames();
            p.reverse();
            p.rev_num();
            p.tringle();
            p.array_miss();
            p.add_digit();
            p.check();

            Progrrames.add();
    }
}
