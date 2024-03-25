package seedu.duke;

import seedu.duke.exceptions.FlirtForkException;

public class GenerateGiftCommand extends Command {
    @Override
    public void execute(FavouritesList favourites, FoodList foods, ActivityList activities, Ui ui,
                        Storage storage, UserDetails userDetails, GiftList gifts) throws FlirtForkException {
        String userSatisfied;

        do {
            Gift gift = gifts.getRandomGift();
            System.out.println(gift);
            System.out.println("Satisfied with the date idea? [Yes/No]");
            userSatisfied = ui.readCommand().toLowerCase();
            if (userSatisfied.equals("yes")) {
                System.out.println("");
                gift.markComplete();
                break;
            } else {
                System.out.println("");
            }
        } while (true);

        storage.saveGift(gifts);
    }
}
