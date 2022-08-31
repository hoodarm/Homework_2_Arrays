package com.company;

public class Main {

    public static void main(String[] args) {
        int NUMS [] = {3,5,0,11,1};
        int COUNT = 0;
        int S = 0;
        for (int i = 0; i<=4; i++)
            if(NUMS[i]!=0)
            {
                S=S+NUMS[i];
                COUNT++;
            }
        if (COUNT==0)
            System.out.println(0);
        else
            System.out.println(S/COUNT);
    }
}
