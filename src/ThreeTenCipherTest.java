import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ThreeTenCipherTest {

    @Test
    void getStorageCapacity() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        assertEquals(100, threeTenCipher.getStorageCapacity());
    }

    @Test
    void getSize() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        assertEquals(0, threeTenCipher.getSize());
    }

    @Test
    void isEmpty() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        assertTrue(threeTenCipher.isEmpty());
    }

    @Test
    void isFull() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        assertFalse(threeTenCipher.isFull());
    }

    @Test
    void setCipherText() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        threeTenCipher.setCipherText("Practice makes perfect!");
        assertEquals("Practice makes perfect!", threeTenCipher.getCipherText());
    }

    @Test
    void getCipherText() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        assertEquals("", threeTenCipher.getCipherText());

    }

    @Test
    void setPlainText() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        threeTenCipher.setPlainText("Ho Ngoc Ha");
        assertEquals("Ho Ngoc Ha", threeTenCipher.getPlainText());
    }

    @Test
    void getPlainText() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");
        assertEquals("Phuc", threeTenCipher.getPlainText());
    }

    @Test
    void setKeys() {
        ThreeTenCipher.plainText = "123456789";
        char[][] givenKeys = new char[][]{
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

        char[][] newKeys = new char[][]{
                {
                        'K',
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
        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, "Phuc");

        assertTrue(Arrays.deepEquals(newKeys,threeTenCipher.setKeys(newKeys,1)));

    }
}