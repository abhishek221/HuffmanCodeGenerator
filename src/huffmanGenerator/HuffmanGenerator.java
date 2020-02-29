/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package huffmanGenerator;

public class HuffmanGenerator {
    private String userInputStringInLowerCase;

    public HuffmanGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToHuffmanString() {
        String[] huffmanCodes = {"1010","100000","00000","10110","010","110011","100010","0001","0110","110001011","11010011","10111","110010","0111","1001","100001","1100001001","0010","0011","1101","00001","1100000","1100010","1100001000","100011","1100001010"};
        char[] characterArray = userInputStringInLowerCase.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <userInputStringInLowerCase.length() ; i++)
        {
            if(characterArray[i]==' ')
            {
                sb = sb.append("111 ");

            }
            else
            {
                int ascii = characterArray[i];
                ascii = ascii - 'a';
                sb= sb.append(huffmanCodes[ascii]+" ");
            }

        }
        String str = sb.toString();
        return str;
    }
}
