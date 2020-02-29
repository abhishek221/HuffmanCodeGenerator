/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase)
    {

        this.userInputStringInLowerCase = userInputStringInLowerCase;

    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase)
    {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToBinaryString()
    {

        char[] characterArray = userInputStringInLowerCase.toCharArray();

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <userInputStringInLowerCase.length() ; i++)
        {
            if(characterArray[i]==' ')
            {
                sb= sb.append("01000000 ");
            }
            else {
                int ascii = characterArray[i];

                String binaryString = Integer.toBinaryString(ascii);
                int length = binaryString.length();
                int remainingBits = 8 - length;
                String missingZeroes = "0".repeat(remainingBits);
                sb=sb.append(missingZeroes + binaryString + " ");

            }

        }
        String str = sb.toString();
        return str;

    }
}
