package J_String;

public class StringMethods {
        /*
            toUpperCase()
            toLowerCase()
            trim()
            startsWith()
            endsWith()
            equals()
            equalsIgnoreCase()
            charAt()
            valueOf()
            replace()
            contains()
            substring()
            split()
            toCharArray()
            isEmpty()
         */

    public static void main(String[] args) {

        String name = "palash";

        System.out.println("name = \"palash\"\nname.toUpperCase() : "+name.toUpperCase());

        name = name.toUpperCase();
        System.out.println("name = name.toUpperCase() : "+name);
        System.out.println("name.toLowerCase() : "+name.toLowerCase());
        System.out.println("name : "+name);

        String spaceName = "         rohan          ";

        System.out.println(spaceName.trim());

        System.out.println(name);

        System.out.println("Carpet".startsWith("Car")); // true
        System.out.println("Carpet".startsWith("Bike")); // false
        System.out.println("Carpet".endsWith("pet")); // false
        System.out.println("Carpet".endsWith("pe")); // false

        System.out.println("Carpet".equals("Carpet"));
        System.out.println("Carpet".charAt(3)); // p

        char r = name.charAt(1); // A
        System.out.println(r);



        int age = 21;
        String stringAge = String.valueOf(age);// imp

        System.out.println(age);
        age = 23;
        System.out.println(age+1);


        System.out.println(stringAge.getClass());
        System.out.println(stringAge+1);

        String sentence = "I love Java it is an amazing language ";

        System.out.println(sentence);

        String newSentence = sentence.replace("Java","CPP");
        System.out.println(newSentence);

        System.out.println(sentence.contains("CPP"));//imp
        System.out.println(sentence.contains("Java"));

        // first index inclusive second is exclusive
        String subString = sentence.substring(2,6);
        System.out.println(subString);

        subString = sentence.substring(7);
        System.out.println(subString);

        String words[] = sentence.split(" ");// imp

      for(String word : words){
         System.out.println(word);
      }

      int i = 10;
        System.out.println(((Object)i).getClass().getSimpleName());

      short s = 4;

        System.out.println(((Object)s).getClass().getSimpleName());

        String color = "Brown";
        System.out.println(color.getClass().getSimpleName());

      char letters[] = color.toCharArray(); //imp

        System.out.println(letters.getClass().getSimpleName());
        System.out.println(letters);

        for(char letter : letters){
          System.out.println(letter);
        }


      //String animal = " "; // false
      String animal = ""; // true

      if(animal.isEmpty()){
        System.out.println("String is empty");
      }

      // isBlank() also true on whitespaces

      animal = "   ";

      if(animal.isBlank()){
        System.out.println("String is empty");
      }

    }
}
