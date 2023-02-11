import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptDecryptTest {

    @Test
    void randomCipherAlphabetIndexForElement() {
    }

    @Test
    void getCharIndex() {
        final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        assertEquals(23, encryptDecrypt.getCharIndex('x'));
    }

    @Test
    void getEncryptedChar() {
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        char[] arr = new char[]{'C',
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
                'Y'};
        assertEquals('C', encryptDecrypt.getEncryptedChar(arr, 0));
    }


    @Test
    void getReplacingCharacter() {
    }

    @Test
    void encrypt() {
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
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
        //assertEquals("abcw", encryptDecrypt.encrypt(A, "metqasz"));
    }
}