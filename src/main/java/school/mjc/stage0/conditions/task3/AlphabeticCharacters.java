package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(((int)character >= 65 && (int)character <=90) && ((int)character == 65 || (int)character == 69 || (int)character == 73 || (int)character == 79 || (int)character == 85)){
                //|| ((int)symbol >=97 && (int)symbol <=122)){
            System.out.println("Vowel");
        }
        else if(((int)character >= 97 && (int)character <=122) && ((int)character == 97 || (int)character == 101 || (int)character == 105 || (int)character == 111 || (int)character == 117)){
            System.out.println("Consonant");
        }
        else{
            System.out.println("wrong alphabet!");
        }
    }
}
