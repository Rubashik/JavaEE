public class Dice {

    public static int roll(){

        return 1+(int)(Math.random()*((6-1)+1));
    }
    public static int rollstat(){
        int value[]=new int[6];
        int stat,first, second, third;
        for(int i=0;i<6;i++){
            value[i]=roll();

        }
        third = first = second = -1;
        for(int i = 0; i < 6; i++){


            if (value[i] > first)
            {
                third = second;
                second = first;
                first = value[i];
            }


            else if (value[i] > second && value[i] != first)
            {
                third = second;
                second = value[i];
            }

            else if (value[i] > third && value[i] != second)
                third = value[i];
        }

        return first+second+third;
    }
}