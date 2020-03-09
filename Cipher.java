import java.util.ArrayList;

public class Cipher {



    Cipher(String input, ArrayList<Key> keys)
    {

        String output ="";
        for(int i =0; i<input.length(); i++)
        {
            for(int j =0; j<keys.size(); j++)
            {
                if(input.charAt(i) == keys.get(j).getOriginal().charAt(0))
                {
                    Character c = keys.get(j).getSubstitution().charAt(1);
                    output = output.concat(c.toString());
                }
            }

        }


        System.out.println("Ciphered text: "+output);
    }
}
