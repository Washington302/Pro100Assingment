package Pro100;

import Pro100.Enums.Background;

public class Main {

    public static void main(String[] args) {
        boolean cheese = true;

	// write your code here
        //Hello partay people
        //hello
        //dis be on my branch?

        //testing that the background works
        Background background;

        for(int i = 0; i < 10; i++) {
            background = Background.randomizeBackground();
            System.out.println((i + 1) + "). " + background);
        }
    }
}
