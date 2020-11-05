package diapositivasJf_6_1;

public class BouquetArrays {

        public static void main(String[] args){
            String[] myBouquet = {"Rose","Sunflower","Daisy",
                    "Dandelion","Violet", "Lily"};
//use a for loop to iterate through the array
            for(int index = 0; index < myBouquet.length; index++){
                System.out.println(myBouquet[index]);
            }

            System.out.println();

//use a for each to iterate through the array
            for (String myFlower : myBouquet){
                System.out.println(myFlower);
            }
        }
    }

