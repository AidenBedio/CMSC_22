package mp1;

////////////////////////////////////////////////////////////////////////////////////////////////////////(c)BedioProgramming///////
//////////////////////////////////////////////////////////////////////////////////////////////////////////8/24/16////////////lol//

import java.util.Scanner;

public class BedioMP1 
{
    
    public static int Config(int Sequence[], int index)
    {
       // looks very inefficient, actually is very inefficient but is traded for reusability. Can easily change between rules to use.
        int Filled = 1;
        int UnFilled = 0;
        
        //reprogrammable combinations
        
        //Combination # 1
        if (Sequence[index - 1] == Filled)
            if (Sequence[index] == Filled)
                if(Sequence[index + 1] == Filled)
                    return Filled;

        //Combination # 2
        if (Sequence[index - 1] == Filled)
                if (Sequence[index] == Filled)
                    if(Sequence[index + 1] == UnFilled)
                        return UnFilled;

        //Combination # 3
        if (Sequence[index - 1] == Filled)
                if (Sequence[index] == UnFilled)
                    if(Sequence[index + 1] == Filled)
                        return UnFilled;

        //Combination # 4
        if (Sequence[index - 1] == Filled)
                if (Sequence[index] == UnFilled)
                    if(Sequence[index + 1] == UnFilled)
                        return Filled;

        //Combination # 5
        if (Sequence[index - 1] == UnFilled)
                if (Sequence[index] == Filled)
                    if(Sequence[index + 1] == Filled)
                        return Filled;

        //Combination # 6
        if (Sequence[index - 1] == UnFilled)
                if (Sequence[index] == Filled)
                    if(Sequence[index + 1] == UnFilled)
                        return Filled;

        //Combination # 7
        if (Sequence[index - 1] == UnFilled)
                if (Sequence[index] == UnFilled)
                    if(Sequence[index + 1] == Filled)
                        return Filled;

        //Combination # 8 
        if (Sequence[index - 1] == UnFilled)
                if (Sequence[index] == UnFilled)
                    if(Sequence[index + 1] == UnFilled)
                        return UnFilled;
       
        return 0;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("MP RULE 30\n\n\n Please Enter Number of Generations: ");
        
        int Generation = scan.nextInt();
        int size = Generation + 2;
        int i;
        
        int Sequence[] = new int[size];
        int NextSeq[] = new int[size];
        
        System.out.println (Generation);
        System.out.println (size);
        
        Sequence[size / 2] = 1; // set middle to filled
        
        for (i = 1; i < size-1; i++)
        {
            if (Sequence[i] == 1)
                System.out.print ("A");
            else
                System.out.print ("~");
        }
        
        System.out.println();
        
        for (i = 1; i < size - 1; i++)
        {
            for (int j = 1; j < size - 1; j++)
            {
                NextSeq[j] = Config (Sequence, j);
                
                if (NextSeq[j] == 1)
                    System.out.print ("A");
                else
                System.out.print ("~");
            }
            
            System.out.println();
            
            for (int x = 0; x < size; x++)
            {
                Sequence[x] = NextSeq[x];
            } 
        }    
    }  
}


// shout out to stack overflow.