/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Assemany
 */
public class AppCtr {
    public static void main (String ars[])
    {
        for (int i = 1; i<= 100; i++)
        {
            //verify if the number is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("StwAndo");
            }
            else
                //verify if the number is divisible by 3 but not by 5
                if (i % 3 == 0 && i % 5 != 0)
                {
                    System.out.println("Stw");
                }
                else
                    //verify if the number is divisible by 5
                    if (i % 5 == 0)
                    {
                        System.out.println("Ando");
                    }
                    //if the number is not divisible by 5 or by 3
                    else
                        System.out.println(i);
        }
    }
}