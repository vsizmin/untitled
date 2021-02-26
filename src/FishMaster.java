public class FishMaster {
    public static void main(String[] args){
        String FishReaction;
        Fish myFish=new Fish();
        myFish.dive(2);
        myFish.dive(3);
        FishReaction=myFish.say("Привет");
        System.out.println(FishReaction);
        myFish.sleep();
        }
    }

