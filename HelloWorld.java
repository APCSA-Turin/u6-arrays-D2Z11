class HelloWorld {
    public static void main(String[] args) {
        // 1
        int[] heights = new int[3];
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }
        heights[0] = 78; heights[1] = 72; heights[2] = 69;
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }
        // 2
        boolean[] bools = new boolean[6];
        for (int i = 0; i < bools.length; i += 2) {
            bools[i] = true;
        }
        for (int i = 1; i < bools.length; i += 2) {
            bools[i] = false;
        }
        bools[0] = bools[3];
        System.out.println(bools.length);
        System.out.println(bools[0]);
        System.out.println(bools[5]);

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[2];
        alphabeticalNames[2] = alphabeticalNames[1];
        alphabeticalNames[1] = temp;
        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};

        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        String[] animals = new String[4];
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        animals[0] = "dog"; animals[1] = "camel"; animals[2] = "aardvark"; animals[3] = "bunny";
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        // System.out.println(animals[4]);
        System.out.println(animals[3]);

        animals[2] = animals[2] + "s";
        System.out.println(animals[2]);
        System.out.println(animals.length);
        System.out.println(animals[2].length());

        Dog sparky = new Dog("Sparky", 4);
        Dog toby = new Dog("Toby", 7);
        Dog fiona = new Dog("Fiona", 12);
        Dog[] dogs = {sparky, toby, fiona};
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName());
        }
    }
}

