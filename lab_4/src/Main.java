import Creatures.*;
import Creatures.Skills.Emotion;
import Exceptions.Cheched.HumanNameException;
import Exceptions.Unchecked.NoLocationException;
import Food.*;
import Place.*;
import Things.Thing;

public class Main {
    public static void main(String[] args) throws HumanNameException {

        try {
            Animal piglet = new Animal("Пятачок", 13);
            Animal winnieThePooh = new Animal("Винни-Пух", 13);
            Animal all = new Animal("все", 1);
            Kenga kenga = new Kenga("Кенга", 40);
            Tigra tigra = new Tigra("Тигра", 30);
            Ru ru = new Ru("Ру", 7);
            Rabbit rabbit = new Rabbit("Кролик", 16);
            Human christopherRobin = new Human("Кристофер Робин", 12);

            String[] christopherName = christopherRobin.getName().split(" ");
            if (christopherName.length != 2)
                throw new HumanNameException();


            Food fishOil = new Food("Рыбий жир", 1000);
            Food kasha = new Food("Каша", 100);

            Thing spoon = new Thing("ложка");
            Thing jar = new Thing("банка");

            Tigra.Eyes tigraEyes = tigra.new Eyes();

            tigra.climbInto(jar);
            tigra.search(true, new Thing("вещи"));
            tigra.search(false, new Thing("в буфете еду"));
            tigra.search(true, new Thing("все"));
            tigra.canEat(false, new Food("ничего", 0));
            tigra.say("\"Что я могу съесть, Кенга?\"");
            System.out.print(kenga.getName() + ", " + christopherRobin.getName() + ", ");
            piglet.stand("около Крошки Ру");
            ru.say("\"Можно я не буду есть рыбий жир?\"");
            kenga.say("\"Ну-ну, милый Ру, вспомни, что ты мне обещал.\"");
            tigra.walk("поближе");
            tigra.toEat(fishOil);
            kenga.say("Ох!...");
            kenga.get(spoon);
            Food.FoodQuantityControl foodQuantityControl = new Food.FoodQuantityControl();
            foodQuantityControl.isOver(fishOil.getName());
            tigraEyes.lookAt("потолок");
            tigraEyes.openClose(false);
            tigra.licks();
            tigra.setEmotion(Emotion.SMILE);
            System.out.println(tigra.expressEmotion());
            ru.setEmotion(Emotion.NOTSURPRISED);
            tigra.say(ru.expressEmotion());

            Place place = new Place(Location.KENGAHOUSE);
            System.out.println(tigra.toLive(place));

            TimeToEat breakfast = new TimeToEat(Times.BREAKFAST);
            TimeToEat lunch = new TimeToEat(Times.LUNCH);
            TimeToEat dinner = new TimeToEat(Times.DINNER);
            TimeToEat sometimes = new TimeToEat(Times.SOMETIMES);

            tigra.toEat(fishOil, breakfast, lunch, dinner);
            ru.toEat(kasha, breakfast);
            kenga.think(tigra.getName());
            tigra.toEat(kasha, sometimes);

            rabbit.beBusy("сегодня");
            Rabbit.Eyes rabbitsEyes = rabbit.new Eyes();
            rabbitsEyes.openClose(true);
            rabbit.writeLetter();
            rabbit.check(" все");
            rabbit.getClear(" все");
            rabbit.makeClear(" все");
            rabbit.organise("что-то");
            rabbit.walk("к " + winnieThePooh.getName());
            rabbit.say("\"Ну что ж, отлично, тогда я передам Пятачку\"");
            rabbit.walk("к " + piglet.getName());
            rabbit.say("\"Пух считает... Но лучше я сначала загляну к Сове\"");
            all.say("\"Да, Кролик\", \"Хорошо, Кролик\", \"Будет исполнено, Кролик\"");
            rabbit.walk("из дома");
        } catch (HumanNameException humanNameException) {
            System.out.println("Имя человека должно состоять из двух слов.");
        } catch (NoLocationException e) {
            throw new NoLocationException(e);
        }

    }
}