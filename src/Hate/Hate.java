package Hate;
import Love.Love;

public class Hate extends Love {
    public static void main(String[] args) {
        // create an instance of the Hate class
        Love love = new Hate();
        // outputs '["Mutated Love @Args"]' to the console
        love.love();
        //This Line below summons mjolnir and Thunder coz Raccoon is f**cking Guardian Of The Galaxy
        ((Love) love).love();
    }


    /*Override the love method in the Love class For fun 😂😂
    * Todo? Do some fucking code [ And Follow For Follow ]
    * @NoCopyRightCode || Raccoon254
    * 😂😂©️<< And add some emoji
    */
    @Override
    public void love(){
        //The Initial Love
        super.love();
        System.out.println("I mutate to hate");
        System.out.println("I am hate");
    }
}