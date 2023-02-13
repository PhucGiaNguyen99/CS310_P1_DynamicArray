public class Draft {
    public static void main(String[] args) {
        char[] charArr = new char[10];
        charArr[0] = 'c';
        charArr[1] = 'd';
        charArr[3] = 'e';
        charArr[5] = 'f';
        charArr[6] = 'g';

        charArr[0] = '\0';

        // print out char array
        for (char c : charArr) {
            System.out.println(c);
        }
    }
}
