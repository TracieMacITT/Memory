package com.mclaughlin.tracie.memory;

import java.util.Random;

public class MatchingGrid {


        public static enum Animal {
            CAT, PIG, COW, DOG, CHICKEN, HORSE, ROOSTER, SHEEP
        }

        public static Animal getRandomAnimal(){
                // Turn Animal into an array and ranomly select a value to return
                return Animal.values()[(int) (Math.random() * Animal.values().length)];
        }
        public static int AssignImage(Animal animal){
//                Animal.CAT.equals(R.drawable.cat);
//                Animal.PIG.equals(R.drawable.pig);
//                Animal.COW.equals(R.drawable.cow);
//                Animal.DOG.equals(R.drawable.dog);
//                Animal.CHICKEN.equals(R.drawable.chicken);
//                Animal.HORSE.equals(R.drawable.horse);
//                Animal.ROOSTER.equals(R.drawable.rooster);
//                Animal.SHEEP.equals(R.drawable.sheep);
                //Animal animal = null;
                switch (animal){
                        case CAT:
                                return R.drawable.cat;

                        case PIG:
                                return R.drawable.pig;
                        case COW:
                                return R.drawable.cow;
                        case DOG:
                                return R.drawable.dog;
                        case CHICKEN:
                                return R.drawable.chicken;
                        case HORSE:
                                return R.drawable.horse;
                        case ROOSTER:
                                return R.drawable.rooster;
                        case SHEEP:
                                return R.drawable.sheep;
                        default:

                                break;
                }
        return 0 ;
        }
}
