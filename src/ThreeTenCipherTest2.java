/**
 * @author maha
 */
public class ThreeTenCipherTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        char A[][] = new char[][]{
                {
                        'C',
                        'X',
                        'Q',
                        'Z',
                        'V',
                        'T',
                        'J',
                        'U',
                        'W',
                        'R',
                        'B',
                        'H',
                        'F',
                        'N',
                        'O',
                        'S',
                        'K',
                        'L',
                        'D',
                        'P',
                        'G',
                        'E',
                        'M',
                        'A',
                        'I',
                        'Y'
                }, {
                'P',
                'S',
                'O',
                'M',
                'F',
                'E',
                'T',
                'Q',
                'W',
                'A',
                'J',
                'V',
                'L',
                'D',
                'I',
                'H',
                'R',
                'C',
                'X',
                'B',
                'G',
                'N',
                'Z',
                'K',
                'Y',
                'U'
        }, {
                'A',
                'U',
                'B',
                'M',
                'K',
                'W',
                'R',
                'N',
                'S',
                'L',
                'F',
                'C',
                'T',
                'Z',
                'D',
                'X',
                'E',
                'J',
                'Q',
                'O',
                'V',
                'Y',
                'I',
                'G',
                'P',
                'H'
        }, {
                'G',
                'O',
                'Z',
                'T',
                'M',
                'R',
                'N',
                'K',
                'U',
                'H',
                'J',
                'X',
                'B',
                'V',
                'W',
                'C',
                'I',
                'Y',
                'L',
                'F',
                'S',
                'A',
                'E',
                'D',
                'Q',
                'P'
        }, {
                'W',
                'F',
                'Z',
                'Y',
                'H',
                'U',
                'I',
                'A',
                'B',
                'T',
                'D',
                'X',
                'R',
                'E',
                'C',
                'L',
                'Q',
                'O',
                'P',
                'K',
                'M',
                'J',
                'N',
                'S',
                'V',
                'G'
        }
        };

        // create keys
        // create plainText
        String text1 = new String("Hello 310 students");

        // create objects for ThreeTenCipher and EncryptDecrypt classes
        //ThreeTenCipher P1 = new ThreeTenCipher();
        EncryptDecrypt EncDec = new EncryptDecrypt();

        // set plainText and keys to ThreeTenCipher object
        //P1.setPlainText(text1);
        //P1.setKeys(A, text1.length());


        // Encrypt plainText to get cipherText
        //EncDec.encrypt();

        // assign decrypt string to an instance variable
        String text2 = EncDec.decrypt();

        // compare plainText and decrypt string
        if (text1.equals(text2))
            System.out.println("Yay");

        // create more testers for textArchive of ThreeTenCipher

    }
}