import java.util.ArrayList;

public class DeCipher {


    DeCipher(String input, ArrayList<Key> keys)
    {
        String output = "";
        for(int i =0; i < input.length(); i++)
        {
            for(int j =0; j < keys.size(); j++)
            {
                if(input.charAt(i) == keys.get(j).getSubstitution().charAt(1))
                {
                    output = output.concat(keys.get(j).getOriginal());
                }
            }

        }
        System.out.println("Deciphered text: "+ output);


    }


}
