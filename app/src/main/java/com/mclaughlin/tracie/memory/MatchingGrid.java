package com.mclaughlin.tracie.memory;

public class MatchingGrid {


        public static enum Animal {
            CAT, PIG, COW, DOG, CHICKEN, HORSE, ROOSTER, SHEEP
        }

        public static Animal getRandomAnimal(){
                // Turn Animal into an array and randomly select a value to return
                return Animal.values()[(int) (Math.random() * Animal.values().length)];
        }

        public static int AssignImage(Animal animal){
                switch (animal) {
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
                        return R.drawable.ic_launcher;
                }
        }
}
